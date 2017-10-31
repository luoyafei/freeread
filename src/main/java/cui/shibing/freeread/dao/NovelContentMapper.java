package cui.shibing.freeread.dao;

import cui.shibing.freeread.model.NovelContent;

public interface NovelContentMapper {
    int insert(NovelContent record);

    int insertSelective(NovelContent record);
}