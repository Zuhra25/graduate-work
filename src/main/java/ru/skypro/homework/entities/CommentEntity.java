package ru.skypro.homework.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "comments")
@Setter
@Getter
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // id комментария
    private String text; // текст комментария
    private Long createdAt; // дата и время создания комментария
    @JoinColumn(name = "user_id")
    @ManyToOne
    private UserEntity author; // автор комментария
    @JoinColumn(name = "ad_id")
    @ManyToOne
    private AdEntity ad; // объявление, к которому прикреплен комментарий

}