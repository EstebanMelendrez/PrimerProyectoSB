package com.gestiontareas.gestion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestiontareas.gestion.model.Task;

@Repository
public interface ITaskRepository extends JpaRepository <Task,Integer>
{

}
