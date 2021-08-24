package br.com.zupinnovation.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zupinnovation.coursespringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
