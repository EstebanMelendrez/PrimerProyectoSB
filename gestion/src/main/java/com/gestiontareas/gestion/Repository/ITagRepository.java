package com.gestiontareas.gestion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestiontareas.gestion.model.Tag;

@Repository
public interface ITagRepository extends JpaRepository<Tag,Integer>
{

}
