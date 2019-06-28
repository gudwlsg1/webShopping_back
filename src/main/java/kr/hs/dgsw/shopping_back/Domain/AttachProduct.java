package kr.hs.dgsw.shopping_back.Domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class AttachProduct {
    private Long id;
    private Long productId;
    private String filename;
    private String filepath;
    private LocalDateTime created;
    private LocalDateTime updated;

    @Builder
    public AttachProduct(Long productId, String filename, String filepath) {
        this.productId = productId;
        this.filename = filename;
        this.filepath = filepath;
    }
}
