package cui.shibing.freeread.dao;

import cui.shibing.freeread.model.NovelContent;

public interface NovelContentDao {
    int deleteByPrimaryKey(Integer novelContentId);

    int insert(NovelContent record);

    int insertSelective(NovelContent record);

    NovelContent selectByPrimaryKey(Integer novelContentId);

    int updateByPrimaryKeySelective(NovelContent record);

    int updateByPrimaryKey(NovelContent record);
}