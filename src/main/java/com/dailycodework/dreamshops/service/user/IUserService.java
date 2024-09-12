package com.dailycodework.dreamshops.service.user;

import com.dailycodework.dreamshops.dto.UserDto;
import com.dailycodework.dreamshops.model.User;
import com.dailycodework.dreamshops.service.request.CreateUserRequest;
import com.dailycodework.dreamshops.service.request.UpdateUserRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(Long userId,UpdateUserRequest request);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
