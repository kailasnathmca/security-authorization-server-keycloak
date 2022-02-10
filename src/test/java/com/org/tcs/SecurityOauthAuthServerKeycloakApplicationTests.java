package com.org.tcs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = { SecurityOauthAuthServerKeycloakApplication.class })
class SecurityOauthAuthServerKeycloakApplicationTests {

	@Test
	void contextLoads() {
	}

}
