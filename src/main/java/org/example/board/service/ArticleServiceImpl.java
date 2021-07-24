package org.example.board.service;

import org.example.board.commons.paging.Criteria;
import org.example.board.dao.ArticleDAO;
import org.example.board.vo.ArticleVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleDAO articleDAO;

    public ArticleServiceImpl(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    @Override
    public void create(ArticleVO articleVO) throws Exception {
        articleDAO.create(articleVO);
    }

    @Override
    public ArticleVO read(int articleNo) throws Exception {
        return articleDAO.read(articleNo);
    }

    @Override
    public void update(ArticleVO articleVO) throws Exception {
        articleDAO.update(articleVO);
    }

    @Override
    public void delete(int articleNo) throws Exception {
        articleDAO.delete(articleNo);
    }

    @Override
    public List<ArticleVO> listAll() throws Exception {
        return articleDAO.listAll();
    }

    @Override
    public List<ArticleVO> listCriteria(Criteria criteria) throws Exception {
        return articleDAO.listCriteria(criteria);
    }

    @Override
    public int countArticles() throws Exception {
        return articleDAO.countArticles();
    }
}
