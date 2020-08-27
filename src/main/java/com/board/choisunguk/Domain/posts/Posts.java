package com.board.choisunguk.Domain.posts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Getter
@Entity
@NoArgsConstructor
public class Posts {

    @Builder
    public Posts(String title, String content, String autor) {
        this.title = title;
        this.content = content;
        this.autor = autor;
    }

    @Id @GeneratedValue
    private long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String autor;
}
