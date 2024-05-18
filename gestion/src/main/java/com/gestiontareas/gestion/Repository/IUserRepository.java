package com.gestiontareas.gestion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestiontareas.gestion.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer>
{

}
