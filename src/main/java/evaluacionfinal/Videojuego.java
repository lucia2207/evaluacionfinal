package evaluacionfinal;

public class Videojuego extends Entregable {
    String titulo;
    int horasEstimadas;
    boolean entregado;
    String genero;
    String compania;

    public Videojuego(){
        this.horasEstimadas = 10;
        this.entregado = false;
    }

    public Videojuego(String titulo, int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public int getHorasEstimadas(){
        return this.horasEstimadas;
    }

    public String getGenero(){
        return this.genero;
    }

    public String getCompania(){
        return this.compania;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setHorasEstimadas(int horasEstimadas){
        this.horasEstimadas = horasEstimadas;
    }

    public void setCompania(String compania){
        this.compania = compania;
    }

    @Override
    public String toString(){
        return "Título: "+titulo+"\n" +
                "Horas estimadas: "+horasEstimadas+"\n" +
                "Género: "+genero+"\n" +
                "Compañía: "+compania+"\n" +
                "Entregado: "+entregado;
    }

    @Override
    public void entregar(){
        this.entregado = true;
    }

    @Override
    public void devolver(){
        this.entregado = false;
    }

    @Override
    public boolean isEntregado(){
        return this.entregado;
    }

    @Override
    public Object compareTo(Object a) {
        if(this.getHorasEstimadas() < ((Videojuego) a).horasEstimadas)
            return a;
        return this;
    }
}