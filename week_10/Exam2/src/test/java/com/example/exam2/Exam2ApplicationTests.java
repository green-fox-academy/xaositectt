package com.example.exam2;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.example.exam2.models.Product;
import java.util.ArrayList;
import java.util.List;
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
@SpringBootTest(classes = Exam2Application.class)
@WebAppConfiguration
@EnableWebMvc
public class Exam2ApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void test1() throws Exception {

		List<String> result = new ArrayList<>();

		mockMvc.perform(get("/shoppingplanner/query?price=30&type=lower"))
				.andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(jsonPath("$.result", is("ok")))
				.andExpect(jsonPath("$.clothes", is(result)));
	}

	@Test
	public void test2() throws Exception {

//		"id": 16,
//				"itemName": "Strecth Steamed Pencil Skirt",
//				"manufacturer": "Calvin Klein",
//				"category": "skirts",
//				"size": "s",
//				"unitPrice": 39
//	},
//	{
//		"id": 18,
//			"itemName": "Strecth Steamed Pencil Skirt",
//			"manufacturer": "Calvin Klein",
//			"category": "skirts",
//			"size": "m",
//			"unitPrice": 39
//	}


		List<Product> result = new ArrayList<>();
		Product product1 = new Product(16, "Strecth Steamed Pencil Skirt",
				"Calvin Klein", "skirts", "s", 39 );
		Product product2 = new Product(18, "Strecth Steamed Pencil Skirt",
				"Calvin Klein", "skirts", "m", 39 );
		result.add(product1);
		result.add(product1);

		mockMvc.perform(get("/shoppingplanner/query?price=40&type=lower"))
				.andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(jsonPath("$.result", is("ok")))
				//.andExpect(jsonPath("$.clothes[0].manufacturer", is("Calvin Klein")));
        .andExpect(jsonPath("$.clothes", is(result)));
	}

}
