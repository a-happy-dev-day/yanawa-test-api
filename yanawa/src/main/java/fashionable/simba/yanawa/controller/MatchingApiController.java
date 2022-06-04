package fashionable.simba.yanawa.controller;

import fashionable.simba.yanawa.controller.dto.MatchingDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class MatchingApiController {

//    @ModelAttribute("matchingDtos")
//    public List<MatchingDto> matchingDtoList() {
//        MatchingDto matchingDto = new MatchingDto.Builder()
//                .courtId();
//        ArrayList<MatchingDto> list = new ArrayList<>();
//        list.add(matchingDto);
//
//    }
//    @GetMapping("api/matchings")
//    public List<MatchingDto> readAll(Long matchingId) {
//
//    }
    @GetMapping("api/matchings/{matchingsId}")
    public MatchingDto read(UUID matchingId) {
        return
    }

}
