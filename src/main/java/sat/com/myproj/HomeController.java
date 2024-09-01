package sat.com.myproj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String goHome() {
		return "home";
	}
	
	@RequestMapping("/test")
	public String goTest() {
		return "tester";
	}
	
	@RequestMapping("/harmeet")
	public String retTest() {
		return "Welcome to Jenkins based service";
	}
}
