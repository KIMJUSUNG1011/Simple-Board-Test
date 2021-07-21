package org.example.board.dao;

import org.example.board.vo.ArticleVO;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mariadb.jdbc.internal.logging.Logger;
import org.mariadb.jdbc.internal.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring-config/applicationContext.xml"})
public class ArticleDAOTest {

    private static final Logger logger = LoggerFactory.getLogger(ArticleDAOTest.class);

    @Autowired
    private ArticleDAO articleDAO;

    @Test
    public void testListPaging() throws Exception {
        int page = 3;
        List<ArticleVO> list = articleDAO.listPaging(page);
        for (ArticleVO a : list) {
            System.out.println(a.getArticleNo());
        }
    }

    @Ignore
    @Test
    public void testCreate() throws Exception {
        ArticleVO articleVO = new ArticleVO();
        articleVO.setTitle("제목 " + 1000);
        articleVO.setContent("내용 " + 1000);
        articleVO.setWriter(1000 + "");
        articleDAO.create(articleVO);
    }

    @Ignore
    @Test
    public void testRead() throws Exception {
        logger.info(articleDAO.read(1).toString());
    }

    @Ignore
    @Test
    public void testUpdate() throws Exception {
        ArticleVO article = new ArticleVO();
        article.setArticleNo(1);
        article.setTitle("새로운 제목 업데이트");
        article.setContent("새로운 내용 업데이트");
        articleDAO.update(article);
    }

    @Ignore
    @Test
    public void testDelete() throws Exception {
        articleDAO.delete(1);
    }

    @Ignore
    @Test
    public void testListAll() throws Exception {
        List<ArticleVO> list = articleDAO.listAll();
        for (ArticleVO a : list) {
            System.out.println(a);
        }
    }
}
