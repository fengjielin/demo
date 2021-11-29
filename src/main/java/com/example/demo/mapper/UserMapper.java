package com.example.demo.mapper;

import com.example.demo.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

// 数据库访问接口类
@Mapper
@Component // 主要是为了让欺骗 IEDA，让它以为CarUserMapper也是一个Spring管理的Bean，这样子使用@Autowired注解注入也不会报错了
public interface UserMapper {
    UserBean getInfo(@Param("username") String username, @Param("password") String password);
}
