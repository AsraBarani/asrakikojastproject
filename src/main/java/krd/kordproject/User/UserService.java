package krd.kordproject.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class UserService implements IUserService {

    private final UserRepository repository;

    @Override
    public UserName save(UserName user) {
        return repository.save(user);
    }

    @Override
    public UserName update(UserName user) {

        UserName savedBefore = getById(user.getId());
        savedBefore.setName(user.getName());
        savedBefore.setPassword(user.getPassword());
        savedBefore.setEmail(user.getEmail());

        return repository.save(savedBefore);
    }

    @Override
    public void delete(Long id) {
     repository.deleteById(id);
    }

    @Override
    public UserName getById(Long id) {
        Optional<UserName> optionalUser = repository.findById(id);
        if (optionalUser.isEmpty()) throw new NotFoundException("User not Found");

        return optionalUser.get();
    }
}
