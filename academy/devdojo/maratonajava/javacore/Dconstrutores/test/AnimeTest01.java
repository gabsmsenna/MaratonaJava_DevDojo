package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "TV", 1070, "Shounen", "Mappa");
        anime.imprime();
    }
}
