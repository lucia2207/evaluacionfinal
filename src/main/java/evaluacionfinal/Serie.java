package evaluacionfinal;

public class Serie extends Entregable {
    String titulo;
    int temporadas;
    boolean entregado;
    String genero;
    String creador;

    public Serie(){
        this.temporadas = 3;
        this.entregado = false;
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int temporadas, String genero, String creador){
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getGenero(){
        return this.genero;
    }

    public String getCreador(){
        return this.creador;
    }

    public int getTemporadas(){
        return this.temporadas;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setCreador(String creador){
        this.creador = creador;
    }

    @Override
    public String toString(){
        return "Título: "+titulo+"\n" +
                "Creador: "+creador+"\n" +
                "Género: "+genero+"\n" +
                "Temporadas: "+temporadas+"\n" +
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
        if(this.temporadas < ((Serie) a).temporadas)
            return a;
        return this;
    }
}