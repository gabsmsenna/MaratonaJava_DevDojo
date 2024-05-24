package academy.nelioalves.cursojava.domain.TStream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10).map(x -> x * 3);
        System.out.println(Arrays.toString(stream.toArray()));

        Stream<String> stream2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(stream2.toArray()));

        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(stream3.limit(10000).toArray()));

        Stream<Long> stream4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] +p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(stream4.limit(100).toArray()));
    }
}
