package shelfshare.Models.Interfaces;

import java.awt.Component;
import shelfshare.Models.Entities.UserModel;

public interface EventItem {
    public void itemClick(Component com, UserModel userModel);
}
