public class Multimedia {
    private final String titulo;
    private final String autor;
    private final int duracion;

    enum Formato {
        wav, mp3, midi, avi, mov, mpg, cdAudio, dvd;
    }

    Formato formato;


    public Multimedia(String titulo, String autor, int duracion, Formato formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", duracion=" + duracion +
                ", formato=" + formato +
                '}';
    }

    public boolean iguales(Multimedia obj) {
        if (!this.titulo.equals(obj.titulo)) {
            return false;
        } else if (!this.autor.equals(obj.autor)) {
            return false;
        }
        return true;
    }
}
