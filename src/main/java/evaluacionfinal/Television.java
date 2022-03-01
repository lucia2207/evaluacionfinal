package evaluacionfinal;

public class Television extends Electrodomesticos {
    int resolucion;
    boolean sintonizadorTDT;

    public Television(){
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precioBase, double peso){
        this.resolucion = 20;
        this.sintonizadorTDT = false;
        this.peso = peso;
        this.precioBase = precioBase;
    }

    public Television(int resolucion, boolean sintonizadorTDT){
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double precioFinal(int resolucion, boolean sintonizadorTDT){
        double precioFinal = precioFinal(this.precioBase, this.consumoEnergetico, this.peso);
        if(resolucion > 40)
            precioFinal += (precioFinal*0.30);
        if(sintonizadorTDT)
            precioFinal += 50;
        return precioFinal;
    }

    public int getResolucion(){
        return this.resolucion;
    }

    public boolean getSintonizadorTDT(){
        return this.sintonizadorTDT;
    }

    @Override public String toString(){
        return "Precio: "+precioBase+"\n" +
                "Color: "+color+"\n" +
                "Consumo Energético: "+consumoEnergetico+"\n" +
                "Peso: "+peso+"kgs\n" +
                "Sintonizador TDT: "+sintonizadorTDT+"\n" +
                "Resolución: "+resolucion+"\n";
    }
}