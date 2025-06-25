
import paquete.Clase1; //Usar clases que estan en paquetes

public class TestingModificadores {
    public static void main(String[] args) {

        ClasePadre unPapa = new ClasePadre();
        ClaseHijo unHijo = new ClaseHijo();
        Clase1 objeto1 = new Clase1();

        System.out.println(unPapa.toString() + "\n");
        System.out.println(unPapa.toString());
        

        unPapa.campo1 = 28; //modifiar el campo pubico
        unPapa.setCampo2 (-2); //modificar el campo privado
        System.out.println(unPapa.toString());


        //comportamiento de campo privado y publico en el la "clasehijo"
        unHijo.campo1 = 32; //Campo publico heredad se comporta como se comporta en la clase padre
        unHijo.setCampo2(-45); //Campo privado heredado
        unHijo.setCampo2(12); // campo privado propio

        System.out.println(unHijo.toString());


        //Comportamiento de campos de una calse en un paquete
        objeto1.x = 54; //Campo publico 
        objeto1.setY(42); // Campo privado

        //objeto1.z = 28;  //No se puede utilizar(acceder) ya que no esta en el mismo paquete y es de tipo "protected"

        System.out.println(objeto1.toString());
    
    }
}
