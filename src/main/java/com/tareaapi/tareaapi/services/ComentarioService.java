package com.tareaapi.tareaapi.services;

import com.tareaapi.tareaapi.models.Comentario;

public interface ComentarioService {

    Comentario getComentarioPorId(Long id);
    void deleteComentarioPorId(Long id);
    void updateComentarioPorId(Long id, Comentario comentario);
    void createComentario(Comentario comentario);
}
