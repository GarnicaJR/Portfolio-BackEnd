package com.apiportfolio.apiportfolio.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Integer idUsuario;
    
    
    private String nombre;
    
    
    private String apellido;
    
    
    private String correo;
    
    
    private String password;
    
    
    
    private String Sobre_Mi;
    
    
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEducacion")
    private List<Educacion> educacionList;
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExperiencia")
    private List<Experiencia> experienciaList;
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProyectos")
    private List<Proyectos> proyectoList;
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkills")
    private List<Skills> skillsList;
    

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nombre, String apellido, String correo, String password, String Sobre_Mi) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.Sobre_Mi = Sobre_Mi;
    }

    
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSobre_Mi() {
        return Sobre_Mi;
    }

    public void setSobre_Mi(String Sobre_Mi) {
        this.Sobre_Mi = Sobre_Mi;
    }

    
}
