package org.example.HandleObject;

import org.springframework.context.annotation.Bean;

public class ObjectConfig {
    @Bean
    public User create(){
        User u=new User();
        u.setName("dewansh vishwakarma");
        u.setRoll(72);

        return u;
    }
}
