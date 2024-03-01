package spring.jpa.startwithjpa.init;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import spring.jpa.startwithjpa.entity.Product;
import spring.jpa.startwithjpa.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitialization {


    private final ProductRepository productRepository;

    @PostConstruct
    void init(){
        System.out.println("Start initializing... ");


        Product product1 = Product.builder()
                .name("iPhone 11 pro max")
                .description("apple Inc.")
                .price(BigDecimal.valueOf(380))
                .build();
        Product product2 = Product.builder()
                .name("iPhone 15 pro max")
                .description("apple Inc.")
                .price(BigDecimal.valueOf(1280))
                .build();

//        productRepository.save(product1);
//        productRepository.save(product2);

        productRepository.saveAll(List.of(product1, product2));

        System.out.println(product1.getId());
        System.out.println(product2.getId());

        List<Product> products = productRepository.findAll();
        products.forEach(product -> System.out.println(product.getName()));
    }
}
