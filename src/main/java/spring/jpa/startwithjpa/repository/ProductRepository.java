package spring.jpa.startwithjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.jpa.startwithjpa.entity.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "select pro.name, pro.description, pro.price from  Product as pro")
    Optional<Product> findByUuid(String uuid);
}
