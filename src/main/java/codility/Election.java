package codility;

import java.util.*;

public class Election {
    public String findWinner(String[] names) {

        if(names.length > 0) {
            List<String> listOfNames = Arrays.asList(names);
            Map<String, Integer> voices = new TreeMap<>(Collections.reverseOrder());

            for (String name : listOfNames) {
                int numberOfVoices = Collections.frequency(listOfNames, name);
                voices.putIfAbsent(name, numberOfVoices);
            }

            return Collections.max(voices.entrySet(), Map.Entry.comparingByValue()).getKey();
        } else {
            return "No result";
        }
    }

    public static void main(String[] args) {
        String[] v1 = new String[]{"Jan", "Kamil", "Ala", "Ala", "Tomek", "Lukasz", "Anna", "Anna"};
        Election election = new Election();

        System.out.println(election.findWinner(v1));
    }
}
