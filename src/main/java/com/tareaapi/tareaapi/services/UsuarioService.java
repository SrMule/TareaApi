package com.tareaapi.tareaapi.services;

import com.tareaapi.tareaapi.models.Tarea;
import com.tareaapi.tareaapi.models.Usuario;

public interface UsuarioService {

    Usuario getUsuarioPorId(Long id);
    void deleteUsuarioPorId(Long id);
    void updateUsuarioPorId(Long id, Usuario usuario);
    void createUsuario(Usuario usuario);
    void asignarTarea(Long id,Tarea tarea);
}
