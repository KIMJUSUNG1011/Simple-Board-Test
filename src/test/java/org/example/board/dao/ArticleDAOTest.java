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


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring-config/applicationContext.xml"})
public class ArticleDAOTest {

    private static final Logger logger = LoggerFactory.getLogger(ArticleDAOTest.class);

    @Autowired
    private ArticleDAO articleDAO;

    @Ignore
    @Test
    public void testCreate() throws Exception {
        System.out.print(articleDAO);
        ArticleVO article = new ArticleVO();
        article.setTitle("새로운 제목");
        article.setContent("새로운 내용");
        article.setWriter("주성");
        articleDAO.create(article);
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

    @Test
    public void testDelete() throws Exception {
        articleDAO.delete(1);
    }
}
