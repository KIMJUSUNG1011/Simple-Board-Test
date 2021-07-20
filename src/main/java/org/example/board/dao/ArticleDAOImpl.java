package org.example.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.board.vo.ArticleVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleDAOImpl implements ArticleDAO {

    private static final String namespace = "org.example.board.ArticleMapper";

    private final SqlSession sqlSession;

    public ArticleDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public void create(ArticleVO articleVO) throws Exception {
        sqlSession.insert(namespace + ".create", articleVO);
    }

    @Override
    public ArticleVO read(int articleNo) throws Exception {
        return sqlSession.selectOne(namespace + ".read", articleNo);
    }

    @Override
    public void update(ArticleVO articleVO) throws Exception {
        sqlSession.update(namespace + ".update", articleVO);
    }

    @Override
    public void delete(int articleNo) throws Exception {
        sqlSession.delete(namespace + ".delete", articleNo);
    }

    @Override
    public List<ArticleVO> listAll() throws Exception {
        return sqlSession.selectList(namespace + ".listAll");
    }
}
