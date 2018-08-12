package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FootballStats {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, List<String>> teams = new LinkedHashMap<>();
        String line = bf.readLine();
        while (!"Season End".equals(line)){

            String[] inputArgs = line.split(" ");
            String team_1 = inputArgs[0];
            String team_2 = inputArgs[2];
            StringBuilder result = new StringBuilder(inputArgs[4]);

            String team1Match = team_2 + " -> " + result;
            String team2Match = team_1 + " -> " + result.reverse();

            if(teams.containsKey(team_1)){
                List<String> matches = teams.get(team_1);
                matches.add(team1Match);
                teams.put(team_1, matches);
            }
            else{
                List<String> matches = new ArrayList<>();
                matches.add(team1Match);
                teams.put(team_1, matches);
            }

            if(teams.containsKey(team_2)){
                List<String> matches = teams.get(team_2);
                matches.add(team2Match);
                teams.put(team_2, matches);
            }
            else{
                List<String> matches = new ArrayList<>();
                matches.add(team2Match);
                teams.put(team_2, matches);
            }

            line = bf.readLine();
        }



        String[] inputArgs = bf.readLine().split(", ");

        for (String team:inputArgs) {
            List<String> matches = teams.get(team);
            matches.sort((a, b) -> a.split(" -> ")[0].compareTo(b.split(" -> ")[0]));
            for (String match:matches) {
                System.out.println(team + " - " + match);
            }
        }

    }
}
