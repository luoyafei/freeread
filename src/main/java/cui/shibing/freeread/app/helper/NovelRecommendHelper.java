package cui.shibing.freeread.app.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import cui.shibing.freeread.model.NovelHead;
import cui.shibing.freeread.service.NovelHeadService;

@Component
public class NovelRecommendHelper {
	private static final String PAGE = "main/recommend";
	@Autowired
	private NovelHeadService novelHeadService;

	public void setData(Model model,Pageable pageable) {
		if(pageable == null) {
			pageable = new CustomPageable(1, 20);
		}
		Page<NovelHead> recommendNovels = novelHeadService.searchByPopularity(pageable);
		model.addAttribute("recommendNovels",recommendNovels.getContent());
	}

	public String getPage() {
		return PAGE;
	}
}
