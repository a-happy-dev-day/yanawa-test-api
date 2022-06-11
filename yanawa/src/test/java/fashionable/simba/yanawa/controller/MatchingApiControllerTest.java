package fashionable.simba.yanawa.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import fashionable.simba.yanawa.controller.dto.MatchingDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MatchingApiController.class)
class MatchingApiControllerTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("저장하기 위해 값을 가져온다.")
    void test1() throws Exception {
        MatchingDto info = new MatchingDto.Builder(UUID.randomUUID()).details("hi").courtId(1L).startDate(LocalDateTime.now())
            .endDate(LocalDateTime.now().plusDays(1)).build();

        mockMvc.perform(
                post("/api/matchings")
                    .content(objectMapper.writeValueAsString(info))
            )
            .andExpect(status().isOk())
            .andDo(print());
    }
}
