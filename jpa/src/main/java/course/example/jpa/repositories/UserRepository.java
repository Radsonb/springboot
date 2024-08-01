package course.example.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.example.jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
