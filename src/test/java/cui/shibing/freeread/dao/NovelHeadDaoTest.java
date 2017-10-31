package cui.shibing.freeread.dao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cui.shibing.freeread.model.NovelHead;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
@Rollback(value= true)
public class NovelHeadDaoTest {
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
		List<NovelHead> novelHeads = novelHeadMapper.selectByNovleName("aaa", new Pageable() {

			public int getPageNumber() {
				// TODO Auto-generated method stub
				return 0;
			}

			public int getPageSize() {
				// TODO Auto-generated method stub
				return 5;
			}

			public int getOffset() {
				// TODO Auto-generated method stub
				return 0;
			}

			public Sort getSort() {
				// TODO Auto-generated method stub
				return null;
			}

			public Pageable next() {
				// TODO Auto-generated method stub
				return null;
			}

			public Pageable previousOrFirst() {
				// TODO Auto-generated method stub
				return null;
			}

			public Pageable first() {
				// TODO Auto-generated method stub
				return null;
			}

			public boolean hasPrevious() {
				// TODO Auto-generated method stub
				return false;
			}
			
		});
		assertTrue(novelHeads.size()==0);
	}
	
	@Test
	public void testSelectByNameOne() {
		List<NovelHead> novelHeads = novelHeadMapper.selectByNovleName("novel1", new Pageable() {

			public int getPageNumber() {
				// TODO Auto-generated method stub
				return 0;
			}

			public int getPageSize() {
				// TODO Auto-generated method stub
				return 5;
			}

			public int getOffset() {
				// TODO Auto-generated method stub
				return 0;
			}

			public Sort getSort() {
				// TODO Auto-generated method stub
				return null;
			}

			public Pageable next() {
				// TODO Auto-generated method stub
				return null;
			}

			public Pageable previousOrFirst() {
				// TODO Auto-generated method stub
				return null;
			}

			public Pageable first() {
				// TODO Auto-generated method stub
				return null;
			}

			public boolean hasPrevious() {
				// TODO Auto-generated method stub
				return false;
			}
			
		});
		System.out.println(novelHeads);
		assertTrue(novelHeads.size()==1);
	}
	
}
