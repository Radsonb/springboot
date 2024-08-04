package course.example.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.example.jpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
