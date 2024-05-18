package com.gestiontareas.gestion.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiontareas.gestion.Repository.ITaskRepository;

@Service
public class TaskDeleteService 
{
    @Autowired
    private ITaskRepository taskrepository;

    public void deleteTask(int Id)
    {
        taskrepository.deleteById(Id);
    }
}
