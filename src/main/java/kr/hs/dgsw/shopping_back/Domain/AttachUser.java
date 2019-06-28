package kr.hs.dgsw.shopping_back.Domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class AttachUser {
    private Long id;
    private Long userId;
    private String filename;
    private String filepath;
    private LocalDateTime created;
    private LocalDateTime updated;

    @Builder
    public AttachUser(Long userId, String filename, String filepath) {
        this.userId = userId;
        this.filename = filename;
        this.filepath = filepath;
    }
}
