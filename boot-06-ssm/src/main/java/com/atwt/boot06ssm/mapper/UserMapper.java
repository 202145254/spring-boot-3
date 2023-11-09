package com.atwt.boot06ssm.mapper;

import com.atwt.boot06ssm.bean.TUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserMapper {
   public TUser getUser(@Param("id") Integer id);
}
