public class Pelicula extends Multimedia {

    private String actorPrincipal;
    private String actrizPrincipal;


    public Pelicula(String titulo, String director, String actorPrincipal, String actrizPrincipal, int duracion, Formato formato) {
        super(titulo, director, duracion, formato);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        String salida = "";
        salida += "La película " + "\"" + getTitulo() + "\"" + " del director " + getAutor() + ",";
        salida += getActorPrincipal() == null ? "," : " cuyo actor principal es " + getActorPrincipal();
        salida += getActrizPrincipal() == null ? "," : " y cuya actriz principal es " + getActrizPrincipal() + ",";
        salida += " tiene una duración de " + getDuracion() + " minutos y el formato multimedia es " + formato;
        return salida;
    }
}