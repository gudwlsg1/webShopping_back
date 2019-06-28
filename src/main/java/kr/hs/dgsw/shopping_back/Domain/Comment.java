package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {
    private Long id;
    private Long userId;
    private Long productId;
    private String title;
    private LocalDateTime created;
    private LocalDateTime updated;
}
