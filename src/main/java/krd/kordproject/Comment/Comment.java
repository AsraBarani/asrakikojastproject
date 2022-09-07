package krd.kordproject.Comment;

import krd.kordproject.Base.BaseEntity;
import krd.kordproject.Like.Like;
import krd.kordproject.User.UserName;
import krd.kordproject.place.Place;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Audited
public class Comment extends BaseEntity {

    private String text;

    @NotNull
    @ManyToOne
    @JoinColumn(name = ("user_id"))
    private UserName user;

    @ManyToOne
    @JoinColumn(name = ("place_id"))
    private Place place;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "comment", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Like> likes;
}
