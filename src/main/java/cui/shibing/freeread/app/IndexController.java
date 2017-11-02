package cui.shibing.freeread.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cui.shibing.freeread.app.helper.HeaderPageHelper;
import cui.shibing.freeread.app.helper.LeftPageHelper;
import cui.shibing.freeread.app.helper.PageHeaderHelperImpl;

@Controller
public class IndexController {
	
	@Autowired
	private HeaderPageHelper headerPageHelper;
	
	@Autowired
	private LeftPageHelper leftPageHelper;
	
	@RequestMapping("/")
	public String index(Model model) {
		headerPageHelper.generateHeaderPage(model);
		leftPageHelper.generateLeftPage(model);
		return "home.page";
	}
}
