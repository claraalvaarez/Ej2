package ejercicio;

public class Ejercicio7 {

    public static String cifrarCadena(String str, int desplazamiento) {
        if (str.isEmpty()) {
            return "";
        } else {
            
            char primerCaracter = str.charAt(0);
            // Verificamos si es una letra del alfabeto
            if (Character.isLetter(primerCaracter)) {
                
                char nuevoCaracter = cifrarCaracter(primerCaracter, desplazamiento);
                
                return nuevoCaracter + cifrarCadena(str.substring(1), desplazamiento);
            } else {
                
                return primerCaracter + cifrarCadena(str.substring(1), desplazamiento);
            }
        }
    }

    private static char cifrarCaracter(char caracter, int desplazamiento) {
        
        int valorAscii = (int) caracter;
        
        desplazamiento = desplazamiento % 26;
        
        if (Character.isUpperCase(caracter)) {
            return (char) ((valorAscii - 'A' + desplazamiento + 26) % 26 + 'A');
        } else {
            return (char) ((valorAscii - 'a' + desplazamiento + 26) % 26 + 'a');
        }
    }
}
