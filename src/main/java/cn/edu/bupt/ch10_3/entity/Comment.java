package cn.edu.bupt.ch10_3.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;

    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private Product product;
}
