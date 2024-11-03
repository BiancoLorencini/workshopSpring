package com.projetoSpringPort.cursoSpring.repositories;

import com.projetoSpringPort.cursoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
