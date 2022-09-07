package krd.kordproject.Comment;


import java.util.List;

public interface ICommentService {
    Comment save(Comment comment);

    void delete(Long id);

    Comment getById(Long id);

    List<Comment> getAllByUserId(Long userId);

    List<Comment> getAllByPlaceId(Long placeId);

}
