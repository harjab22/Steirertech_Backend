package at.htlkaindorf.steirertechbackend.repository;

import at.htlkaindorf.steirertechbackend.pojos.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
