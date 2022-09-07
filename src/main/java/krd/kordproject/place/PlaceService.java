package krd.kordproject.place;

import lombok.AllArgsConstructor;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class PlaceService implements IPlaceService{

    private final PlaceRepository repository;

    @Override
    public Place save(Place place) {
        return null;
    }

    @Override
    public Place update(Place place) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Place getById(Long id) {
        return null;
    }

    @Override
    public List<Place> findAllInDistance(Point<G2D> refPnt, double dist) {
        return null;
    }
}
