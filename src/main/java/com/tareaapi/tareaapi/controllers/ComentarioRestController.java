package com.tareaapi.tareaapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tareaapi.tareaapi.models.Comentario;
import com.tareaapi.tareaapi.services.ComentarioServiceImpl;

@RestController
@RequestMapping("/comentario")
public class ComentarioRestController {

    @Autowired
    ComentarioServiceImpl comentarioService;

    @GetMapping("/get/{id}")
    public Comentario getComentarioPorId(@PathVariable Long id){
        return comentarioService.getComentarioPorId(id);
    }

    @PostMapping("/create/nuevo")
    public void createComentario(@PathVariable Comentario comentario){
        comentarioService.createComentario(comentario);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteComentarioPorId(@PathVariable Long id){
        comentarioService.deleteComentarioPorId(id);
    }

    @PutMapping("/update/{id}")
    public void updateComentarioPorId(@PathVariable Long id, @RequestBody Comentario comentario){
        comentarioService.updateComentarioPorId(id,comentario);
    }
}
