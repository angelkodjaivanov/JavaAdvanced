package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class GenomeProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> genes = new LinkedHashMap<>();
        String line = bf.readLine();
        while(!"Stop!".equals(line)){
            if(line.matches("^([a-z!@#$?]+)=(\\d+)--(\\d+)<<([a-z]+)$")){
                String[] lineArgs = line.split("=|--|<<");
                String name = lineArgs[0];
                int length = Integer.parseInt(lineArgs[1]);
                int genesCount = Integer.parseInt(lineArgs[2]);
                String organism = lineArgs[3];
                
                int nameLength = 0;
                for (int i = 0; i < name.length(); i++) {
                    if(name.charAt(i) >= 97 && name.charAt(i) <= 122){
                        nameLength++;
                    }
                }

                if(nameLength == length){
                    if(genes.containsKey(organism)){
                        genes.put(organism, genes.get(organism) + genesCount);
                    }
                    else{
                        genes.put(organism, genesCount);
                    }
                }
                
            }

            line = bf.readLine();
        }

        genes = crunchifySortByValue(genes);

        for (String organism:genes.keySet()) {
            System.out.println(organism + " has genome size of " + genes.get(organism));
        }
    }

    public static Map<String, Integer> crunchifySortByValue(Map<String, Integer> crunchifyMap) {

        Map<String, Integer> crunchifyResult = new LinkedHashMap<>();
        Stream<Map.Entry<String, Integer>> sequentialStream = crunchifyMap.entrySet().stream();

        sequentialStream.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(c -> crunchifyResult.put(c.getKey(), c.getValue()));
        return crunchifyResult;
    }
}
