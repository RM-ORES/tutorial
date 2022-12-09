package Strings;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class StrMenú {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menú General:");
            System.out.println("1. Menú String");
            System.out.println("2. Menú StringBuilder");
            System.out.println("3. Menú String.2");
            System.out.println("4. Palíndromo");
            System.out.println("5. Paso a mayúsculas");
            System.out.println("6. Substring");
            System.out.println("7. Orden alfabético");
            System.out.println("8. Salir");
            option = input.nextInt();
            switch (option) {
                case 1:
                    strej1 ();
                    break;
                case 2:
                    strej2 ();
                    break;
                case 3:
                    strej3 ();
                    break;
                case 4:
                    strej4 ();
                    break;
                case 5:
                    strej5 ();
                    break;
                case 6:
                    strej6 ();
                    break;
                case 7:
                    strej7 ();
                    break;
                case 8:
                    System.out.println("Fin del menú");
                    break;
                default:
                    System.out.println("Input erróneo, introduzca un número del 1 al 11");
            }

        } while (option != 8);
    }

    private static void strej1() throws IOException {
        /* 1.	Hacer un menú que permita al usuario conocer el uso de 10 métodos
        de la clase String. El programa debe dar la opción 11 para poder salir del
        mismo.  */
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menú String:");
            System.out.println("1. Encontrar char (charAt");
            System.out.println("2. Encontrar índice (indexOf)");
            System.out.println("3. Reemplazar letra (replace)");
            System.out.println("4. Averiguar largo (length)");
            System.out.println("5. Sumar cadenas (concat)");
            System.out.println("6. Comprobar si dos cadenas son iguales independientemente de case (equalsIgnorecase)");
            System.out.println("7. Sacar últimos 3 caracteres de una cadena (substring)");
            System.out.println("8. Comparar final de una cadena (endsWidth)");
            System.out.println("9. Dividir cadena (split)");
            System.out.println("10. Pasar a minúsculas (toLowerCase)");
            System.out.println("11. Salir");
            option = input.nextInt();
            switch (option) {
                case 1:
                    methodej1 ();
                    break;
                case 2:
                    methodej2 ();
                    break;
                case 3:
                    methodej3 ();
                    break;
                case 4:
                    methodej4 ();
                    break;
                case 5:
                    methodej5 ();
                    break;
                case 6:
                    methodej6 ();
                    break;
                case 7:
                    methodej7 ();
                    break;
                case 8:
                    methodej8 ();
                    break;
                case 9:
                    methodej9 ();
                    break;
                case 10:
                    methodej10 ();
                    break;
                case 11:
                    System.out.println("Fin del menú.");
                    break;
                default:
                    System.out.println("Input erróneo, introduzca un número del 1 al 11");
            }

        } while (option != 11);
    }

    private static void methodej1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra0 = input.nextLine();
        System.out.println("¿Qué índice quieres encontrar?");
        int indexchar = input.nextInt();
        System.out.println("El char en la posición " + indexchar + " es: " + palabra0.charAt(indexchar-1));
    }

    private static void methodej2() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra1 = input.nextLine();
        System.out.println("¿Qué letra quieres encontrar?");
        char letra0 = (char) System.in.read();
        System.out.println("La posición de la letra '" + letra0 + "' es: " + (palabra1.indexOf(letra0)+1));
    }

    private static void methodej3() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra2 = input.nextLine();
        System.out.println("¿Qué letra quieres reemplazar?");
        char letra1 = (char) System.in.read();
        System.out.println(palabra2.replace(letra1,'x'));
    }

    private static void methodej4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra3 = input.nextLine();
        System.out.println("La palabra '" + palabra3 + "' tiene " + palabra3.length() + " caracteres.");
    }

    private static void methodej5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra4 = input.nextLine();
        System.out.println("¿Qué quieres sumarle?");
        String palabra5 = input.nextLine();
        System.out.println("La suma de las dos cadenas es: " + palabra4.concat(palabra5));
    }

    private static void methodej6() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra6 = input.nextLine();
        System.out.println("Introduce la palabra a comparar");
        String palabra7 = input.nextLine();
        if (palabra6.equalsIgnoreCase(palabra7)){
            System.out.println("Las palabras introducidas son iguales.");
        } else {
            System.out.println("Las palabras introducidas no son iguales.");
        }
    }

    private static void methodej7() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra8 = input.nextLine();
        System.out.println("Los últimos tres caracteres de la cadena son: '" + palabra8.substring(palabra8.length() - 3) + "'");
    }

    private static void methodej8() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra8 = input.nextLine();
        System.out.println("Introduce final a comparar");
        String fin = input.nextLine();
        if (palabra8.endsWith(fin)) {
            System.out.println("La palabra " + palabra8 + " acaba en " + fin);
        } else {
            System.out.println("La palabra " + palabra8 + " no acaba en " + fin);
        }
    }

    private static void methodej9() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce varias palabras unidas por guiones");
        String palabra9 = input.nextLine();
        String [] div = palabra9.split("-");
        for (int i = 0; i < div.length; i++) {
            System.out.println("Palabra " + (i+1)+ ": " + div[i]);
        }
    }

    private static void methodej10() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra en mayúsculas");
        String palabra10 = input.nextLine();
        System.out.println("En minúsculas: " + palabra10.toLowerCase());
    }

    private static void strej2() {
        /* 2.	Hacer un menú que permita al usuario conocer el uso de 5 métodos
        de la clase StringBuilder. El programa debe dar la opción 6 para poder
        salir del mismo.  */
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menú StringBuffer:");
            System.out.println("1. Concatenar (append)");
            System.out.println("2. Insertar (insert)");
            System.out.println("3. Borrar (delete)");
            System.out.println("4. Reemplazar (replace)");
            System.out.println("5. Invertir (reverse)");
            System.out.println("6. Salir");
            option = input.nextInt();
            switch (option) {
                case 1:
                    bufferej1 ();
                    break;
                case 2:
                    bufferej2 ();
                    break;
                case 3:
                    bufferej3 ();
                    break;
                case 4:
                    bufferej4 ();
                    break;
                case 5:
                    bufferej5 ();
                    break;
                case 6:
                    System.out.println("Fin del menú.");
                    break;
                default:
                    System.out.println("Input erróneo, introduzca un número del 1 al 11");
            }
        } while (option != 6);
    }

    private static void bufferej1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        StringBuilder cadena0 = new StringBuilder(input.nextLine());
        System.out.println("Introduce un valor para añadir");
        int num0 = input.nextInt();
        System.out.println("Resultado: " + cadena0.append(num0));
    }

    private static void bufferej2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        StringBuilder cadena1 = new StringBuilder(input.nextLine());
        System.out.println("Introduce un valor para insertar");
        int num1 = input.nextInt();
        System.out.println("¿En que posición (de 0 en adelante) lo quieres?");
        int pos0 = input.nextInt();
        System.out.println("Resultado: " + cadena1.insert(pos0,num1));
    }

    private static void bufferej3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        StringBuilder cadena2 = new StringBuilder(input.nextLine());
        System.out.println("¿Donde quieres empezar el borrado?");
        int start = input.nextInt();
        System.out.println("¿Donde quieres acabar el borrado?");
        int fin = input.nextInt();
        System.out.println("Resultado: " + cadena2.delete(start,fin));
    }

    private static void bufferej4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        StringBuilder cadena3 = new StringBuilder(input.nextLine());
        System.out.println("¿Con que lo quieres reemplazar?");
        String sust0 = input.nextLine();
        System.out.println("Reemplazando todo menos el primer y último caracter: " + cadena3.replace(1,cadena3.length()-1,sust0));
    }

    private static void bufferej5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        StringBuilder cadena4 = new StringBuilder(input.nextLine());
        System.out.println("Palabra invertida: " + cadena4.reverse());
    }


    private static void strej3() {
        /* 3.Repetir el ejercicio1 pidiendo datos al usuario mediante el uso de
       String, InputStreamReader y BufferedReader. */
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menú String.2:");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3.  ");
            System.out.println("4.  ");
            System.out.println("5.  ");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");
            System.out.println("10. ");
            System.out.println("11. Salir");
            option = input.nextInt();
            switch (option) {
                case 1:
                    method2ej1 ();
                    break;
                case 2:
                    method2ej2 ();
                    break;
                case 3:
                    method2ej3 ();
                    break;
                case 4:
                    method2ej4 ();
                    break;
                case 5:
                    method2ej5 ();
                    break;
                case 6:
                    method2ej6 ();
                    break;
                case 7:
                    method2ej7 ();
                    break;
                case 8:
                    method2ej8 ();
                    break;
                case 9:
                    method2ej9 ();
                    break;
                case 10:
                    method2ej10 ();
                    break;
                case 11:
                    System.out.println("Fin del menú.");
                    break;
                default:
                    System.out.println("Input erróneo, introduzca un número del 1 al 11");
            }

        } while (option != 11);
    }

    private static void method2ej1() {
    }

    private static void method2ej2() {
    }

    private static void method2ej3() {
    }

    private static void method2ej4() {
    }

    private static void method2ej5() {
    }

    private static void method2ej6() {
    }

    private static void method2ej7() {
    }

    private static void method2ej8() {
    }

    private static void method2ej9() {
    }

    private static void method2ej10() {
    }

    private static void strej4() {
        /* 4.	Entrar una serie de caracteres en una tabla, y mirar si esta es un
       “palíndromo” o no lo es. Un palíndromo son aquellas palabras que se leen igual
       de izquierda a derecha que de derecha a izquierda, por ejemplo ALLA. */
        Scanner input = new Scanner(System.in);
        String palabra =  new String();
        System.out.println("Introduzca una palabra y pulse enter al acabar");
        palabra = input.nextLine();
        StringBuilder copia = new StringBuilder(palabra);
        String inverso = new String(copia.reverse());
        if (palabra.equalsIgnoreCase(inverso)){
            System.out.println("La palabra '" + palabra + "' es un palíndromo");
        }else{
            System.out.println("La palabra '" + palabra + "' no es un palíndromo");
        }
    }
    private static void strej5() {
        /* 5.	Programa que convierte un texto en minúsculas a mayúsculas. */
        Scanner input = new Scanner(System.in);
        String texto = new String();
        System.out.println("Introduzca un texto en minúsculas y pulse enter al terminar");
        texto = input.nextLine();
        System.out.println("En mayúsculas: " + texto.toUpperCase());
    }
    private static void strej6() {
        /* 6.	Hacer un programa que:
                1.	Permita obtener la parte izquierda de una cadena de caracteres,
                    indicando el número de caracteres que se desean
                2.	Inicialice la cadena de caracteres a una cadena texto por ejemplo
                    “HOLA MUNDO” y extraiga los 7 primeros caracteres para comprobar que
                    funciona */
        Scanner input = new Scanner(System.in);
        //HOLA MUNDO
        String cadena2 = new String("HOLA MUNDO");
        System.out.println("Los primeros 7 caracteres de '" + cadena2 + "' son '" + cadena2.substring(0,7) + "'");
        //INPUT DEL USUARIO
        System.out.println("Introduzca una frase, pulse enter al acabar");
        String cadena = new String(input.nextLine());
        System.out.println("¿Cuantos caracteres quiere obtener?");
        int num = input.nextInt();
        System.out.println("La cadena completa es: " + cadena);
        System.out.println("La parte izquierda de la cadena es '" + cadena.substring(0,num) + "'");

    }
    private static void strej7() {
        /* 7.	Programa que ordena por orden alfabético varias palabras. */
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuantas palabras desea introducir?");
        int num = input.nextInt();
        String palabras [] = new String[num];
        input.nextLine();
        System.out.println("Introduzca las palabras separadas por un enter");
        for (int i = 0; i < palabras.length; i++) {
            palabras [i] = input.nextLine();
        }
        System.out.print("Sin ordenar: ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(" " + palabras[i]);
        }
        Arrays.sort(palabras);
        System.out.println("Ordenado: " + Arrays.toString(palabras));
    }

}
