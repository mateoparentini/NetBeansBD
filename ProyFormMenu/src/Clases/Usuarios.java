/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author 56929006
 */
public class Usuarios {
    private String nombre;
    private String apellido;
    private String username;
    private String passwd;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String username, String passwd) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.passwd = passwd;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


}
