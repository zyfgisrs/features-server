package org.gis.controller;

import org.gis.entity.CreatePlaceReq;
import org.gis.entity.Place;
import org.gis.service.impl.PlaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @projectName: gis_boot
 * @package: org.gis.controller
 * @className: PlaceController
 * @author: zhouyangfan
 * @description: TODO
 * @date: 2025/9/17 11:08
 * @version: 1.0
 */

@RestController
@RequestMapping("/api/places")
public class PlaceController {

    @Autowired
    private PlaceServiceImpl placeService;


    @PostMapping
    public ResponseEntity<Place> create(@RequestBody CreatePlaceReq req) {
        return ResponseEntity.ok(placeService.create(req.getName(), req.getLng(), req.getLat()));
    }

    @GetMapping
    public ResponseEntity<List<Place>> list() {
        List<Place> places = placeService.list();
        return ResponseEntity.ok(places);
    }
}
