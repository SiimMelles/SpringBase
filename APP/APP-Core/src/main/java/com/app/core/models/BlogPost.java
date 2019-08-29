package com.app.core.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Data
@Entity
@Table(name="blogpost")
public class BlogPost {

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    @Column(name = "author")
    private String author;

    @Column(name = "date")
    private Date date;

    @OneToMany(mappedBy = "post", cascade = CascadeType.REMOVE)
    private Collection<Comment> comments;

}
