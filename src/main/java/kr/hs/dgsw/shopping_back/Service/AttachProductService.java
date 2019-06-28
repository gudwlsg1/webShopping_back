package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.AttachProduct;

import java.util.HashMap;

public interface AttachProductService {
    HashMap findById(Long id);
    Long add(AttachProduct attach);
    int modify(AttachProduct attach);
    int deleteById(Long id);
}
