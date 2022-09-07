package krd.kordproject.Like;

import io.swagger.annotations.ApiModelProperty;
import krd.kordproject.Base.BaseDTO;
import krd.kordproject.Comment.CommentDTO;
import krd.kordproject.User.UserDTO;
import krd.kordproject.place.PlaceDTO;
import lombok.Data;

@Data
public class LikeDTO extends BaseDTO {

    @ApiModelProperty(required = true, hidden = false)
    private UserDTO user;

    @ApiModelProperty(required = false, hidden = false)
    private PlaceDTO place;

    @ApiModelProperty(required = false, hidden = false)
    private CommentDTO comment;

}