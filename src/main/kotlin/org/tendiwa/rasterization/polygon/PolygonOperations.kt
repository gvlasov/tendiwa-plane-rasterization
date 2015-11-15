package org.tendiwa.rasterization.polygon

import org.tendiwa.collectioins.loopedTriLinks
import org.tendiwa.geometry.continuum.points.Point
import org.tendiwa.geometry.continuum.polygons.Polygon
import java.util.*

/**
 * Returns a polygon that is the same as this one, but has no such three
 * consecutive points a, b, c for which a.y == b.y == c.y
 */
internal fun Polygon.collapseHorizontalChains(): Polygon {
    val points = ArrayList<Point>()
    this.points.loopedTriLinks.forEach {
        if (!haveSameYCoord(it.first, it.second, it.third)) {
            points.add(it.second)
        }
    };
    return Polygon(points)
}

private fun haveSameYCoord(a: Point, b: Point, c: Point): Boolean {
    return a.y == b.y && b.y == c.y
}