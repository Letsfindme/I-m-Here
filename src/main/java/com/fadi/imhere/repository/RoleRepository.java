package com.fadi.imhere.repository;

import java.util.Optional;

import com.fadi.imhere.model.Role;
import com.fadi.imhere.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}