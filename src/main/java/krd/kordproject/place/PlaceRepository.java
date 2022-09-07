package krd.kordproject.place;

import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.Tuple;
import java.util.List;

@Repository
public interface PlaceRepository extends PagingAndSortingRepository<Place,Long> {

    @Query("SELECT pl, distance(pl.location, ?1) as distance from Place pl order by distance")
    List<Tuple> findAllWithDistance(Point<G2D> refPnt);

    @Query("SELECT pl from Place pl where distance(pl.location, ?1) < ?2")
    List<Place> findAllInDistance(Point<G2D> refPnt, double dist);

}
