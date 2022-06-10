package fashionable.simba.yanawa.repository.matchings;

import fashionable.simba.yanawa.controller.dto.MatchingDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MatchingsRepository {
    MatchingDto save(MatchingDto dto);
    Optional<MatchingDto> findById(UUID matchingId);
    List<MatchingDto> findAll();
}
