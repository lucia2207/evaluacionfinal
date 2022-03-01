package evaluacionfinal;

public class Main {
    public static void main (String[] args){

        Serie serie1 = new Serie("Arcane", 1, "Ciencia ficción", "Christian Linke Alex Yee");
        Serie serie2 = new Serie("El juego del calamar", 1, "Suspenso", "Hwang Dong-hyuk");
        Serie serie3 = new Serie("Gambito de dama", "Allan Scott");
        Serie serie4 = new Serie();
        Serie serie5 = new Serie("Chicas buenas", 4, "Drama criminal", "Jenna Bans");
        Serie[] series = {serie1, serie2, serie3, serie4, serie5};

        Videojuego vj1 = new Videojuego();
        Videojuego vj2 = new Videojuego("League of Legends", 8);
        Videojuego vj3 = new Videojuego("Valorant", 12, "Shooter", "Riot Games");
        Videojuego vj4 = new Videojuego();
        Videojuego vj5 = new Videojuego("Genshin Impact", 3);
        Videojuego[] videojuegos = {vj1, vj2, vj3, vj4, vj5};

        serie1.entregar();
        serie3.entregar();
        serie5.entregar();
        vj2.entregar();
        vj3.entregar();

        int contadorSeriesEntregadas = 0;
        int contadorVideojuegosEntregados = 0;

        Videojuego mayorHorasEstimadas = videojuegos[0];
        Serie mayorTemporadas = series[0];

        for(Videojuego videojuego : videojuegos){
            if(videojuego.isEntregado()){
                System.out.println("El videojuego "+videojuego.titulo+" está entregado.");
                videojuego.devolver();
                contadorVideojuegosEntregados += 1;
            }
            mayorHorasEstimadas = (Videojuego)mayorHorasEstimadas.compareTo(videojuego);
        }

        for(Serie serie : series){
            if(serie.isEntregado()){
                System.out.println("La serie "+serie.titulo+" está entregada.");
                serie.devolver();
                contadorSeriesEntregadas += 1;
            }
            mayorTemporadas = (Serie)mayorTemporadas.compareTo(serie);
        }

        System.out.println("La cantidad de videojuegos entregados es: "+contadorVideojuegosEntregados+".");
        System.out.println("La cantidad de series entregadas es: "+contadorSeriesEntregadas+".");
        System.out.println("\nLa serie con mayor temporadas es: ");
        System.out.println(mayorTemporadas);
        System.out.println("\nEl videojuego con mayor cantidad de horas estimadas es: ");
        System.out.println(mayorHorasEstimadas);
    }
}

    //ejercicio 17
    /*Lavadora lav1 = new Lavadora();
    Lavadora lav2 = new Lavadora(100, 50);
    Lavadora lav3 = new Lavadora(80);
    Television tv1 = new Television();
    Television tv2 = new Television(200, 25);
    Television tv3 = new Television(55, true);
    Television tv4 = new Television(43, false);
    Electrodomesticos batidora = new Electrodomesticos();
    Electrodomesticos licuadora = new Electrodomesticos(100, 1);
    Electrodomesticos cafetera = new Electrodomesticos(60, "Negro", 'C', 1.5);

    Electrodomesticos[] productos = {lav1, lav2, lav3, tv1, tv2, tv3, tv4, batidora, licuadora, cafetera};
    double precioTotalLavadora = 0;
    double precioTotalTelevision = 0;
    double precioTotalElectrodomesticos = 0;
    double precio;
        for (Electrodomesticos producto : productos) {
                if(producto.getClass() == Lavadora.class){
        precio = ((Lavadora) producto).precioFinal(((Lavadora) producto).getCarga());
        precioTotalLavadora += precio;
        precioTotalElectrodomesticos += precio;
        System.out.println("Soy una lavadora y mi precio final es de: "+precio+"€.");
        } else if(producto.getClass() == Television.class){
        precio = ((Television) producto).precioFinal(((Television) producto).resolucion, ((Television) producto).sintonizadorTDT);
        precioTotalTelevision += precio;
        precioTotalElectrodomesticos += precio;
        System.out.println("Soy una televisión y mi precio final es de: "+precio+"€.");
        } else if(producto.getClass() == Electrodomesticos.class){
        precio = producto.precioFinal(producto.precioBase, producto.consumoEnergetico, producto.peso);
        precioTotalElectrodomesticos += precio;
        System.out.println("Soy un electrodoméstico y mi precio final es de: "+precio+"€.");
        }
        }
        System.out.println("\nEl precio total de televisiones es: "+precioTotalTelevision+"€.");
        System.out.println("El precio total de lavadoras es: "+precioTotalLavadora+"€.");
        System.out.println("El precio total de electrodomésticos (incluye televisiones y lavadoras) es: "+precioTotalElectrodomesticos+"€.");


        //ejercicio 16

        /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = input.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = input.nextInt();
        System.out.println("Ingrese el sexo: ");
        char sexo = input.next().charAt(0);
        System.out.println("Ingrese el peso: ");
        double peso = input.nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura = input.nextDouble();

        Persona per1 = new Persona(nombre, edad, sexo, peso, altura);

        Persona per2 = new Persona(nombre, edad, sexo);

        Persona per3 = new Persona();
        per3.setNombre(nombre);
        per3.setEdad(edad);
        per3.setSexo(sexo);
        per3.setPeso(peso);
        per3.setAltura(altura);

        System.out.println("Persona 1:");
        switch(per1.calcularIMC()){
            case -1:
                System.out.println("La persona está en su peso ideal.");
                break;
            case 0:
                System.out.println("La persona está por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                break;
        }

        if(per1.esMayorDeEdad())
            System.out.println("La persona es mayor de edad.");
        else
            System.out.println("La persona es menor de edad.");

        System.out.println(per1);

        System.out.println("Persona 2:");
        switch(per2.calcularIMC()){
            case -1:
                System.out.println("La persona está en su peso ideal.");
                break;
            case 0:
                System.out.println("La persona está por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                break;
        }

        if(per2.esMayorDeEdad())
            System.out.println("La persona es mayor de edad.");
        else
            System.out.println("La persona es menor de edad.");

        System.out.println(per2);

        System.out.println("Persona 3:");
        switch(per3.calcularIMC()){
            case -1:
                System.out.println("La persona está en su peso ideal.");
                break;
            case 0:
                System.out.println("La persona está por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                break;
        }

        if(per3.esMayorDeEdad())
            System.out.println("La persona es mayor de edad.");
        else
            System.out.println("La persona es menor de edad.");

        System.out.println(per3);
    }
}
    //ejercicio 15
    /*int opciones;
        do{
                System.out.println("****** GESTIÓN CINEMATOGRAFICA ******\n" +
                "1- NUEVO ACTOR\n" +
                "2- BUSCAR ACTOR\n" +
                "3- ELIMINAR ACTOR\n" +
                "4- MODIFICAR ACTOR\n" +
                "5- VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7- VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8- SALIR\n");
                Scanner input = new Scanner(System.in);
                System.out.println("Ingrese una opción: ");
                opciones = input.nextInt();
                switch(opciones){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                break;
default:
        System.out.println("El número ingresado no es válido.\n");
        }
        }while(opciones != 8);

    //ejercicio 14

    /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
                int numerito = input.nextInt();
                if(numerito <= 1000){
                for(int i = numerito; i <= 1000; i += 2)
                System.out.println(i);
                } else
                System.out.println("El número ingresado es mayor que 1000.");

        //EJERCICIO 13
        //DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //System.out.println("Fecha y hora actual: "+dateTime.format(LocalDateTime.now())+".");


        //EJERCICIO 12
        /*Scanner input = new Scanner(System.in);
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

         */
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
