package com.jjfigueroah.cart.security.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.jjfigueroah.cart.security.entities.Role;
import com.jjfigueroah.cart.security.enums.RoleList;
import com.jjfigueroah.cart.security.respositories.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    public Optional<Role> getByRoleName(RoleList roleName){
        return roleRepository.findByRoleName(roleName);
    }
    
    
}
