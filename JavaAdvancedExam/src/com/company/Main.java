package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int problemsCount = Integer.parseInt(bf.readLine());
        int candidatesCount = Integer.parseInt(bf.readLine());
        ArrayDeque<String> problems = new ArrayDeque<>();
        ArrayDeque<String> candidates = new ArrayDeque<>();
        for (int i = 0; i < problemsCount; i++) {
            problems.push(bf.readLine());
        }
        for (int i = 0; i < candidatesCount; i++) {
            String candidate = bf.readLine();
            if(candidate.matches("^[A-Z]{1}[a-z]+ [A-Z]{1}[a-z]+$")){
                candidates.offer(candidate);
            }
        }

        while (true){
            if(candidates.size() == 1 || problems.size() == 0){
                break;
            }
            String candidate = candidates.poll();
            String problem = problems.poll();
                long candidateSum = 0;
                long problemSum = 0;
                for (int i = 0; i < candidate.length(); i++) {
                    candidateSum += candidate.charAt(i);
                }
                for (int i = 0; i < problem.length(); i++) {
                    problemSum += problem.charAt(i);
                }
                if(candidateSum >= problemSum){
                    System.out.println(candidate + " solved " + problem + ".");
                    candidates.offer(candidate);
                }
                else{
                    System.out.println(candidate + " failed " + problem + ".");
                    problems.offer(problem);
                }
        }

        if(candidates.size() == 1){
            System.out.println(candidates.poll() + " gets the job!");
        }
        else{
            System.out.println(String.join(", ", candidates));
        }
    }
}
