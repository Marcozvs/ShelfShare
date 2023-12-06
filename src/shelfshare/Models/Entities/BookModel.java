package shelfshare.Models.Entities;

import java.util.UUID;
import shelfshare.Models.Enums.TypeFavBookEnum;

public class BookModel {
    private UUID id;
    private String title;
    private String author;
    private float score;
    private float averageScore;
    private TypeFavBookEnum typeBook;
    
    public BookModel(UUID id, String title, String author, float score, TypeFavBookEnum typeBook) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.score = score;
        this.typeBook = typeBook;
    }
    
    public BookModel() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }

    public TypeFavBookEnum getTypeBook() {
        return typeBook;
    }

    public void setTypeBook(TypeFavBookEnum typeBook) {
        this.typeBook = typeBook;
    }
}
