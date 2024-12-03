package tests;

import registry.UserRegistry;

public class SingletonTest {
    public static void main(String[] args) {
        UserRegistry instance1 = UserRegistry.getInstance();
        UserRegistry instance2 = UserRegistry.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}
