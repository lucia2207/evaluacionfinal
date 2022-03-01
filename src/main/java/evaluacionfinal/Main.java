package evaluacionfinal;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra: ");
        String primeraPalabra = input.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        String segunda = input.nextLine();
        boolean length = true;
        if(primeraPalabra.equals(segunda))
            System.out.println("Las palabras son iguales.");
        else {
            for (int i = 0; i < Math.max(primeraPalabra.length(), segunda.length()); i++) {
                try {
                    char charP1 = primeraPalabra.charAt(i);
                    char charP2 = segunda.charAt(i);
                    if (charP1 != charP2)
                        System.out.println("Los caracteres son diferentes en la posición " + (i + 1) + ". ("+charP1+" distinto de "+charP2+").");
                } catch (Exception e) {
                    length = false;
                }
            }
            if(length == false)
                System.out.println("Las palabras no tienen el mismo largo.");
            System.out.println("Las palabras son diferentes.");
        }
    }
}
        //ejercicio 11
        /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frasePasada = input.nextLine();
        int contador = 0;
        for(int i = 0; i < frasePasada.length(); i++){
            char character = frasePasada.charAt(i);
            switch(character){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador += 1;
                    break;
                default:
                    break;
                }
        }
    }
}
    //Ejercicio 10
        /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = input.nextLine();
        String newfrase = frase.replaceAll("\\s+", "");
        System.out.println("La nueva frase es: "+newfrase);

         */

//EJERCIIO 9
       /* String remplazar = "La sonrisa sera la mejor arma contra la tristeza";
        String newAdicional = remplazar.replace('a', 'e');
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase (adicional): ");
        String ingresado = input.nextLine();
        newAdicional = newAdicional + " " + ingresado;
        System.out.println("La nueva cadena es: "+newAdicional);

        */
        //EJERCICIO 8

        /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana: ");
        String day = input.nextLine();
        switch(day.toLowerCase()){
            case "domingo":
                System.out.println("El día "+day+" es un día no laboral.");
                break;
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
            case "viernes":
            case "sábado":
                System.out.println("El día "+day+" es un día laboral.");
                break;

         */
        //EJERCICIO 7
       /* Scanner input = new Scanner(System.in);
        double num;
        do{
            System.out.println("Ingrese un número: ");
            num = input.nextDouble();
        }while(num < 0);
        System.out.println("El número "+num+" es mayor o igual a 0.");

        */

//Ejercicio 6
        /*for(int i = 1; i <= 100; i++){
            if((i % 2) == 0)
                System.out.println("El número "+i+" es par.");
            else
                System.out.println("El número "+i+" es impar.");
        }*/

        //EJERCICIO 5
        /*int nro = 1;

        while( nro <= 100 ){
            if(nro % 2 == 0){ // uso el operador modulo , si el nro es divisible entre 2 su resto sera 0.
                System.out.println("El numero " +nro + " es par");
            } else {
                System.out.println("El numero " +nro + " es impar");
            }
            nro++;
        }

         */

        //Ejercicio 4
        //public static final int IVA = 21;
        /*String preciostr;
        preciostr= JOptionPane.showInputDialog("Ingrese el precio del producto");
        double precio= Double.parseDouble(preciostr);
        double precioFinal= (precio* (100 + IVA)) / 100;
        System.out.println("El precio final del producto es: " +precioFinal);

         */


        //Ejercicio 3
        /*String radiostr;
        radiostr= JOptionPane.showInputDialog("Ingrese el radio de su circulo");
        double radio= Double.parseDouble(radiostr);
        double area= Math.PI * Math.pow(radio,2);
        System.out.println("El area de su circulo es " +area);

         */

        // Ejercicio 2
        /*int nro1 = 0 ;
        int nro2 = 0 ;

        Scanner eConsola= new Scanner(System.in);
        System.out.println("Ingrese en la consola el primer valor ");
        String valorUno = eConsola.nextLine();
        nro1 = Integer.parseInt(valorUno);
        System.out.println("El primer valor ingresado fue: "+valorUno);
        System.out.println("Ingrese un segundo valor");
        String valorDos = eConsola.nextLine();
        nro2 = Integer.parseInt(valorDos);
        System.out.println("Los valores ingresados fueron:"+valorUno+" y "+valorDos);


        if (nro1 < nro2) {
            System.out.println("El numero " + nro2 + " es mayor que el numero " + nro1);
        } else if (nro1 > nro2){
            System.out.println("El numero " + nro1 + " es mayor que el numero " + nro2);
        } else {
            System.out.println("Ambos numeros son iguales");
        }

         */
