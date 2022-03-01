package evaluacionfinal;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private String DNI = generarDNI();

    public Persona(){
        nombre = "";
        edad = 0;
        sexo = 'H';
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setSexo(char sexo){
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override public String toString(){
        return "Nombre: "+nombre+"\n" +
                "DNI: "+DNI+"\n" +
                "Edad: "+edad+" años\n" +
                "Sexo: "+((sexo == 'M') ? "Mujer" : "Hombre")+"\n" +
                "Peso: "+peso+"kgs\n" +
                "Altura: "+altura+"mts\n";
    }

    public String generarDNI(){
        int DNI = (int)(100000000 * Math.random());
        char LetraDNI = obtenerLetra(DNI);
        String DNICompleta = DNI+""+LetraDNI;
        return DNICompleta;
    }

    public char obtenerLetra(int DNI){
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letras[DNI % 23];
    }

    public int calcularIMC() {
        double pesoKgs = this.peso;
        double alturaMts = this.altura;
        double IMC = (pesoKgs / (Math.pow(alturaMts, 2)));
        if (IMC < 20)
            return -1;
        else if (IMC > 25)
            return 1;
        else
            return 0;
    }

    public boolean esMayorDeEdad(){
        return (this.edad >= 18);
    }

    public char comprobarSexo(char sexo){
        return (sexo == 'm' || sexo == 'M') ? 'M': 'H';
    }
}