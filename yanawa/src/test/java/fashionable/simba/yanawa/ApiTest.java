package fashionable.simba.yanawa;

import fashionable.simba.yanawa.controller.dto.MatchingDto;
import fashionable.simba.yanawa.domain.Matching;
import fashionable.simba.yanawa.error.NotValidDateException;
import fashionable.simba.yanawa.repository.matchings.MatchingsRepositoryMemory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

public class ApiTest {
    @Test
    public void 빌더_테스트() {
        // given
        UUID matchingId = UUID.randomUUID();
        // when
        Matching matching = new Matching.Builder(matchingId).build();
        // then
        Assertions.assertEquals(matching.getMatchingId(),matchingId);
    }
    @Test
    public void Matching_등록된다() {
        // given
        UUID matchingId = UUID.randomUUID();
        MatchingsRepositoryMemory matchingsRepositoryMemory = new MatchingsRepositoryMemory();
        // then
        MatchingDto dto = new MatchingDto.Builder(matchingId).build();
        matchingsRepositoryMemory.save(dto);
        // when
        Assertions.assertEquals(dto,matchingsRepositoryMemory.findById(matchingId).get());
    }
    @Test
    @DisplayName("시작 일자는 종료 일자보다 늦으면 NotValidDateException 예외 발생.")
    public void test1() {
        // given
        MatchingsRepositoryMemory matchingsRepositoryMemory = new MatchingsRepositoryMemory();
        UUID matchingId = UUID.randomUUID();
        LocalDateTime startDate = LocalDateTime.of(2022,6,2,0,0,0);
        LocalDateTime endDate = LocalDateTime.of(2022,6,1,0,0,0);
        // then
        MatchingDto dto = new MatchingDto.Builder(matchingId).startDate(startDate).endDate(endDate).build();
        // when
        Assertions.assertThrows(NotValidDateException.class, () -> matchingsRepositoryMemory.save(dto));
    }
}
