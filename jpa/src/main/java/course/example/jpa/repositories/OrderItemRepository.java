package course.example.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.example.jpa.entities.OrderItem;
import course.example.jpa.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
