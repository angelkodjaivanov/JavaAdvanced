package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Rankings {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> contests = new HashMap<>();
        String line = bf.readLine();
        while (!"end of contests".equals(line)){
            String[] inputArgs = line.split(":");
            contests.put(inputArgs[0], inputArgs[1]);
            line = bf.readLine();
        }
        TreeMap<String, LinkedHashMap<String, Integer>> results = new TreeMap<>();
        line = bf.readLine();
        while(!"end of submissions".equals(line)){
            String[] inputArgs = line.split("=>");
            String contestName = inputArgs[0];
            String password = inputArgs[1];
            String student = inputArgs[2];
            int score = Integer.parseInt(inputArgs[3]);
            if(contests.containsKey(contestName) && password.equals(contests.get(contestName))){
                if(results.containsKey(student)){
                    LinkedHashMap<String, Integer> studentResults = results.get(student);
                    if(studentResults.containsKey(contestName)){
                        if(score > studentResults.get(contestName)){
                            studentResults.put(contestName, score);
                        }
                    }
                    else{
                        studentResults.put(contestName, score);
                    }
                    results.put(student, studentResults);
                }
                else{
                    LinkedHashMap<String, Integer> studentResults = new LinkedHashMap<>();
                    studentResults.put(contestName, score);
                    results.put(student, studentResults);
                }
            }
            line = bf.readLine();
        }

        String bestStudent = "";
        int maxScore = 0;

        for (String student:results.keySet()) {
            HashMap<String, Integer> studentResults = results.get(student);
            int score = 0;
            for (int result:studentResults.values()) {
                score += result;
            }
            if(score > maxScore){
                maxScore = score;
                bestStudent = student;
            }
        }

        System.out.println("Best candidate is " + bestStudent + " with total " + maxScore + " points.");
        System.out.println("Ranking: ");

        for (String student:results.keySet()) {
            System.out.println(student);
            Map<String, Integer> studentContests = crunchifySortByValue(results.get(student));
            for (String contest:studentContests.keySet()) {
                System.out.println("#  " + contest + " -> " + studentContests.get(contest));
            }
        }
    }

    public static Map<String, Integer> crunchifySortByValue(Map<String, Integer> crunchifyMap) {

        Map<String, Integer> crunchifyResult = new LinkedHashMap<>();
        Stream<Map.Entry<String, Integer>> sequentialStream = crunchifyMap.entrySet().stream();

        sequentialStream.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(c -> crunchifyResult.put(c.getKey(), c.getValue()));
        return crunchifyResult;
    }
}
