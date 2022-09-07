package krd.kordproject.Like;

import krd.kordproject.Base.BaseEntity;
import krd.kordproject.User.UserName;
import krd.kordproject.place.Place;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.xml.stream.events.Comment;

@Entity
@Data
@Audited
public class Like extends BaseEntity {

    @NotNull
    @ManyToOne
    @JoinColumn(name = ("user_id"))
    private UserName user;

    @ManyToOne
    @JoinColumn(name = ("place_id"))
    private Place place;

    @ManyToOne
    @JoinColumn(name = ("comment_id"))
    private Comment comment;

    private LikeType type;
}