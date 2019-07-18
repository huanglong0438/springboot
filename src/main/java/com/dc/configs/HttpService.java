package com.dc.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * HttpService
 *
 * @title HttpService
 * @Description
 * @Author donglongcheng01
 * @Date 2019-07-17
 **/
@Data
@ConfigurationProperties(prefix = "http")
public class HttpService {

    String serviceUrl;

    String timeout;

    String retry;

}
