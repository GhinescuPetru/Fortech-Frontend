package org.fortech.navigation.security.repos;

import org.fortech.navigation.security.models.ERole;
import org.fortech.navigation.security.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}