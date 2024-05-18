package com.gestiontareas.gestion.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiontareas.gestion.Repository.ITagRepository;
import com.gestiontareas.gestion.model.Tag;


@Service
public class TagService 
{
    @Autowired
    private ITagRepository tagrepository;

    public List<Tag> getAllTags()
    {
        return tagrepository.findAll();
    }

    public Optional<Tag> getTagById(int Id)
    {
        return tagrepository.findById(Id);
    }

    public Tag createTag(Tag tag)
    {
        return tagrepository.save(tag);
    }

    public void deleteTag(int Id)
    {
        tagrepository.deleteById(Id);
    }
}
