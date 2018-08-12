package com.company;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SrubskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, Integer>> map = new LinkedHashMap<>();
        String regex = "^([a-zA-Z ]+)\\ \\@([a-zA-Z ]+)\\ ([0-9]+)\\ ([0-9]+)$";
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        while(!"End".equals(line)){
            if(matcher.find()){
                String name = matcher.group(1);
                String venue = matcher.group(2);
                int ticketsPrice = Integer.parseInt(matcher.group(3));
                int ticketsCount = Integer.parseInt(matcher.group(4));

                if(map.containsKey(venue)){
                    LinkedHashMap<String, Integer> m = map.get(venue);
                    if(m.containsKey(name)){
                        m.put(name, m.get(name) + ticketsPrice * ticketsCount);
                        map.put(venue, m);
                    }
                    else{
                        m.put(name,ticketsPrice * ticketsCount);
                        map.put(venue, m);
                    }
                }
                else{
                    LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
                    m.put(name, ticketsPrice * ticketsCount);
                    map.put(venue, m);
                }

            }
            line = scanner.nextLine();
            matcher = pattern.matcher(line);
        }

        for (String venue:map.keySet()) {
            System.out.println(venue);
            Map<String, Integer> m = crunchifySortByValue(map.get(venue));
            for (String name:m.keySet()) {
                System.out.println("#  " + name + " -> " + m.get(name));
            }
        }

    }

    public static <K, V extends Comparable<? super V>> Map<K, V> crunchifySortByValue(Map<K, V> crunchifyMap) {

        Map<K, V> crunchifyResult = new LinkedHashMap<>();
        Stream<Map.Entry<K, V>> sequentialStream = crunchifyMap.entrySet().stream();

        // comparingByValue() returns a comparator that compares Map.Entry in natural order on value.
        sequentialStream.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(c -> crunchifyResult.put(c.getKey(), c.getValue()));
        return crunchifyResult;
    }
}
