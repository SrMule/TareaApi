package com.tareaapi.tareaapi.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tareaapi.tareaapi.models.Comentario;
import com.tareaapi.tareaapi.repositories.ComentarioRepository;

@Service
@Transactional
public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    ComentarioRepository comentarioRepository;

    @Override
    public Comentario getComentarioPorId(Long id) {
        if (comentarioRepository.existsById(id)){
            return comentarioRepository.findById(id).get();
        }else{
            return null;
        }
    }

    @Override
    public void deleteComentarioPorId(Long id) {
        comentarioRepository.deleteById(id);
    }

    @Override
    public void updateComentarioPorId(Long id, Comentario comentario) {
        Comentario comentarioAEditar = comentarioRepository.findById(id).get();
        comentarioAEditar.setComentarioTexto(comentarioAEditar.getComentarioTexto());
        comentarioAEditar.setComentarioFecha(comentarioAEditar.getComentarioFecha());
        comentarioAEditar.setTarea(comentarioAEditar.getTarea());
        comentarioRepository.save(comentario);
    }

    @Override
    public void createComentario(Comentario comentario) {
        comentarioRepository.save(comentario);

    }
}
