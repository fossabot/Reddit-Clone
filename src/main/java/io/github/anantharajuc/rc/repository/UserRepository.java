package io.github.anantharajuc.rc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.anantharajuc.rc.model.User;

import java.util.Optional;

/**
 * Repository class for <code>User</code> domain object. 
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> 
{
    Optional<User> findByUsername(String username);
}