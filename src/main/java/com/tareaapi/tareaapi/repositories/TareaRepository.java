package com.tareaapi.tareaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tareaapi.tareaapi.models.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea,Long> {
}
