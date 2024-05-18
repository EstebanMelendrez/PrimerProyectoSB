package com.gestiontareas.gestion.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiontareas.gestion.Services.TaskService;

/*controlador de servicios REST para la eliminación de registros de la tabla de datos Task */
@RestController
@RequestMapping("/tasks")
public class RestTaskDeleteController 
{
    @Autowired
    private TaskService taskservice;

    @DeleteMapping("{Id}")
    public void deleteTask(@PathVariable int Id)
    {
        taskservice.deleteTask(Id);
    }
}
