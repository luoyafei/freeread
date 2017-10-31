package cui.shibing.freeread.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cui.shibing.freeread.model.NovelHead;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
@Rollback(value= true)
public class NovelHeadDaoTest {
	@Autowired
	private NovelHeadDao novelHeadDao;
	@Test
	public void testInsertNovelHead() {
		NovelHead novelHead = new NovelHead();
		novelHead.setNovelName("test1");
		novelHead.setNovelContentTableName("催士兵");
		novelHead.setNovelContentId(123);
		novelHead.setNovelClass("class1");
		novelHead.setNovelStatus(12);
		novelHead.setNovelChapterNum(123);
	}

}
