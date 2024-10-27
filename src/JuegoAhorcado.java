import java.util.Scanner;

public class JuegoAhorcado {

    public static void main(String[] args) {
        
        // Scanea los datos 
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y Asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 15;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Mostrar la palabra secreta con "_"
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }
        

        // Mientras la palabra no sea adivinada o los intentos no lleguen al limite
        while (!palabraAdivinada && intentos < intentosMaximos) {
            
            // Declaraciones y asignaciones
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
           
            System.out.print("Intruduce una letra XD: ");
            char letra = scanner.next().charAt(0);

            boolean letraCorrecta = false;

            // Agregar la letra si es igual a la letra correspondiente de la palabraSecreta
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra ){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                } 
            }

            // imprimir si la letra es correcta o no
            if(!letraCorrecta){
                intentos++;
                System.out.println("Letra incorrecta: " + letra);
                System.out.println("Intentos: " + (intentosMaximos - intentos));
            }else{
                intentos++;
                System.out.println("Letra correcta: " + letra);
                System.out.println("Intentos: " + (intentosMaximos - intentos));
            }

            // su la letra adivinada esta completa salirse del bucle while
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felizidades a completado la palabra secreta: " + palabraSecreta);
            }
        }

        // cerrar el scanner
        scanner.close();

        // si la palabraAdivinada no se completo
        if(!palabraAdivinada){
            System.out.println("Buen intento para la proxima");
            System.out.println("La palabra secreta es: " + palabraSecreta);
        }
    }
}