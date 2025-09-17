package org.gis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: gis_boot
 * @package: org.gis.controller
 * @className: HelloController
 * @author: zhouyangfan
 * @description: TODO
 * @date: 2025/9/17 9:26
 * @version: 1.0
 */
@RestController
@RequestMapping("/api")
public class HelloController {


    @GetMapping("/base")
    public String hello() {
        return "nihao";
    }


}
