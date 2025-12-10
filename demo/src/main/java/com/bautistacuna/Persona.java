package com.bautistacuna;
/**
 * Clase Persona
 */
public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private String apellidos;

    /**
     * Constructor con argumentos
     * @param nombre //nombre de la persona
     * @param edad //edad de la persona
     * @param direccion //direccion de la persona
     * @param apellidos //apellidos de la persona
     */
    public Persona(String nombre, int edad, String direccion, String apellidos) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.apellidos = apellidos;
    }

    /**
     * Getter email
     * @return el email de la persona
     */
    public String getDireccion(){
        return direccion;
    }
    
}
