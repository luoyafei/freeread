package cui.shibing.freeread.model;

public class NovelContent {
    private Integer novelContentId;

    private Integer novelId;

    private Integer novelChapter;

    private String novelChapterPath;

    public Integer getNovelContentId() {
        return novelContentId;
    }

    public void setNovelContentId(Integer novelContentId) {
        this.novelContentId = novelContentId;
    }

    public Integer getNovelId() {
        return novelId;
    }

    public void setNovelId(Integer novelId) {
        this.novelId = novelId;
    }

    public Integer getNovelChapter() {
        return novelChapter;
    }

    public void setNovelChapter(Integer novelChapter) {
        this.novelChapter = novelChapter;
    }

    public String getNovelChapterPath() {
        return novelChapterPath;
    }

    public void setNovelChapterPath(String novelChapterPath) {
        this.novelChapterPath = novelChapterPath;
    }
}