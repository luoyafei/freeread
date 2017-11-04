package cui.shibing.freeread.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cui.shibing.freeread.app.helper.NavigationHelper;
import cui.shibing.freeread.app.helper.NovelRankingHelper;
import cui.shibing.freeread.app.helper.NovelRecommendHelper;

@Controller
@RequestMapping("pageElement")
public class PageElementController {
	
	@Autowired
	private NavigationHelper navigationHelper;
	
	@Autowired
	private NovelRankingHelper novelRankingHelper;
	
	@Autowired
	private NovelRecommendHelper novelRecommendHelper;
	
	/*
	 * 小说排行榜页面
	 * */
	@RequestMapping("novelRanking")
	public String novelRanking(Model model){
		novelRankingHelper.setData(model);
		return novelRankingHelper.getPage();
	}
	
	/*
	 * 导航栏页面
	 * */
	@RequestMapping("navigation")
	public String navigation(Model model){
		navigationHelper.setData(model);
		return navigationHelper.getPage();
	}
	
	/*
	 * 小说推荐页面
	 * **/
	@RequestMapping("recommend")
	public String recommend(Model model,@PageableDefault(value = 15) Pageable pageable) {
		novelRecommendHelper.setData(model, pageable);
		return novelRecommendHelper.getPage();
	}
	
	/*
	 * 小说详情页面
	 * **/
	@RequestMapping("novelDetail")
	public String novelDetail() {
		return "main/novel_detail";
	}
}
