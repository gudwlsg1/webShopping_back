package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.AttachProduct;
import kr.hs.dgsw.shopping_back.Domain.AttachProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AttachProductServiceImpl implements AttachProductService {

    @Autowired
    private AttachProductMapper attachProductMapper;

    @Override
    public HashMap findById(Long id) {
        return attachProductMapper.findById(id);
    }

    @Override
    public Long add(AttachProduct attach) {
        return attachProductMapper.add(attach);
    }

    @Override
    public int modify(AttachProduct attach) {
        return attachProductMapper.modify(attach);
    }

    @Override
    public int deleteById(Long id) {
        return attachProductMapper.deleteById(id);
    }
}
