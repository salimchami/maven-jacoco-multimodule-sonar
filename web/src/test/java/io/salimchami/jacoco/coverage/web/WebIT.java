package io.salimchami.jacoco.coverage.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class WebIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void integrationTest() throws Exception {
        mockMvc.perform(get("/api/web"))
                .andExpect(status().isOk())
                .andExpect(content().string("oh yeah ! it works !"));
    }
}
