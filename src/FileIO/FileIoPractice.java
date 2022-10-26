package FileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.createFile;
import static java.nio.file.Files.list;

public class FileIoPractice {
    public static void main(String[] args) {
        Path p = Paths.get("src","fileIo","people.txt");
        boolean pExist = Files.exists(p);
        System.out.println(pExist);

        if(Files.notExists(p)){
            try{
                Files.createFile(p);
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        List <String> oldPeople = Arrays.asList("Mason","David","Aaron");



    }
}
