package org.example.board.dao;

import org.example.board.vo.CustomerVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    /*
    @Autowired
    private JdbcTemplate jdbcTemplate;
     */

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    private final static String namespace = "org.example.board";

    @Override
    public CustomerVo selectByName(String name) {
        return sqlSessionTemplate.selectOne(namespace + ".selectByName", name);
    }
}
