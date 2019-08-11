package maven.webapp.badboyh2o.service.impl;

import org.springframework.stereotype.Service;

import maven.webapp.badboyh2o.domain.User;

@Service
public interface UserService {
    
    /**
     * 根据用户名查询用户
     * @param name
     * @return
     */
    public User findUserByName(String name);
}
