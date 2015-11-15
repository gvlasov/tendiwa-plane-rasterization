package org.tendiwa.rasterization.polygons

import org.junit.Test
import org.tendiwa.geometry.continuum.points.Point
import org.tendiwa.geometry.continuum.polygons.Polygon
import org.tendiwa.rasterization.polygon.rasterized

class PolygonRasterizationTest {
    @Test fun rasterizes() {
        Polygon(
            Point(0.0, 0.0),
            Point(20.0, 5.0),
            Point(10.0, 10.0)
        ).rasterized
    }
    @Test fun rasterizesPolygonWithConsecutiveHorizontalEdges() {
        Polygon(
            Point(0.0, 10.0),
            Point(10.0, 10.0),
            Point(10.0, 20.0),
            Point(20.0, 20.0),
            Point(20.0, 0.0),
            Point(30.0, 0.0),
            Point(30.0, 30.0),
            Point(40.0, 30.0),
            Point(40.0, 20.0),
            Point(50.0, 20.0),
            Point(50.0, 30.0),
            Point(60.0, 30.0),
            Point(60.0, 20.0),
            Point(70.0, 20.0),
            Point(70.0, 40.0),
            Point(0.0, 40.0)
        ).rasterized
    }
}