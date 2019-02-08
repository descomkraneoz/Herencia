public class Disco extends Multimedia {

    private final String compania;

    enum Genero {
        Blues, Corrido, Country, Cumbia, Disco, Electrónica, Flamenco, Folk, Funk, Gospel, Heavy_Metal, Hip_Hop,
        Indie​, Jazz​, Merengue, Pop, Punk, Ranchera, Rap, Reggae, Reggaeton, Rumba, Rhythm_and_Blues, Rock,
        Rock_and_Roll, Salsa, Son, Soul, Tango, Vallenato;
    }

    Genero genero;


    public Disco(String titulo, String autor, String compania, Genero genero, int duracion, Formato formato) {
        super(titulo, autor, duracion, formato);
        this.compania = compania;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "El disco " + "\"" + getTitulo() + "\"" + " de género musical " + genero + " del autor/es " + getAutor() + " grabado por la compañía " + compania + " tiene una duración de " + getDuracion() + " minutos y el formato multimedia es " + formato;
    }
}