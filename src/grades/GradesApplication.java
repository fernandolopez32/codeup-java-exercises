package grades;

import util.Input;

import java.util.*;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();


        HashMap<String, Students> students = new HashMap<>();

        Students aaron = new Students("Aaron");
        aaron.addGrade(68, 89, 90);

        Students stephen = new Students("Stephen");
        stephen.addGrade(99, 100, 100);

        Students fernando = new Students("Fernando");
        fernando.addGrade(87, 48, 89);

        students.put("Fernandolopez32", fernando);
        students.put("Ayronero", aaron);
        students.put("SuperMegaMan", stephen);


        // making hashmap into a list
        List<String> gitHubUserNames = new ArrayList<>(students.keySet().stream().toList());

        Collections.sort(gitHubUserNames);

        System.out.printf("Welcome!%n%nHere are the GitHub usernames of our students:%n%n%s%n", gitHubUserNames);
        String userSelect;



        String userResp;


        do {
            userSelect = input.getString("What student would you like to see more information on?");
            switch (userSelect) {
                case "Ayronero" -> System.out.printf("Name:%s - GitHub Username: %s %nCurrent Average:%.2f %n%n", aaron.getName(),userSelect, aaron.getGradeAverage());

                case "Fernandolopez32" -> System.out.printf("Name:%s - GitHub Username: %s %nCurrent Average:%.2f %n%n", fernando.getName(),userSelect, fernando.getGradeAverage());

                case "SuperMegaMan" -> System.out.printf("Name:%s - GitHub Username: %s %nCurrent Average:%.2f %n%n", stephen.getName(),userSelect, stephen.getGradeAverage());

                default -> System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n%n", userSelect);
            }

            userResp = input.getString("Would you like to see another student?");
        } while (userResp.equals("y"));

        if (!userResp.equals("y")){
            System.out.println("Goodbye, and have a wonderful day!");
        }





    }// main
}// grades app
