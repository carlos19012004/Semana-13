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
    

    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public String getApellidos() {
        return apellidos;
    }


    public static Persona factory(String cadena){
        if(cadena==null){
            throw new IllegalArgumentException("No son válidos los argumentos");
        }
        String partes[]= cadena.split(",");

        if(partes.length!=4){
            throw new IllegalArgumentException("No son válidos los argumentos");
        }
        try {
            int edad = Integer.parseInt(partes[1]);
            return new Persona(partes[0], edad, partes[2], partes[3]);
        } catch (Exception e) {
            throw new IllegalArgumentException("No son válidos los argumentos");
        }
        
        
    }
    /**
     * Getter email
     * @return el email de la persona
     */
    public String getDireccion(){
        return direccion;
    }

    
}
