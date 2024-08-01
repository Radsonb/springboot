package course.example.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.example.jpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
