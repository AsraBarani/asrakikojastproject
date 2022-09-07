package krd.kordproject.User;

import io.swagger.annotations.ApiModelProperty;
import krd.kordproject.Base.BaseDTO;
import lombok.Data;

@Data
public class UserDTO extends BaseDTO {

    @ApiModelProperty(required = true, hidden = false)
    private String name;

    @ApiModelProperty(required = true, hidden = false)
    private String email;

    @ApiModelProperty(required = true, hidden = false)
    private String password;

}