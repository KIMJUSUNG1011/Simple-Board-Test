package org.example.board.dao;

import org.example.board.vo.ArticleVO;

import java.util.List;

public interface ArticleDAO {
    void create(ArticleVO articleVO) throws Exception;
    ArticleVO read(int articleNo) throws Exception;
    void update(ArticleVO articleVO) throws Exception;
    void delete(int articleNo) throws Exception;
    List<ArticleVO> listAll() throws Exception;
}
