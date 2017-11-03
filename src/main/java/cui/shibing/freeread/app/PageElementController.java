package cui.shibing.freeread.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cui.shibing.freeread.app.helper.NavigationHelper;
import cui.shibing.freeread.app.helper.NovelRankingHelper;

@Controller
@RequestMapping("pageElement")
public class PageElementController {
	
	@Autowired
	private NavigationHelper navigationHelper;
	
	@Autowired
	private NovelRankingHelper novelRankingHelper;
	
	@RequestMapping("novelRanking")
	public String novelRanking(Model model){
		return novelRankingHelper.generateLeftPage(model);
	}
	
	@RequestMapping("navigation")
	public String navigation(Model model){
		return navigationHelper.generateHeaderPage(model);
	}
}
