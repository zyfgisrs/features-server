package org.gis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @projectName: gis_boot
 * @package: org.gis.entity
 * @className: CreatePlaceReq
 * @author: zhouyangfan
 * @description: TODO
 * @date: 2025/9/17 11:10
 * @version: 1.0
 */

@Data
@Getter
@Setter
public class CreatePlaceReq {
    private String name;

    private Double lng;

    private Double lat;
}
