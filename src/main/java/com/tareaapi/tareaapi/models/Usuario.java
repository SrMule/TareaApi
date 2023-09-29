package com.tareaapi.tareaapi.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long usuarioId;

    @Column(name = "nombre")
    private String usuarioNombre;

    @Column(name = "correo")
    private String usuarioEmail;

    @OneToMany(mappedBy = "usuario", cascade=CascadeType.ALL)
    @JsonBackReference
    private List<Tarea> listaDeTareas;
}
