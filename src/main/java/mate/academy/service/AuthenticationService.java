package mate.academy.service;

import mate.academy.model.User;

public class AuthenticationService {
    public boolean login(String email, String password) {
        User user = UserService.findByEmail(email);

        return user.getEmail().equals(email) && user.getPassword().equals(password);
    }
}
