package hiber.service;

import hiber.model.User;
import hiber.model.Car;

import java.util.List;

public interface UserService {
    void add(User user, Car car);
    List<User> listUsers();

    List<User> getUsersByCar();
}
