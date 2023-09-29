package com.tareaapi.tareaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tareaapi.tareaapi.models.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario,Long> {
}
