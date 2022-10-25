package grades;

import util.Input;

import java.util.*;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();


        HashMap<String,Students> students = new HashMap<>();

        Students aaron = new Students("Aaron");
        aaron.addGrade(68,89,90);

        Students stephen = new Students("Stephen");
        stephen.addGrade(99,100,100);

        Students fernando = new Students("Fernando");
        fernando.addGrade(87,48,89);

        students.put("Fernandolopez32",fernando);
        students.put("Ayronero",aaron);
        students.put("SuperMegaMan",stephen);


        // making hashmap into a list
        List<String> gitHubUserNames = new ArrayList<>(students.keySet().stream().toList());

        Collections.sort(gitHubUserNames);

        System.out.printf("Welcome!%n%nHere are the GitHub usernames of our students: %n%n%s%n",gitHubUserNames);

        String userSelect = input.getString();

        System.out.println("What student would you like to see more information on?");
        switch (userSelect.toLowerCase()){
            case "ayronero" -> System.out.printf("%s %n %.2f %n",aaron.getName(),aaron.getGradeAverage());

            case "fernandolopez32" -> System.out.printf("%s %n %.2f %n",fernando.getName(),fernando.getGradeAverage());
            case "supermegaman" -> System.out.printf("%s %n %.2f %n",stephen.getName(),stephen.getGradeAverage());
            default -> System.out.printf("Sorry, no student found with the GitHub username of \"%s\".",userSelect);
        }



//        for(String username: gitHubUserNames ){
//            Students students1 = gitHubUserNames.get(students);
//            System.out.println(students.get(gitHubUserNames).getName());
//        }







    }// main
}// grades app
