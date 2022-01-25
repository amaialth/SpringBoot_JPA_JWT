package com.creativeappdevelopers.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.creativeappdevelopers.model.ERole;
import com.creativeappdevelopers.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	  Optional<Role> findByName(ERole name);

}
