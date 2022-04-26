package top.naccl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.naccl.config.properties.BlogProperties;

@SpringBootTest
class BlogApiApplicationTests {

	@Autowired
	private BlogProperties blogProperties;

	@Test
	void contextLoads() {
	}

	@Test
	void test() {
		System.out.println(blogProperties.getApi());
	}

}
