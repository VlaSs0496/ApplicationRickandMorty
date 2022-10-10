package appRickandMorty.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.CoreMatchers.*;

@SpringBootTest
class ApplicationRickandMortyApplicationTests {
	@Test
	void contextLoads() {
		String someone = "World";

		assertThat(someone).isEqualTo(someone);
	}

}
