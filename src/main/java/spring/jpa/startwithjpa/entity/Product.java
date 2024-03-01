package spring.jpa.startwithjpa.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(unique = true, nullable = false)
//    private String uuid;
    @Column(length = 50)
    private String name;
    private String description;
    private BigDecimal price;
    @ManyToOne
//    @JoinColumn(name = "cate_id")
    private Category category;

}
