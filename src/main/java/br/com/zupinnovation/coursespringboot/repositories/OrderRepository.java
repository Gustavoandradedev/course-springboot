package br.com.zupinnovation.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zupinnovation.coursespringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
