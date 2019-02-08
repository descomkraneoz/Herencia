public class Disco extends Multimedia {

    private final String compania;


    public Disco(String titulo, String autor, String compania, int duracion, Formato formato) {
        super(titulo, autor, duracion, formato);
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "El disco " + "\"" + getTitulo() + "\"" + " del autor/es " + getAutor() + " grabado por la compañía " + compania + " tiene una duración de " + getDuracion() + " minutos y el formato multimedia es " + formato;
    }
}
