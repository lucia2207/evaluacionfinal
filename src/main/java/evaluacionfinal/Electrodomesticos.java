package evaluacionfinal;

import java.util.ArrayList;
import java.util.Locale;

public class Electrodomesticos {
    double precioBase;
    String color;
    char consumoEnergetico;
    double peso;

    public Electrodomesticos(){
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
        this.precioBase = 100;
    }

    public Electrodomesticos(double precioBase, double peso){
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso){
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public String comprobarColor(String color){
        ArrayList<String> colores = new ArrayList<>();
        colores.add("blanco");
        colores.add("negro");
        colores.add("rojo");
        colores.add("azul");
        colores.add("gris");
        if(colores.contains(color.toLowerCase()))
            return color;
        else
            return "Blanco";
    }

    public double precioFinal(double precioBase, char consumoEnergetico, double peso){
        double precioFinal = precioBase;
        switch(consumoEnergetico){
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }

        if(peso <= 19)
            precioFinal += 10;
        else if(peso > 19 && peso <= 49)
            precioFinal += 50;
        else if(peso > 49 && peso <= 79)
            precioFinal += 80;
        else if(peso > 79)
            precioFinal += 100;

        return precioFinal;
    }

    public char comprobarConsumoEnergetico(char consumoEnergetico){
        ArrayList<Character> letras = new ArrayList<>();
        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('E');
        letras.add('F');
        if(letras.contains(consumoEnergetico))
            return consumoEnergetico;
        return 'F';
    }

    public double getPrecioBase(){
        return this.precioBase;
    }

    public String getColor(){
        return this.color;
    }

    public char getConsumoEnergetico(){
        return this.consumoEnergetico;
    }

    public double getPeso(){
        return this.peso;
    }

    @Override public String toString(){
        return "Precio: "+precioBase+"\n" +
                "Color: "+color+"\n" +
                "Consumo Energético: "+consumoEnergetico+"\n" +
                "Peso: "+peso+"kgs\n";
    }
}