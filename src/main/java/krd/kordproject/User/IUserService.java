package krd.kordproject.User;

import java.util.List;

public interface IUserService {

    UserName save(UserName user);
    UserName update(UserName user);
    void delete(Long id);
    UserName getById(Long id);

}
