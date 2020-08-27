package com.board.choisunguk.Domain;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
@Getter
public class Posts {

    @Id @GeneratedValue
    private long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String autor;

    @Builder
    public Posts(String title, String content, String autor) {
        this.title = title;
        this.content = content;
        this.autor = autor;
    }
}
