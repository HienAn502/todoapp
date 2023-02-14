package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TodoTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "default \"incomplete\"")
    private String state;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
