package org.gis.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.gis.entity.Place;
import org.gis.mapper.PlaceRepository;
import org.gis.service.PlaceService;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @projectName: gis_boot
 * @package: org.gis.service.impl
 * @className: PlaceServiceImpl
 * @author: zhouyangfan
 * @description: TODO
 * @date: 2025/9/17 10:58
 * @version: 1.0
 */

@Service
@AllArgsConstructor
public class PlaceServiceImpl implements PlaceService {

    private final PlaceRepository placeRepository;

    private final GeometryFactory gf;

    @Transactional
    public Place create(String name, Double lng, double lat) {
        Coordinate coordinate = new Coordinate(lng, lat);
        Point pt = gf.createPoint(coordinate);
        pt.setSRID(4326);
        Place place = new Place();
        place.setName(name);
        place.setLocation(pt);
        return placeRepository.save(place);
    }

    @Override
    public List<Place> list() {
        return placeRepository.findAll();
    }
}
