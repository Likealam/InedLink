package com.InedLink.repository;

import com.InedLink.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDto, Integer> {
    UserDto getUserDtoByUsername(String username);
}
