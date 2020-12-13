package cn.edu.bupt.ch10_3.controller;

import cn.edu.bupt.ch10_3.dao.CommentRepository;
import cn.edu.bupt.ch10_3.dao.ProductRepository;
import cn.edu.bupt.ch10_3.entity.Comment;
import cn.edu.bupt.ch10_3.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.Callable;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/add")
    public String add(){
        Product product = new Product();
        product.setName("苹果");
        product.setPrice(BigDecimal.valueOf(5.99));
        productRepository.save(product);

        Comment comment = new Comment();
        comment.setText("真好吃！");
        comment.setProduct(product);
        commentRepository.save(comment);

        return "OK!";
    }


    @GetMapping("/find")
    public List<Product> find(){
        return productRepository.findAll();
    }

    @GetMapping("/delete")
    public String delete(){
        productRepository.deleteAll();
        return "OK!";
    }


}
