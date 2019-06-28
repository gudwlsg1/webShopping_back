package kr.hs.dgsw.shopping_back.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    private String account;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String username;
    private String phoneNumber;
    private String postNumber;
    private String address;
    private String email;
    private LocalDateTime created;
    private LocalDateTime updated;

}
