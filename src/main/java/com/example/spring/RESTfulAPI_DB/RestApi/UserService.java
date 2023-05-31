package com.example.spring.RESTfulAPI_DB.RestApi;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserService {

    private final IUserRepository iUserRepository;

    public UserService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    public List<UserModel> getAllUsers() {
        return iUserRepository.findAll();
    }

    public UserModel getUserById(Integer id) {
        return iUserRepository.findById(id).orElseThrow(
                () -> new NoSuchElementException("User not found with id: " + id)
        );
    }

    public UserModel createUser(UserModel user) {
        return iUserRepository.save(user);
    }



    public UserModel updateUser(Integer id, UserModel updatedUser) {
        UserModel existingUser = iUserRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User not found with id: " + id));

        existingUser.setName(updatedUser.getName());

        return iUserRepository.save(existingUser);
    }

    public boolean deleteUser(Integer id) {
        if (iUserRepository.existsById(id)) {
            iUserRepository.deleteById(id);
            return true;
        } else {

            return false;
        }
    }
}
