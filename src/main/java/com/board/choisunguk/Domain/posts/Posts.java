package com.board.choisunguk.Domain.posts;

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
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Id @GeneratedValue
    private long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    /***
     * 게시글 수정 비지니스 로직
     * @param title
     * @param content
     */
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
