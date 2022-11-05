package com.jjfigueroah.cart.security.respositories;

import java.util.Optional;

import com.jjfigueroah.cart.security.entities.Role;
import com.jjfigueroah.cart.security.enums.RoleList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository <Role, Integer> {
    Optional<Role> findByRoleName(RoleList roleName);
    
}
