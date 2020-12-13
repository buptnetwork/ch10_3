package cn.edu.bupt.ch10_3.dao;

import cn.edu.bupt.ch10_3.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
