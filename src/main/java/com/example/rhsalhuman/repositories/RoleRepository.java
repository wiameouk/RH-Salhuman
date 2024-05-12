package com.example.rhsalhuman.repositories;

import com.example.rhsalhuman.Enumeration.ERole;
import com.example.rhsalhuman.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
