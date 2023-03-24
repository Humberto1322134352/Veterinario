package Codigo;

public class Animal {
    
    private String tipo;
    private int edad;
    private int precio;
    private boolean enfermo;
    
    public Animal(String pTipo, int pEdad, int pPrecio, boolean pEnfermo){
        
        tipo = pTipo;
        edad = pEdad;
        precio = pPrecio;
        enfermo = pEnfermo;
            
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEnfermo() {
        return enfermo;
    }

    public void setEnfermo(boolean enfermo) {
        this.enfermo = enfermo;
    }
    
    
    
}
