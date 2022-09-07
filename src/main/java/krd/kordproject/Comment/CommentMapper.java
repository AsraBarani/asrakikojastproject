package krd.kordproject.Comment;


import krd.kordproject.place.PlaceMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PlaceMapper.class})

public interface CommentMapper {

    Comment toComment(CommentDTO commentDTO);

    List<Comment> toComments(List<CommentDTO> commentDTOS);

    CommentDTO toCommentDTO(Comment comment);

    List<CommentDTO> toCommentDTOs(List<Comment> comments);
}
