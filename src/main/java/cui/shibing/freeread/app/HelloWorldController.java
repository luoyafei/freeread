package cui.shibing.freeread.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class HelloWorldController {
	
	@RequestMapping("")
	public String index() {
		return "home/index";
	}
	
	@RequestMapping("hello")
	public String helloWorld() {
		return "home/hello";
	}
	
}
