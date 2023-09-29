package com.tareaapi.tareaapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tareaapi.tareaapi.models.Comentario;
import com.tareaapi.tareaapi.models.Tarea;
import com.tareaapi.tareaapi.services.TareaServiceImpl;

@RestController
@RequestMapping("/tarea")
public class TareaRestController {

    @Autowired
    TareaServiceImpl tareaService;

    @GetMapping("/get/{id}")
    public Tarea getTareaPorId(@PathVariable Long id){
        return tareaService.getTareaPorId(id);
    }

    @PostMapping("/create/nuevo")
    public void createTarea(@RequestBody Tarea tarea){
        tareaService.createTarea(tarea);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTareaPorId(@PathVariable Long id){
        tareaService.deleteTareaPorId(id);
    }

    @PutMapping("/update/{id}")
    public void updateTareaPorId(@PathVariable Long id, @RequestBody Tarea tarea){
        tareaService.updateTareaPorId(id, tarea);
    }

    @RequestMapping("/addcomentario/{id}")
    public void asignarComenario(@PathVariable Long id, @RequestBody Comentario comentario){
        tareaService.asignarComentario(id,comentario);
    }
}
