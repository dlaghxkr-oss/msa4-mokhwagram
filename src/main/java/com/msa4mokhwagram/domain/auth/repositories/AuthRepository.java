package com.msa4mokhwagram.domain.auth.repositories;

import com.msa4mokhwagram.domain.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthRepository extends JpaRepository<User, Long> {
    public Optional<User> findByEmail(String email);
    boolean existByEmail(String email);
}
