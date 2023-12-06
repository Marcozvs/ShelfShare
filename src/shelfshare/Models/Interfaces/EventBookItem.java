package shelfshare.Models.Interfaces;

import java.awt.Component;
import shelfshare.Models.Entities.BookModel;

public interface EventBookItem {
    public void itemClick(Component com, BookModel bookModel);
}
