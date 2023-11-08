package academy.devdojo.maratonajava.javacore.Csobrecargademétodos.Test;

import academy.devdojo.maratonajava.javacore.Csobrecargademétodos.Domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One Piece", "TV", 1050, "Shounen");
        anime.imprime();
    }
}
