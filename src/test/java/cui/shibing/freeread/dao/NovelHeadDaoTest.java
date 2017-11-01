package cui.shibing.freeread.dao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import cui.shibing.freeread.CustomDaoTest;
import cui.shibing.freeread.CustomPageable;
import cui.shibing.freeread.model.NovelHead;

public class NovelHeadDaoTest extends CustomDaoTest{
	
	@Autowired
	private NovelHeadMapper novelHeadMapper;
	
	@Test
	public void testInsertNovelHead() {
		NovelHead novelHead = new NovelHead();
		novelHead.setNovelName("novel1");
		novelHead.setNovelContentTableName("abcd");
		novelHead.setNovelContentId(123);
		novelHead.setNovelClass("class1");
		novelHead.setNovelStatus(12);
		novelHead.setNovelChapterNum(123);
		assertTrue(novelHeadMapper.insert(novelHead) == 1);
	}
	
	@Test
	public void testSelectByNameZero() {
		Pageable pageable = new CustomPageable(1,5);
		List<NovelHead> novelHeads = novelHeadMapper.selectByNovelName("aaa", pageable);
		assertTrue(novelHeads.size()==0);
	}
	
	@Test
	public void testSelectByNameOne() {
		Pageable pageable = new CustomPageable(1,5);
		List<NovelHead> novelHeads = novelHeadMapper.selectByNovelName("novel1",pageable);
		assertTrue(novelHeads.size()==1);
	}
	
}
