package grades;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String,Students> students = new HashMap<>();

        Students aaron = new Students("Aaron");
        aaron.addGrade(68,89,90);

        Students stephen = new Students("Stephen");
        stephen.addGrade(99,100,100);

        Students fernando = new Students("Fernando");
        fernando.addGrade(87,48,89);

        Map<String, Students> intMap = Map.ofEntries(
                entry("fernandolopez32", fernando),
                entry("ayronero", aaron),
                entry("SupperMegaMan", stephen)
        );

        students.putAll(intMap);

    }// main
}// grades app
