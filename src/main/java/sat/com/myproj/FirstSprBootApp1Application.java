package sat.com.myproj;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSprBootApp1Application implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(FirstSprBootApp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Harmeets Service is up and running well!");
	}
}
