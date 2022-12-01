public class Main
{
    public static void main(String[] args) {
        String estacion = "otoño";
        
        switch(estacion) {
            case "primavera":
                System.out.println("Es " + estacion);
                break;
            case "verano":
                System.out.println("Es " + estacion);
                break;
            case "otoño":
                System.out.println("Es " + estacion);
                break;
            case "invierno":
                System.out.println("Es " + estacion);
                break;
            default:
                System.out.println(estacion + " NO es una estacion");
        }
    }
}

