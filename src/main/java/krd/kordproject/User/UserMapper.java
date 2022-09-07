package krd.kordproject.User;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface UserMapper {

    UserName toUser(UserDTO userDTO);

    UserDTO toUserDTO(UserName user);

    List<UserDTO> toUserDTOs(List<UserName> users);

}