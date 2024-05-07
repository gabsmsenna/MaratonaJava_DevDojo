package academy.nelioalves.cursojava.domain.Enumeração.Exercício02.Application;

import academy.nelioalves.cursojava.domain.Enumeração.Exercício02.Entities.Comment;
import academy.nelioalves.cursojava.domain.Enumeração.Exercício02.Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) throws ParseException {
        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow! That's awesome!!!");

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post1 = new Post(
                sdf1.parse("21/06/2018 13:05:28"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country",
                185
        );

        post1.addComment(comment1);
        post1.addComment(comment2);

        Post post2 = new Post(
                sdf1.parse("28/07/2018 12:03:44"),
                "Good night guys",
                "See you tomorrow",
                25
        );
        Comment comment3 = new Comment("Good night my man");
        Comment comment4 = new Comment("May the forte be with you");

        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post1);
        System.out.println("---------------");
        System.out.println(post2);
    }
}
