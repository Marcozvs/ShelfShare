package utils;

public class AuthenticationState {
    private static String username;

    public static String getUsername() {
        return username;
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
