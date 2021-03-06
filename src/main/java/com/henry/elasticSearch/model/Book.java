package com.henry.elasticSearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "book")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String releaseDate;

    public Book(){}

    public Book(String id, String title, String author, String releaseDate){
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String toStrong() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
