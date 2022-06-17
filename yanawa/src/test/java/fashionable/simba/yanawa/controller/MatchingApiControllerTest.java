package fashionable.simba.yanawa.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import fashionable.simba.yanawa.controller.dto.MatchingDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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
    void test1() throws Exception{
        //given
        MatchingDto info = new MatchingDto.Builder(UUID.randomUUID())
                .details("hi").build();
        //when
        mockMvc.perform(
                post("/api/matchings")
                        .content(objectMapper.writeValueAsString(info))
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    @DisplayName("목록을 가져오기위해 GET요청을 한다.")
    void test2() throws Exception{
        mockMvc.perform(
                get("/api/matchings"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    @DisplayName("매칭을 조회하기위해 값을 가져온다.")
    void test3() throws Exception{
        //given
        UUID searchId = UUID.randomUUID();
        //then
        mockMvc.perform(
                get("/api/matchings",1L)
        )
                .andExpect(status().isOk()).andDo(print());
    }


}
