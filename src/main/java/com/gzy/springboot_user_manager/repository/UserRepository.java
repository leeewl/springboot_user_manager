package com.gzy.springboot_user_manager.repository;

import com.gzy.springboot_user_manager.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> { // User是该仓库管理的实体类，Integer是主键类型

}
