package fashionable.simba.yanawa;

import fashionable.simba.yanawa.controller.dto.MatchingDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApiTest {
    @Test
    void Dto_생성테스트() {
        Long matchingId = 0L;
        MatchingDto dto = new MatchingDto.Builder(matchingId).courtId(0L).build();
        Assertions.assertEquals(dto.getCourtId(),0L);
    }
//    @Test
//    @DisplayName("매칭을 모집했다.")
//    void Matching_등록된다() throws Exception {
//
//    }


}
