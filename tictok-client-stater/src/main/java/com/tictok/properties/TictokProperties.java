package com.tictok.properties;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;


/**
 * @author yuan
 */
@Component
@ConfigurationProperties(prefix = "tictok.starter")
@Data
public class TictokProperties {
    /**
     * api调用地址
     */
    private String apiUrl ;

    /**
     * appKey
     */
    private String appKey;

    /**
     * appSecret
     */
    private String appSecret;
}
