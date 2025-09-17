package org.gis.service;

import org.gis.entity.Place;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlaceService {
    public Place create(String name, Double lng, double lat);

    List<Place> list();
}