package lab6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.BreakIterator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 19/05/2016.
 */
public class MostPopularWordsMain {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("britniy.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        Stream<String> lines = reader.lines();
        Map<String, Long> map = lines.flatMap(line -> getWords(line).stream()).
                collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        long maxCount = map.entrySet().stream().
                max(Map.Entry.comparingByValue()).get().getValue();
        Set<String> top1 = map.entrySet().stream().
                filter(entry -> entry.getValue() == maxCount).
                map(Map.Entry::getKey).
                collect(Collectors.toSet());

        System.out.println(top1.iterator().next());
    }

    public static List<String> getWords(String text) {
        List<String> words = new ArrayList<String>();
        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(text);
        int lastIndex = breakIterator.first();
        while (BreakIterator.DONE != lastIndex) {
            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
                words.add(text.substring(firstIndex, lastIndex));
            }
        }

        return words;
    }
}














