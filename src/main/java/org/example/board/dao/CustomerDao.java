package org.example.board.dao;

import org.example.board.vo.CustomerVo;

public interface CustomerDao {
    CustomerVo selectByName(String name);
}
