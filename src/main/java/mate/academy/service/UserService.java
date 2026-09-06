package mate.academy.service;

import mate.academy.model.User;

public class UserService {
    private static final User[] users = new User[]{
            new User("bob@i.ua", "1234"),
            new User("alice@i.ua", "1234")
    };

    public static User findByEmail(String email) {
        User user = null;

        for (User el : users) {
            if (el.getEmail().equals(email)) {
                user = el;
            }
        }

        return user;
    }
}
