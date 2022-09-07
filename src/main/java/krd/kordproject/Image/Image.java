package krd.kordproject.Image;

import krd.kordproject.Base.BaseEntity;
import krd.kordproject.User.UserName;
import krd.kordproject.place.Place;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Audited
public class Image extends BaseEntity {

    @NotNull
     private String image;


    @OneToOne
    @JoinColumn(name = "user_id",unique = true)
    private UserName user;

    @ManyToOne
     private Place place;

}