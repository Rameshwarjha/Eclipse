package springmvc3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	//mapping the home
	@RequestMapping("/home")
	public String home() {
		
		return "new";
	}

}
