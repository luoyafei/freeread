package cui.shibing.freeread.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cui.shibing.freeread.service.NovelClassService;

@Controller("/")
public class IndexController {
	@Autowired
	private NovelClassService novelClassService;
	@RequestMapping("")
	public String index() {
		System.out.println(novelClassService.getAllNovelClass());
		return "body.page";
	}
	
}
