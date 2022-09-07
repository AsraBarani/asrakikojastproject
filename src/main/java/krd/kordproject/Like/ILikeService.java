package krd.kordproject.Like;

import java.util.List;

public interface ILikeService {

    Like save(Like like);

    void delete(Long id);

    Like getById(Long id);

    List<Like> getAll();

    List<Like> getAllByUserId(Long userId);

    List<Like> getAllByPlaceId(Long placeId);

    List<Like> getAllByTypeLike(LikeType likeType);
}
