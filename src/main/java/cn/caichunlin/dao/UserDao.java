package cn.caichunlin.dao;

import cn.caichunlin.domain.User;
import jdk.jfr.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/11/26/026.
 */
@Repository
public interface UserDao {
     List<User> findAll();
}
