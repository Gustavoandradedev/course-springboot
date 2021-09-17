package br.com.zupinnovation.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zupinnovation.coursespringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
