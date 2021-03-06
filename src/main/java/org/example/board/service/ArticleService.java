package org.example.board.service;

import org.example.board.commons.paging.Criteria;
import org.example.board.vo.ArticleVO;

import java.util.List;

public interface ArticleService {
    void create(ArticleVO articleVO) throws Exception;
    ArticleVO read(int articleNo) throws Exception;
    void update(ArticleVO articleVO) throws Exception;
    void delete(int articleNo) throws Exception;
    List<ArticleVO> listAll() throws Exception;
    List<ArticleVO> listCriteria(Criteria criteria) throws Exception;
    int countArticles() throws Exception;
}
