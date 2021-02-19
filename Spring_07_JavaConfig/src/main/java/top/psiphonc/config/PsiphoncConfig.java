package top.psiphonc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.psiphonc.pojo.User;

public class PsiphoncConfig {

    @Bean(name = "fasdfa")
    public User getUser() {
        return new User();
    }
}
