package com.gestiontareas.gestion.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiontareas.gestion.Repository.ITaskRepository;
import com.gestiontareas.gestion.model.Task;

@Service
public class TaskService 
{
    @Autowired
    private ITaskRepository taskrepository;

    public List<Task> getAllTasks()
    {
        return taskrepository.findAll();
    }

    public Optional<Task> getTaskById(int Id)
    {
        return taskrepository.findById(Id);
    }

    public Task createTask(Task task)
    {
        return taskrepository.save(task);
    }

    public void deleteTask(int Id)
    {
        taskrepository.deleteById(Id);
    }
}
