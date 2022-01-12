package com.example.jwt2.mapper;

import com.example.jwt2.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {
    @Select("select * from account where user_name like '%' #{userName} '%'")
    List<Account> findByUserName(String userName);

//    @Select(("select *"))
}
