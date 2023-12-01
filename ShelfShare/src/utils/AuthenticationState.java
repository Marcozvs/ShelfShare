package utils;

import models.entities.UserModel;

public class AuthenticationState {
    private static String username;
    private static UserModel user;

    public static String getUsername() {
        return username;
    }

    public static void setUser(UserModel NewUser) {
        user = NewUser;
    }

    public static UserModel getUser() {
        return user;
    }

    public static void setLoggedInUser(String loggedInUsername) {
        username = loggedInUsername;
    }

    public static void clearLoggedInUser() {
        username = null;
    }

    public static boolean isLoggedIn() {
        return username != null;
    }
}
