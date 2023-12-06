package shelfshare.Models.Entities;

import java.util.UUID;

public class AssessmentModel {
    private UUID id;
    private UUID userId;
    private UUID bookId;
    private float bookRating;

    public AssessmentModel(UUID userId, UUID bookId, float bookRating) {
        this.id = UUID.randomUUID();
        this.userId = userId;
        this.bookId = bookId;
        this.bookRating = bookRating;
    }


    public AssessmentModel() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }

    public float getBookRating() {
        return bookRating;
    }

    public void setBookRating(float bookRating) {
        this.bookRating = bookRating;
    }
}
