-- 例子：确保扩展（如果已存在不会报错）
CREATE EXTENSION IF NOT EXISTS postgis;


-- 2) 业务表（WGS84：SRID 4326）
CREATE TABLE IF NOT EXISTS places
(
    id       BIGSERIAL PRIMARY KEY,
    name     TEXT                  NOT NULL,
    location geometry(Point, 4326) NOT NULL
);

CREATE INDEX IF NOT EXISTS idx_places_location_gix
    ON places USING GIST (location);


INSERT INTO places (name, location)
VALUES ('示例A', ST_SetSRID(ST_MakePoint(120.549711, 31.876721), 4326)),
       ('示例B', ST_SetSRID(ST_MakePoint(120.550500, 31.877000), 4326));

