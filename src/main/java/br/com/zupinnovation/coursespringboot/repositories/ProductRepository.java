package br.com.zupinnovation.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zupinnovation.coursespringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
