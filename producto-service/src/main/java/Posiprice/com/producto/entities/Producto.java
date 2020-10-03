package Posiprice.com.producto.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "productos")
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    private String name;

    @Column(length = 40, nullable = false)
    private Double price;

    @Column(length = 40, nullable = false)
    private String description; 

}
