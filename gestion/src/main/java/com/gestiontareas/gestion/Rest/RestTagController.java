package com.gestiontareas.gestion.Rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiontareas.gestion.Services.TagService;
import com.gestiontareas.gestion.model.Tag;

/*controlador de servicios REST para la obtención, creación y eliminación de datos de la tabla de datos Tag */
@RestController
@RequestMapping("/tags")
public class RestTagController 
{
    @Autowired
    private TagService tagservice;

    @GetMapping
    public List<Tag> getAllTags()
    {
        return tagservice.getAllTags();
    }

    @GetMapping("{Id}")
    public Optional<Tag> getTagById(@PathVariable int Id)
    {
        return tagservice.getTagById(Id);
    }

    @PostMapping
    public Tag createTag(@RequestBody Tag tag)
    {
        return tagservice.createTag(tag);
    }

    @DeleteMapping("{Id}")
    public void deleteTag(@PathVariable int Id)
    {
        tagservice.deleteTag(Id);
    }
}
