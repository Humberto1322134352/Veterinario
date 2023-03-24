package Codigo;

public class Tienda {
    
    Animal animal1;
    Animal animal2;
    Animal animal3;
    Animal animal4;
    
    public Tienda(Animal pAnimalUno, Animal pAnimalDos, Animal pAnimalTres, Animal pAnimalCuatro){
        
        animal1 = pAnimalUno;
        animal2 = pAnimalDos;
        animal3 = pAnimalTres;
        animal4 = pAnimalCuatro;
    }
    
    public String darMasViejo(){
        
        if(animal1.getEdad() > animal2.getEdad() && animal1.getEdad() > animal3.getEdad() && animal1.getEdad() > animal4.getEdad()){
            
            return animal1.getTipo();
            
        }else if(animal2.getEdad() > animal1.getEdad() && animal2.getEdad() > animal3.getEdad() && animal2.getEdad() > animal4.getEdad()){
            
            return animal2.getTipo();
            
        }else if(animal3.getEdad() > animal1.getEdad() && animal3.getEdad() > animal2.getEdad() && animal3.getEdad() > animal4.getEdad()){
            
            return animal3.getTipo();
            
        }else{
            
            return animal4.getTipo();
        }
    } 
    
    public String darMasCaro(){
        
        if(animal1.getPrecio() > animal2.getPrecio() && animal1.getPrecio() > animal3.getPrecio() && animal1.getPrecio() > animal4.getPrecio()){
            
            return animal1.getTipo();
            
        }else if(animal2.getPrecio() > animal1.getPrecio() && animal2.getPrecio() > animal3.getPrecio() && animal2.getPrecio() > animal4.getPrecio()){
            
            return animal2.getTipo();
            
        }else if(animal3.getPrecio() > animal1.getPrecio() && animal3.getPrecio() > animal2.getPrecio() && animal3.getPrecio() > animal4.getPrecio()){
            
            return animal3.getTipo();
            
        }else{
            
            return animal4.getTipo();
        }
    }
}
