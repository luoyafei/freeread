package cui.shibing.freeread.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cui.shibing.freeread.app.helper.HeaderHelper;

@Controller
public class IndexController {
	
	@Autowired
	private HeaderHelper headerHelper;
	
	@RequestMapping("/")
	public String index(Model model) {
		headerHelper.setNovelClasses(model);
		return "body.page";
	}
}
