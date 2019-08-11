package maven.webapp.badboyh2o.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import maven.webapp.badboyh2o.domain.User;

@Mapper
public interface UserDao {
    
    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    public User findByUsername(@Param("username") String username);
}
