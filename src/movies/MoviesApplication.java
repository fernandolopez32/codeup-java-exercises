package movies;
import util.Input;

import javax.lang.model.element.NestingKind;
import java.util.zip.ZipInputStream;

public class MoviesApplication {

    public static void getAllMoviesFromCategory(String category, Movie[] movies){
        for(Movie movie: movies){
            String name = movie.getName();
            if(category.equals(movie.getCategories())){
                System.out.printf("%s -- %s %n",name,category);
            }
        }
    }


        public static Movie[] addMovie(Movie[] oldArray,Movie newMovie){
            Movie[] NewArray = new Movie[oldArray.length+1];

            for(int i=0; i < oldArray.length; i++){
                NewArray[i] = oldArray[i];
            }
            NewArray[NewArray.length-1]=newMovie;
            return NewArray;
        }

    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        String userChoice = "timmmmeeeeeee";

        while (!userChoice.equals("0")){
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a movie to the list");

            userChoice = input.getString("Enter your choice");

            switch (userChoice){
                case "0":
                    break;
                case "1":
                    for (Movie movie: movies){
                        String name = movie.getName();
                        String category = movie.getCategories();
                        System.out.printf("%s -- %s %n",name,category);
                    }
                    break;
                case "2":
                    for(Movie movie: movies){
                        String category = movie.getCategories();
                        String name = movie.getName();
                        if(category.equals("animated")){
                            System.out.printf("%s -- %s %n",name,category);
                        }
                    }
                    break;
                case "3":
                    getAllMoviesFromCategory("drama",movies);
                    break;
                case "4":
                    getAllMoviesFromCategory("horror",movies);
                    break;
                case "5":
                    getAllMoviesFromCategory("sifi",movies);
                    break;
                case "6":
                    String title = input.getString("What is the title of your new movie?");
                    String category = input.getString("Enter category of movie");
                    Movie NewMovie = new Movie(title.toLowerCase(),category.toLowerCase());
                    movies = addMovie(movies, NewMovie);
                    break;
                default:
                    System.out.println("DO BETTER");
                    break;
            }

        }




    }
}
