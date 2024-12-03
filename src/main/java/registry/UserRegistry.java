package registry;

public class UserRegistry {
    private static UserRegistry instance;

    private UserRegistry() {}

    public static synchronized UserRegistry getInstance() {
        if (instance == null) {
            instance = new UserRegistry();
        }
        return instance;
    }

    public void registerUser(String username) {
        System.out.println("User " + username + " registered.");
    }
}
