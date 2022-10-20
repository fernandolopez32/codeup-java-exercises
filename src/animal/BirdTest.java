package animal;

import vehicles.Car;
import vehicles.Vehicle;

import java.lang.module.FindException;

public class BirdTest {
    public static void main(String[] args) {
        Bird crow = new Bird();
//        crow.setName("Dr.Crow");
//        System.out.print(crow.getName()+" goes");
//        crow.makeNoise();

        TweetyBird goldfinch = new TweetyBird();
//        goldfinch.makeNoise();

        Parrot parrot = new Parrot();
//        parrot.makeNoise();
//        parrot.echo("yeeeehaw");

        Bird parrot2 = new Parrot();

//        parrot2.echo();

//        parrot2.makeNoise();
        parrot2.setName("Parrot");
//        System.out.println(parrot2.getName());
//      polymorphic array
        Bird[] birds = new Bird[2];
        birds[0] = new Parrot();
        birds[0].setName("Polly");
        birds[1] = new TweetyBird();
        birds[1].setName("Tweetybird");
//
//        for(Bird bird: birds){
//            bird.makeNoise();
//        }
//        Parrot backToParrot = (Parrot) birds[0];
//        backToParrot.echo("i can echo now");
//        backToParrot.getName();

        Bird.birdSounds(birds);


    }

}// end of bird test class
