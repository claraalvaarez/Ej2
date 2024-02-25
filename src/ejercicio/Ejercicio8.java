package ejercicio;

public class Ejercicio8 {
    public static void main(String[] args) {
        String original = "Llego mañana";
        String resultado = conCodigoPar(original);
        System.out.println(resultado);
    }

    public static String conCodigoPar(String str) {
        
        if (str.isEmpty()) {
            return "";
        }
        
        char primerChar = str.charAt(0);
        
        if (primerChar % 2 == 0) {
           
            return primerChar + conCodigoPar(str.substring(1));
        } else {
            
            return conCodigoPar(str.substring(1));
        }
    }
}
