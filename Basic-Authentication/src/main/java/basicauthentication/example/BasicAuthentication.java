package basicauthentication.example;

import basicauthentication.example.dto.CreateUserRequest;
import basicauthentication.example.model.Role;
import basicauthentication.example.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class BasicAuthentication implements CommandLineRunner {

	private final UserService userService;

	public BasicAuthentication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BasicAuthentication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createDummyData();
	}

	private void createDummyData() {
		CreateUserRequest request = CreateUserRequest.builder()
				.name("Burak")
				.username("burakonce")
				.password("1234")
				.authorities(Set.of(Role.ROLE_USER))
				.build();
		userService.createUser(request);

		CreateUserRequest request2 = CreateUserRequest.builder()
				.name("Serdar")
				.username("serdaronce")
				.password("1234")
				.authorities(Set.of(Role.ROLE_SERDAR))
				.build();
		userService.createUser(request2);


		CreateUserRequest request3 = CreateUserRequest.builder()
				.name("Free")
				.username("free")
				.password("1234")
				.authorities(Set.of(Role.ROLE_ADMIN))
				.build();
		userService.createUser(request3);
	}
}
