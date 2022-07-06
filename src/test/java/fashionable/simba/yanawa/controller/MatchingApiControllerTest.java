package fashionable.simba.yanawa.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import fashionable.simba.yanawa.dto.MatchingDto;
import fashionable.simba.yanawa.dto.SearchRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MatchingApiController.class)
class MatchingApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    @DisplayName("매칭 생성 테스트")
    void test1() throws Exception {
        //given
        String matchingJson = "{\"matchingId\":\"2cc2a1de-b6d2-4416-828c-4c2db217c7f4\"," +
            "\"courtId\":\"8ba02307-3eae-4cfb-8e6f-59dd4d60ab75\"," +
            "\"date\":\"2022-06-29\"," +
            "\"startTime\":\"18:50:00\"," +
            "\"endTime\":\"22:50:00\"," +
            "\"annual\":1," +
            "\"minimumLevel\":2.5," +
            "\"maximumLevel\":3.5," +
            "\"ageOfRecruitment\":1," +
            "\"sexOfRecruitment\":\"FEMALE\"," +
            "\"preferenceGame\":\"MATCHING\"," +
            "\"numberOfNumber\":4," +
            "\"costOfCourtPerPerson\":1.0," +
            "\"details\":\"안녕하세요. 잘부탁드립니다.\"," +
            "\"status\":\"ONGOING\"," +
            "\"hostId\":\"5d28e0b2-822d-49c5-a13e-d6f7bdd83edc\"}";


        //when
        mockMvc.perform(post("/v1/api/matchings")
                .content(matchingJson)
                .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andDo(print());
    }

    @Test
    @DisplayName("매칭 목록 조회 테스트")
    void test2() throws Exception {
        mockMvc.perform(
                get("/v1/api/matchings"))
            .andExpect(status().isOk())
            .andDo(print());
    }

    @Test
    @DisplayName("매칭 조회 테스트")
    void test3() throws Exception {
        //given
        UUID searchId = UUID.randomUUID();
        //then
        mockMvc.perform(get("/v1/api/matchings/" + searchId))
            .andExpect(status().isOk())
            .andDo(print());
    }


    @Test
    @DisplayName("매칭 검색 API 테스트")
    void test4() throws Exception {

        SearchRequest searchRequest = new SearchRequest.Builder()
            .location("서울시 마포구")
            .startDate(LocalDate.now())
            .endDate(LocalDate.now().plusDays(10L))
            .startTime(LocalTime.now())
            .endTime(LocalTime.now().plusHours(8))
            .annual(2).build();

        String requestBody = objectMapper.registerModule(new JavaTimeModule()).writeValueAsString(searchRequest);

        mockMvc.perform(
                post("/v1/api/matchings/search")
                    .content(requestBody)
                    .contentType(MediaType.APPLICATION_JSON)
            ).andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andDo(print());
    }
}
