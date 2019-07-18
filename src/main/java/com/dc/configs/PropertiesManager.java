package com.dc.configs;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * PropertiesManager
 *
 * @title PropertiesManager
 * @Description
 * @Author donglongcheng01
 * @Date 2019-07-17
 **/
@Configuration
@EnableConfigurationProperties(HttpService.class)
public class PropertiesManager {

    @Bean
    @ConfigurationProperties(prefix = "httpserver")
    public HttpService httpService() {
        return new HttpService();
    }

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "datasource")
    public DataSourceProperties dcDataSourceProperties() {
        return new DataSourceProperties();
    }


}
