package krd.kordproject.Comment;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {

    List<Comment> findAllByUserId(long userId);

    List<Comment> findAllByPlaceId(long placeId);

}