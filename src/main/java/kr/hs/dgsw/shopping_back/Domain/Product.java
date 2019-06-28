package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Product {
    private Long id;
    private Long categoryId;
    private Long subId;
    private String name;
    private String manufacturer;
    private Long mileage;
    private Long original_price;
    private Long price;
    private String description;
    private String information;
    private LocalDateTime created;
    private LocalDateTime updated;
}
