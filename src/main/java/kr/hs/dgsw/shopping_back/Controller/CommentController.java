package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Domain.Comment;
import kr.hs.dgsw.shopping_back.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/product/comment/{productId}")
    public List getProductComment(@PathVariable Long productId){
        return this.commentService.findByProductId(productId);
    }

    @PostMapping("/product/comment")
    public Long AddComment(@RequestBody Comment comment){
        return this.commentService.add(comment);
    }

    @DeleteMapping("/product/comment/{productId}")
    public int DeleteComment(@PathVariable Long productId){
        return this.commentService.deleteById(productId);
    }

}
