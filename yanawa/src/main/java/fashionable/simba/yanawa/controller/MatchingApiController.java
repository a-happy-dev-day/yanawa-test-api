package fashionable.simba.yanawa.controller;

import fashionable.simba.yanawa.controller.dto.MatchingDto;
import fashionable.simba.yanawa.repository.matchings.MatchingsRepositoryMemory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class MatchingApiController {

    private MatchingsRepositoryMemory matchingsRepositoryMemory;

    @PostMapping("api/matchings/{machingsId}")
    public void save(){

    }

    @GetMapping("api/matchings")
    public List<MatchingDto> readAll() {
        return matchingsRepositoryMemory.findAll();
    }

    @GetMapping("api/matchings/{matchingsId}")
    public MatchingDto readOne(@PathVariable UUID matchingsId) {
        return matchingsRepositoryMemory.findById(matchingsId).get();
    }
}
