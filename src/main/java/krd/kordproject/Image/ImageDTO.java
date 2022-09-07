package krd.kordproject.Image;

import io.swagger.annotations.ApiModelProperty;
import krd.kordproject.Base.BaseDTO;
import lombok.Data;

@Data
public class ImageDTO extends BaseDTO {

        @ApiModelProperty(required = true, hidden = false)
        private String image;

        @ApiModelProperty(required = true, hidden = false)
        private Long attach_id;

    }

