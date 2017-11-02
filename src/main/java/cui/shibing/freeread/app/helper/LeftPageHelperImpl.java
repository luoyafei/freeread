package cui.shibing.freeread.app.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import cui.shibing.freeread.model.NovelHead;
import cui.shibing.freeread.service.NovelHeadService;

@Component
public class LeftPageHelperImpl implements LeftPageHelper{
	private static final int POPULARITY_NUM = 20;//左侧栏排行榜最大数量
	@Autowired
	private NovelHeadService novelHeadService;
	
	public void generateLeftPage(Model model) {
		Pageable pageable = new CustomPageable(1, POPULARITY_NUM);
		Page<NovelHead> leftPopularityNovels = novelHeadService.searchByPopularity(pageable);
		model.addAttribute("leftPopularityNovels", leftPopularityNovels.getContent());
	}
	
}
