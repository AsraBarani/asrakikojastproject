package krd.kordproject.User;

import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user/v1")

public class UserCotroller {

    private final UserService service;
    private UserMapper mapper;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody UserDTO userDTO) {
        UserName user = mapper.toUser(userDTO);
        service.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<UserDTO> update(@RequestBody UserDTO userDTO) {
        UserName user = mapper.toUser(userDTO);
        val dto = mapper.toUserDTO(service.update(user));
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable Long id) {
        UserName user = service.getById(id);
        UserDTO userDTO = mapper.toUserDTO(user);
        return ResponseEntity.ok(userDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

}

