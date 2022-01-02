package com.demo.simplynote.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noteId;

    @Column(name = "content", nullable = false)
    private String content;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;
}
