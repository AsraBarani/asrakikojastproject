package krd.kordproject.Comment;

import io.swagger.annotations.ApiModelProperty;
import krd.kordproject.Base.BaseEntity;
import krd.kordproject.Like.LikeDTO;
import krd.kordproject.User.UserDTO;
import krd.kordproject.place.PlaceDTO;
import lombok.Data;

import java.util.List;

@Data
public class CommentDTO extends BaseEntity {
    @ApiModelProperty(required = true, hidden = false)
    private String text;

    @ApiModelProperty(required = true, hidden = false)
    private UserDTO user;

    @ApiModelProperty(required = true, hidden = false)
    private PlaceDTO place;

    @ApiModelProperty(required = false, hidden = true)
    private List<LikeDTO> likes;
}