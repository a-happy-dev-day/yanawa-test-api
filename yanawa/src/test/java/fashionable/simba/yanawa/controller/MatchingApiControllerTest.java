package fashionable.simba.yanawa.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MatchingApiController.class)
class MatchingApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("매칭 생성 테스트")
    void test1() throws Exception {
        //given
        String matchingJson = "{\"matchingId\":\"2cc2a1de-b6d2-4416-828c-4c2db217c7f4\"," +
            "\"courtId\":\"8ba02307-3eae-4cfb-8e6f-59dd4d60ab75\"," +
            "\"startDate\":\"2022-06-29T18:50:00\"," +
            "\"endDate\":\"2022-06-29T22:50:00\"," +
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
        mockMvc.perform(post("/api/matchings")
                .content(matchingJson)
                .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andDo(print());
    }

    @Test
    @DisplayName("매칭 목록 조회 테스트")
    void test2() throws Exception {
        mockMvc.perform(
                get("/api/matchings"))
            .andExpect(status().isOk())
            .andDo(print());
    }

    @Test
    @DisplayName("매칭 조회 테스트")
    void test3() throws Exception {
        //given
        UUID searchId = UUID.randomUUID();
        //then
        mockMvc.perform(get("/api/matchings/" + searchId))
            .andExpect(status().isOk())
            .andDo(print());
    }


}
