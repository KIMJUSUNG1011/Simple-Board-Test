package org.example.board.commons.paging;

public class Criteria {
    private int page;
    private int perPageNum; // 페이지 당 띄울 게시물의 개수

    public Criteria() {
        page = 1;
        perPageNum = 10;
    }

    public void setPage(int page) {
        if (page <= 0) {
            this.page = 1;
            return;
        }
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPerPageNum(int perPageNum) {
        if (perPageNum <= 0 || perPageNum > 100) {
           this.perPageNum = 10;
           return;
        }
        this.perPageNum = perPageNum;
    }

    public int getPerPageNum() {
        return perPageNum;
    }

    // 현재 페이지의 게시글 시작위치 설정
    public int getPageStart() {
        return (this.page - 1) * perPageNum;
    }
}
