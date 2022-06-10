package fashionable.simba.yanawa.repository.matchings;

import fashionable.simba.yanawa.controller.dto.MatchingDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class MatchingsRepositoryMemory implements MatchingsRepository {
    private static ArrayList<MatchingDto> store = new ArrayList<>();

    @Override
    public MatchingDto save(MatchingDto dto) {
        store.add(dto);
        return dto;
    }

    @Override
    public Optional<MatchingDto> findById(UUID matchingId) {
        return store.stream()
                .filter(matching -> matching.getMatchingId().equals(matchingId))
                .findAny();
    }

    @Override
    public List<MatchingDto> findAll() {
        return store;
    }
}
