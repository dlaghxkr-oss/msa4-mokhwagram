package com.msa4mokhwagram.domain.user.repositories;

import com.msa4mokhwagram.domain.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
