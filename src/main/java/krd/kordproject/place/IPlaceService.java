package krd.kordproject.place;

import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import java.util.List;

public interface IPlaceService {

    Place save(Place place);
    Place update(Place place);
    void delete(Long id);
    Place getById(Long id);
    List<Place> findAllInDistance(Point<G2D> refPnt, double dist);

}
