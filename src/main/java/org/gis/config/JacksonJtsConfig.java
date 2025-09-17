package org.gis.config;

import org.n52.jackson.datatype.jts.JtsModule;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @projectName: gis_boot
 * @package: org.gis.config
 * @className: JacksonJtsConfig
 * @author: zhouyangfan
 * @description: TODO
 * @date: 2025/9/17 10:36
 * @version: 1.0
 */
@Configuration
public class JacksonJtsConfig {

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jtsModule(){
        return builder -> builder.modules(new JtsModule());
    }
}
