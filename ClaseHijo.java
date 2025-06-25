import paquete.Clase1;

public class ClaseHijo extends ClasePadre{
    private  int campo3;

    public int getCampo3() {
        return campo3;
    }

    public void setCampo3(int campo3) {
        this.campo3 = campo3;
    }

    //Modificar los campos de la ClasePadre
    public void setDataPadre(){
        this.campo1 = -50; // variable publica heredada 
        this.setCampo2(22); //super.setCampo2(22);  setCampo2(48);
    }

    public void useClase1(){
        Clase1 objeto1 = new Clase1();
        objeto1.x = 15;
        objeto1.setY(14);
        
        // objeto1.z = 9;       // protected
        // objeto1.w = 39;      // dafault pero en otro paquete
        // objeto1.restW();     // default pero en otro paquete
        
        //c + k + c/v
    }

    @Override
    public String toString() {
        return super.toString() + "ClaseHijo [campo3=" + this.campo3 + "]";
    }
    
}
