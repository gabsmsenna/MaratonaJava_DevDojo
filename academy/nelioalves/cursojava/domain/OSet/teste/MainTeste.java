package academy.nelioalves.cursojava.domain.OSet.teste;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainTeste {
    public static void main(String[] args) {
        speedTest();
    }

    private static int countForSpeedTest(Set<?> set) {
        int count = 0;
        for (Object o : set)
            count++;
        return count;
    }

    private static void speedTest(Set<?> set) {
        @SuppressWarnings("unused")
        int count = 0;
        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++)
            count = countForSpeedTest(set);
        final long endTime = System.currentTimeMillis();
        final long time = endTime - startTime;
        System.out.println(set.getClass().getSimpleName() + ": " + time + " ms");
    }

    private static void speedTest() {

        final Set<Integer> hashSet = new HashSet<>();
        final Set<Integer> linkedHashSet = new LinkedHashSet<>();
        final Set<Integer> treeSet = new TreeSet<>();

        for (Integer i = 10000; i > 0; i--) {
            hashSet.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
        }

        speedTest(hashSet);
        speedTest(linkedHashSet);
        speedTest(treeSet);
    }
}
