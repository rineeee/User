package com.example.userservice.infrastructure.db.jpa;

import com.example.userservice.domain.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByUserId(String userId);
    UserEntity findByEmail(String username);
}
