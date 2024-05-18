package com.gestiontareas.gestion.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiontareas.gestion.Services.TaskUpdateService;
import com.gestiontareas.gestion.model.Task;


/*controlador de servicios REST para la actualización de la tabla de datos Task */
@RestController
@RequestMapping("/tasks")
public class RestTaskUpdateController 
{
    @Autowired
    TaskUpdateService updateservice;

    @PutMapping("/{Id}")
    public ResponseEntity<Task> UpdateTask(@PathVariable int Id, @RequestBody Task taskdetails)
    {
        Task updatedtask = updateservice.UpdateTask(Id, taskdetails);
        return ResponseEntity.ok(updatedtask);
    }
}
