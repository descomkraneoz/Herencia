public class ListaMultimedia {
    private Multimedia[] listadoObjetosMultimedia;
    private int numeroObjetosListaMultimedia = 0;

    public ListaMultimedia(int tamanioLista) {
        this.listadoObjetosMultimedia = new Multimedia[tamanioLista];
    }


    public boolean addObjetoMultimedia(Multimedia obj) {
        if (numeroObjetosListaMultimedia < this.listadoObjetosMultimedia.length) {
            this.listadoObjetosMultimedia[numeroObjetosListaMultimedia] = obj;
            numeroObjetosListaMultimedia++;
            return false;
        }
        return true;
    }

    public Multimedia getBuscaObjetoMultimediaEn(int posicion) {
        return this.listadoObjetosMultimedia[posicion];
    }

    @Override
    public String toString() {
        String salida = "";
        for (int i = 0; i < numeroObjetosListaMultimedia; i++) {
            salida += listadoObjetosMultimedia[i] + "\n";
        }
        return salida;
    }

    public static void main(String[] args) {
        ListaMultimedia miLista = new ListaMultimedia(3);
        miLista.addObjetoMultimedia(new Disco(" Led Zeppelin IV ", "Led Zepelin", "Atlantic", 43, Multimedia.Formato.cdAudio));
        miLista.addObjetoMultimedia(new Disco(" The Number of the Beast  ", "Iron Maiden", "EMI", 40, Multimedia.Formato.cdAudio));
        miLista.addObjetoMultimedia(new Disco(" Highway to Hell  ", "AC/DC", "Atlantic Records y Warner Music Group", 42, Multimedia.Formato.cdAudio));
        System.out.println(miLista.toString());
        System.out.println(miLista.numeroObjetosListaMultimedia);
        System.out.println(miLista.getBuscaObjetoMultimediaEn(1));


    }
}
