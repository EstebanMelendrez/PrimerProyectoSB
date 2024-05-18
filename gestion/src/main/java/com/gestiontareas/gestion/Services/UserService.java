package com.gestiontareas.gestion.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiontareas.gestion.Repository.IUserRepository;
import com.gestiontareas.gestion.model.User;


@Service
public class UserService 
{
    @Autowired
    private IUserRepository userrepository;

    public List<User> getAllUsers()
    {
        return userrepository.findAll();
    }

    public Optional<User> getUserById(int idUser)
    {
        return userrepository.findById(idUser);
    }

    public User createUser(User user)
    {
        return userrepository.save(user);
    }

    public void deleteUser(int idUser)
    {
        userrepository.deleteById(idUser);
    }
    
}
