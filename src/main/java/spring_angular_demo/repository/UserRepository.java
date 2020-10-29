package spring_angular_demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_angular_demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
