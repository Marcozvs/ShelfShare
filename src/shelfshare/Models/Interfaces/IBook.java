package shelfshare.Models.Interfaces;

import java.util.UUID;
import shelfshare.Models.Enums.TypeFavBookEnum;

public interface IBook {
    UUID getId();
    void setId(UUID id);
    
    String getTitle();
    void setTitle(String title);
    
    String getAuthor();
    void setAuthor(String author);
    
    float getScore();
    void setScore(float score);
    
    float getAverageScore();
    void getAverageScore(float averageScore);
    
    TypeFavBookEnum getTypeBook();
    void getTypeBook(TypeFavBookEnum averageScore);
}
