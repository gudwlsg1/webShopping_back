package kr.hs.dgsw.shopping_back.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Basket {
    private Long id;
    private Long userId;
    private Long productId;
    private Long orderNumber;
    private LocalDateTime created;
    private LocalDateTime updated;
}
