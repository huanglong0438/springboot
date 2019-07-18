package com.dc.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * JdbcProperties，配置文件实体化
 *
 * @title JdbcProperties
 * @Description 配置文件实体化
 * @Author donglongcheng01
 * @Date 2019-07-17
 **/
@Data
@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {

    String url;

    String username;

    String password;

}
