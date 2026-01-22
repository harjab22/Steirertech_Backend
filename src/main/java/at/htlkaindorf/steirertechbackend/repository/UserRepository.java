package at.htlkaindorf.steirertechbackend.repository;

import at.htlkaindorf.steirertechbackend.pojos.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
