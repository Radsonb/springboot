package course.example.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.example.jpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
