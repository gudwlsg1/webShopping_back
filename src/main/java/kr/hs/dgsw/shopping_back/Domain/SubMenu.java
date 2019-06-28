package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;

@Data
public class SubMenu {
    private Long id;
    private Long categoryId;
    private String name;
}
