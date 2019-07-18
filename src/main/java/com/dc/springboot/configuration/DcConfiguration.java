package com.dc.springboot.configuration;

import com.dc.springboot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * Configuration是一种专门提供属性的注解，专门用来放置{@code @bean}这种方法，来提供属性
 * 一般貌似常用在配置文件
 * </pre>
 *
 *
 * @Author: donglongcheng
 * @Description:
 * @Date: Create in 23:24 2019/7/14
 */
@Configuration
public class DcConfiguration {

    @Bean
    protected User getUser() {
        User user = new User();
        user.setUserId(6324L);
        user.setUserName("The World");
        return user;
    }

}
