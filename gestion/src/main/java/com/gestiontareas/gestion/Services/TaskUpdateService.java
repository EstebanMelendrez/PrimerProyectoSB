package com.gestiontareas.gestion.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiontareas.gestion.Repository.ITaskRepository;
import com.gestiontareas.gestion.model.Task;


/*Servicio que actualiza los datos de una tarea ya existente */
@Service
public class TaskUpdateService 
{
    @Autowired
    private ITaskRepository taskrepository;

    /*Método que busca una tarea por su Id para realizar una actualización sobre ella a traves del objeto taskDetails de tipo Task que contiene los nuevos datos */

    public Task UpdateTask(int Id, Task taskdetails)
    {
        Optional<Task> optionaltask = taskrepository.findById(Id);
        if (optionaltask.isPresent()) /*Se valida que la variable optionaltask contenga un valor diferente de Nulo */
        {
            Task existingtask= optionaltask.get(); /*Se asgina el contenido de la variable optionaltask al objeto existingtask de tipo Task */
            existingtask.setTitle(taskdetails.getTitle());
            existingtask.setDescription(taskdetails.getDescription());
            existingtask.setState(taskdetails.getState());
            existingtask.setLimitDate(taskdetails.getLimitDate());
            existingtask.setTags(taskdetails.getTags());
            return taskrepository.save(existingtask);
        }
        else
        {
            throw new RuntimeException("No se encontró la tarea con el Id " + Id);
        }

    }
}
