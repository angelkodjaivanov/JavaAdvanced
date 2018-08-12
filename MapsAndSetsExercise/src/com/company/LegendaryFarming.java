package com.company;

import java.util.*;
import java.util.stream.Stream;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> keyMaterials = new TreeMap<>();
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        keyMaterials.put("shards", 0);
        TreeMap<String, Integer> commonMaterials = new TreeMap<>();
        String legendaryItemMaterial = "";
        while(true){
            String[] inputArgs = scanner.nextLine().split(" ");
            boolean isCreated = false;
            for(int i = 0; i < inputArgs.length; i += 2){
                int quantity = Integer.parseInt(inputArgs[i]);
                String name = inputArgs[i + 1].toLowerCase();
                if(name.equals("shards") || name.equals("fragments")
                        || name.equals("motes")){
                    keyMaterials.put(name, keyMaterials.get(name) + quantity);
                }
                else{
                    if(commonMaterials.containsKey(name)){
                        commonMaterials.put(name, commonMaterials.get(name) + quantity);
                    }
                    else{
                        commonMaterials.put(name, quantity);
                    }
                }

                for (String material:keyMaterials.keySet()) {
                    if(keyMaterials.get(material) >= 250){
                        isCreated = true;
                        legendaryItemMaterial = material;
                        break;
                    }
                }

                if(isCreated){
                    break;
                }

            }
            if(isCreated){
                break;
            }
        }

        switch (legendaryItemMaterial){
            case "fragments":
                System.out.println("Valanyr obtained!");
                if(keyMaterials.get(legendaryItemMaterial) - 250 == 0){
                    keyMaterials.put(legendaryItemMaterial, 0);
                }
                keyMaterials.put(legendaryItemMaterial, keyMaterials.get(legendaryItemMaterial) - 250);
                break;
            case "shards":
                System.out.println("Shadowmourne obtained!");
                keyMaterials.put(legendaryItemMaterial, keyMaterials.get(legendaryItemMaterial) - 250);
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                keyMaterials.put(legendaryItemMaterial, keyMaterials.get(legendaryItemMaterial) - 250);
                break;
        }

        Map<String, Integer> result  = crunchifySortByValue(keyMaterials);

        for (String material:result.keySet()) {
            System.out.println(material + ": " + result.get(material));
        }

        for (String material:commonMaterials.keySet()) {
            System.out.println(material + ": " + commonMaterials.get(material));
        }

    }

    public static <K extends Comparable<? super K>, V> Map<K, V> crunchifySortByKey(Map<K, V> crunchifyMap) {

        Map<K, V> crunchifyResult = new LinkedHashMap<>();
        Stream<Map.Entry<K, V>> sequentialStream = crunchifyMap.entrySet().stream();

        // comparingByKey() returns a comparator that compares Map.Entry in natural order on key.
        sequentialStream.sorted(Map.Entry.comparingByKey()).forEachOrdered(c -> crunchifyResult.put(c.getKey(), c.getValue()));
        return crunchifyResult;
    }


    public static <K, V extends Comparable<? super V>> Map<K, V> crunchifySortByValue(Map<K, V> crunchifyMap) {

        Map<K, V> crunchifyResult = new LinkedHashMap<>();
        Stream<Map.Entry<K, V>> sequentialStream = crunchifyMap.entrySet().stream();

        // comparingByValue() returns a comparator that compares Map.Entry in natural order on value.
        sequentialStream.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(c -> crunchifyResult.put(c.getKey(), c.getValue()));
        return crunchifyResult;
    }
}
