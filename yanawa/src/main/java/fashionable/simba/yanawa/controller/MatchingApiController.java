package fashionable.simba.yanawa.controller;

import fashionable.simba.yanawa.controller.dto.MatchingDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MatchingApiController {
    @GetMapping("api/matchings")
    public List<MatchingDto> readAll() {
        ArrayList<MatchingDto> list = new ArrayList<>();
        list.add(new MatchingDto.Builder(0L).build());
        return list;
    }
}
