package fashionable.simba.yanawa.controller;

import fashionable.simba.yanawa.constant.GenderType;
import fashionable.simba.yanawa.constant.PreferenceType;
import fashionable.simba.yanawa.constant.StatusType;
import fashionable.simba.yanawa.dto.MatchingRequest;
import fashionable.simba.yanawa.dto.MatchingResponse;
import fashionable.simba.yanawa.dto.SearchRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("v1")
public class MatchingApiController {

    private static final MatchingResponse TEST_DTO = new MatchingResponse.Builder(UUID.randomUUID())
        .courtName("서울 올림픽대로 경기장")
        .date(LocalDate.now())
        .startTime(LocalTime.now())
        .endTime(LocalTime.now().plusHours(4L))
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
    public ResponseEntity<MatchingResponse> save(@RequestBody MatchingRequest dto) {

        return ResponseEntity.ok(TEST_DTO);
    }

    @GetMapping(value = "api/matchings",
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MatchingResponse>> findAll() {
        List<MatchingResponse> matchingDtos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            matchingDtos.add(TEST_DTO);
        }

        return ResponseEntity.ok(matchingDtos);
    }

    @GetMapping(value = "api/matchings/{matchingId}",
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MatchingResponse> findOne(@PathVariable UUID matchingId) {
        return ResponseEntity.ok(TEST_DTO);
    }

    @PostMapping(value = "api/matchings/search",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MatchingResponse>> search(@RequestBody SearchRequest searchRequest) {
        return ResponseEntity.ok(List.of(TEST_DTO, TEST_DTO));
    }
}
