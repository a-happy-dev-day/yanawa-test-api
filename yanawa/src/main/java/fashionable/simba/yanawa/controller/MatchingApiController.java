package fashionable.simba.yanawa.controller;

import fashionable.simba.yanawa.controller.dto.MatchingDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class MatchingApiController {

    @PostMapping("api/matchings")
    public MatchingDto save(@RequestBody MatchingDto dto) {
        return dto;
    }

    @GetMapping("api/matchings")
    public List<MatchingDto> findAll() {
        MatchingDto matchingDto = new MatchingDto.Builder(UUID.randomUUID())
            .annual(1)
            .ageOfRecruitment(1)
            .costOfCourtPerPerson(1.0)
            .details("안녕하세요. 잘부탁드립니다.").build();

        List<MatchingDto> matchingDtos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            matchingDtos.add(matchingDto);
        }

        return matchingDtos;
    }

    @GetMapping("api/matchings/{matchingId}")
    public MatchingDto findOne(@PathVariable UUID matchingId) {
        return new MatchingDto.Builder(matchingId)
            .annual(1)
            .ageOfRecruitment(1)
            .costOfCourtPerPerson(1.0)
            .details("안녕하세요. 잘부탁드립니다.").build();
    }
}
