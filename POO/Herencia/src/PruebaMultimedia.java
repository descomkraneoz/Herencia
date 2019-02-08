public class PruebaMultimedia {
    public static void main(String[] args) {

        Multimedia peli = new Pelicula("Las dos torres", "Peter Jackson", "Viggo Mortensen", null, 200, Multimedia.Formato.dvd);
        System.out.println(peli);

        Multimedia peli2 = new Pelicula("Las dos torres", "Peter Jackson", "Viggo Mortensen", "Liv Tyler", 250, Multimedia.Formato.avi);


        Multimedia disco = new Disco(" Led Zeppelin IV ", "Led Zepelin", "Atlantic", 43, Multimedia.Formato.cdAudio);
        System.out.println(disco);

        System.out.println(disco.iguales(peli));
        System.out.println(peli.iguales(peli2));
        System.out.println(peli2);
    }
}
