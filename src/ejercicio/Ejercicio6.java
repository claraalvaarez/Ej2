package ejercicio;

public class Ejercicio6{
    public static void main(String[] args) {
        String cadena = "Hola";
        int suma = sumaCodigos(cadena);
        System.out.println("La suma de los códigos de la cadena '" + cadena + "' es: " + suma);
    }

    public static int sumaCodigos(String str) {
        // Caso base: si la cadena está vacía, retorna 0
        if (str.isEmpty()) {
            return 0;
        } else {
            // Obtiene el código del primer carácter y llama recursivamente para el resto de la cadena
            int codigoPrimerCaracter = str.charAt(0);
            String restoCadena = str.substring(1);
            return codigoPrimerCaracter + sumaCodigos(restoCadena);
        }
    }
}
