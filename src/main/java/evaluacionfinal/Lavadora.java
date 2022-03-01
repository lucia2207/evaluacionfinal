package evaluacionfinal;

public class Lavadora extends Electrodomesticos{
    double carga;

    public Lavadora(){
        this.carga = 5;
    }

    public Lavadora(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.carga = 5;
    }

    public Lavadora(double carga){
        this.carga = carga;
    }

    public double precioFinal(double carga){
        double precioFinal = precioFinal(this.precioBase, this.consumoEnergetico, this.peso);
        if(carga > 30)
            precioFinal += 50;
        return precioFinal;
    }

    @Override public String toString(){
        return "Precio: "+precioBase+"\n" +
                "Color: "+color+"\n" +
                "Consumo Energético: "+consumoEnergetico+"\n" +
                "Peso: "+peso+"kgs\n" +
                "Carga: "+carga+"\n";
    }

    public double getCarga(){
        return this.carga;
    }
}