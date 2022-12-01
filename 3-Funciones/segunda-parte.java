public class Main
{
    public static void main(String[] args) {
        coche miCoche = new coche();
        System.out.println("Mi coche tiene: " + miCoche.puertas + " puertas.");
        miCoche.quitarPuertas();
        System.out.println("Ahora, mi coche tiene: " + miCoche.puertas + " puertas.");
    }
}

class coche {
    public int puertas = 3;
    
    public void quitarPuertas() {
        this.puertas++;
    }
}
