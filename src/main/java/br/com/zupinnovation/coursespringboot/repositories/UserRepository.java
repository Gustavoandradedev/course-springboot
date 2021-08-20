package br.com.zupinnovation.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zupinnovation.coursespringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
