package krd.kordproject.place;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PlaceDTO {

        @ApiModelProperty(required = true, hidden = false)
        private String title;

        @ApiModelProperty(required = true, hidden = false)
        private Integer startService;

        @ApiModelProperty(required = true, hidden = false)
        private Integer endService;

        @ApiModelProperty(required = true, hidden = false)
        private String address;

        @ApiModelProperty(required = true, hidden = false)
        private PlaceType type;

        @ApiModelProperty(required = true, hidden = false)
        private LocationDTO location;
    }

