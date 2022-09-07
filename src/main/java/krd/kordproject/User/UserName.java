package krd.kordproject.User;

import krd.kordproject.Base.BaseEntity;
import krd.kordproject.Like.Like;
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
public class UserName extends BaseEntity {

    @NotNull
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Like> likes;


}
