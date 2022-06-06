package fashionable.simba.yanawa.controller;

import fashionable.simba.yanawa.controller.dto.MatchingDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MatchingApiController {

//    @ModelAttribute("matchingDtos")
//    public List<MatchingDto> matchingDtoList() {
//        MatchingDto matchingDto = new MatchingDto.Builder(0L)
//                .courtId(0L).annula(1).ageOfRecruitment(1).build();
//        ArrayList<MatchingDto> list = new ArrayList<>();
//        list.add(matchingDto);
//        return list;
//    }
//    @GetMapping("api/matchings")
//    public List<MatchingDto> readAll() {
//
//    }
    @GetMapping("api/matchings/{matchingsId}")
    public MatchingDto read(@RequestParam("id") Long matchingId) {
        return new MatchingDto.Builder(matchingId).build();
    }

}
