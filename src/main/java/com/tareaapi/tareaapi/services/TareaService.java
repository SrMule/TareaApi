package com.tareaapi.tareaapi.services;

import com.tareaapi.tareaapi.models.Comentario;
import com.tareaapi.tareaapi.models.Tarea;

public interface TareaService {

    Tarea getTareaPorId(Long id);
    void deleteTareaPorId(Long id);
    void updateTareaPorId(Long id, Tarea tarea);
    void createTarea(Tarea tarea);
    void asignarComentario(Long id, Comentario comentario);
}
