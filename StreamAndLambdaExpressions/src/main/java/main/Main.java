package main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        flatMapAndMap();
    }

    public static void flatMapAndMap() {
        List<List<String>> words = Arrays.asList(
                Arrays.asList("word1", "word2", "word3"),
                Arrays.asList("word4", "word5", "word6"),
                Arrays.asList("word7", "word8", "word9")
                );
        List<List<Integer>> listMap = words.stream()
                .map(list->list.stream().map(String::length))
                .map(stream->stream.collect(Collectors.toList()))
                .collect(Collectors.toList());
        System.out.println(listMap);

        List<Integer> listFlatMap = words.stream()
                .flatMap(list->list.stream().map(String::length))
                .collect(Collectors.toList());
        System.out.println(listFlatMap);
    }

    public static void firstStream() {
        List<String> words = Arrays.asList("word1", "word2", "word3");
        find(words, "word1").ifPresent(System.out::println);

        Arrays.asList("word1", "word2", "word3").stream()
                .filter((word)->word.equalsIgnoreCase("word1"))
                .findFirst()
                .ifPresent(System.out::println);
    }

    private static Optional<String> find (List<String> words, String s){
        for (String word: words) {
            if(word.equalsIgnoreCase(s)) return Optional.of(word);
        }
        return Optional.empty();
    }

}
