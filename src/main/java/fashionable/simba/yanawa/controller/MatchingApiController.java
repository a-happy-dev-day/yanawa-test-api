package fashionable.simba.yanawa.controller;

import fashionable.simba.yanawa.constant.GenderType;
import fashionable.simba.yanawa.constant.PreferenceType;
import fashionable.simba.yanawa.constant.StatusType;
import fashionable.simba.yanawa.dto.MatchingDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("v1")
public class MatchingApiController {

    private static final MatchingDto TEST_DTO = new MatchingDto.Builder(UUID.randomUUID())
        .courtId(UUID.randomUUID())
        .startDate(LocalDateTime.now().plusDays(10L))
        .endDate(LocalDateTime.now().plusDays(10L).plusHours(4L))
        .annual(1)
        .minimumLevel(2.5)
        .maximumLevel(3.5)
        .ageOfRecruitment(1)
        .sexOfRecruitment(GenderType.FEMALE)
        .preferenceGame(PreferenceType.MATCHING)
        .numberOfNumber(4)
        .costOfCourtPerPerson(1.0)
        .details("안녕하세요. 잘부탁드립니다.")
        .status(StatusType.ONGOING)
        .hostId(UUID.randomUUID())
        .build();

    @PostMapping(value = "api/matchings",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
    public MatchingDto save(@RequestBody MatchingDto dto) {
        return dto;
    }

    @GetMapping(value = "api/matchings",
        produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MatchingDto> findAll() {
        List<MatchingDto> matchingDtos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            matchingDtos.add(TEST_DTO);
        }

        return matchingDtos;
    }

    @GetMapping(value = "api/matchings/{matchingId}",
        produces = MediaType.APPLICATION_JSON_VALUE)
    public MatchingDto findOne(@PathVariable UUID matchingId) {
        return TEST_DTO;
    }
}
