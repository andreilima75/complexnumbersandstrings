package me.andrei;

import java.text.Normalizer;
import java.util.*;
import java.util.stream.Collectors;

public class StringList {

    public static void main(String[] args) {

        Map<String, Integer> maps = new HashMap<>();
        for (String arg : args) {
            arg = flattenToAscii(arg).toUpperCase(Locale.ROOT);
            if (maps.containsKey(arg)) {
                maps.put(arg, maps.get(arg) + 1);
            } else {
                maps.put(arg, 1);
            }
        }

        final Map<String, Integer> nomesOrdenados = maps.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(nomesOrdenados.toString());
    }

    public static String flattenToAscii(String string) {
        StringBuilder sb = new StringBuilder(string.length());
        string = Normalizer.normalize(string, Normalizer.Form.NFD);
        for (char c : string.toCharArray()) {
            if (c <= '\u007F') sb.append(c);
        }
        return sb.toString();
    }

}
