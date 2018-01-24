package com.example.firstproject;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FirstprojectApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class FirstprojectApplicationTests {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testDoubleEndpoint() throws Exception {
    mockMvc.perform(get("/doubling?input=15"))
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.received", is(15)))
        .andExpect(jsonPath("$.result", is(30)));
  }

  @Test
  public void testGreeterEndpoint() throws Exception {
    mockMvc.perform(get("/greeter?name=Petike&title=student"))
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
  }

  @Test
  public void testAppendAEndpoint() throws Exception {
    mockMvc.perform(get("/appenda/kuty"))
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.appended", is("kutya")));
  }

  @Test
  public void testDoUntilSumEndpoint() throws Exception {
    mockMvc.perform(
        post("/dountil/sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": 5}")
    )
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        //.andExpect(jsonPath("$.received", is(5)))
        .andExpect(jsonPath("$.result", is(15)));
  }

  @Test
  public void testDoUntilFactorEndpoint() throws Exception {
    mockMvc.perform(
        post("/dountil/sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": 3}")
    )
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        //.andExpect(jsonPath("$.received", is(5)))
        .andExpect(jsonPath("$.result", is(6)));
  }

  @Test
  public void testDoUntilFactorEndpoint() throws Exception {
    mockMvc.perform(
        post("/dountil/sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": 3}")
    )
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        //.andExpect(jsonPath("$.received", is(5)))
        .andExpect(jsonPath("$.result", is(6)));
  }



}
