package org.example.board.vo;

import java.util.Date;

public class ArticleVO {
    private int articleNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
    private int viewCnt;

    public ArticleVO() {}
    public ArticleVO(int articleNo, String title, String content, String writer, Date regDate, int viewCnt) {
        this.articleNo = articleNo;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.regDate = regDate;
        this.viewCnt = viewCnt;
    }

    public int getArticleNo() {
        return articleNo;
    }

    public void setArticleNo(int articleNo) {
        this.articleNo = articleNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }
}
