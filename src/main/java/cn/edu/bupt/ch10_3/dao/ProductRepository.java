package cn.edu.bupt.ch10_3.dao;

import cn.edu.bupt.ch10_3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
