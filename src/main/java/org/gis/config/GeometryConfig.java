package org.gis.config;

import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.PrecisionModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @projectName: gis_boot
 * @package: org.gis.config
 * @className: GeometryConfig
 * @author: zhouyangfan
 * @description: TODO
 * @date: 2025/9/17 10:45
 * @version: 1.0
 */

@Configuration
public class GeometryConfig {

    @Bean
    public GeometryFactory geometryFactory() {
        // WGS84 = 4326
        return new GeometryFactory(new PrecisionModel(), 4326);
    }
}
