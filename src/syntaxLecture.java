import java.sql.SQLOutput;

public class syntaxLecture {
    public static void main(String[] args) {
        // Declare variable without initializing
        int weight;
        String breed;
        // Initialize after declariation
        weight = 12;
        breed = "cavalier King Charles Spaniel";
        // Initialize and declare at the same time
        String name = "Grinch";
        int cutenessFactor = 10;
        // Statements: JVM,  do something
//        System.out.println(name + " is a " + breed + ".");
//        // Conditional logic
//        if (cutenessFactor > 8){
//            System.out.println(name + " is cute.");
//        } else{
//            System.out.println(name + " needs to work on cuteness.");
//        }
        boolean isGrinchCute = true;
        char oneLetter = 'a';
        byte smallNumber; // -128 to 127
        short mediumNumber; // 32769 to 23767
        int number; // -2 billion to 2 billion
        long bigNumber; // longs go about -9 quadrillion to 9 quadrillion
        smallNumber = 12;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        number = 2000100001;
                    // Casting (forcing a type of data into a different data type. Sometimes used to recover methods back to their original identity) converting a dataType into another
        smallNumber = (byte)number;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);
                    // big numbers need a capital L at the end
        bigNumber = 90000000000000L;

        float imaFloat = 3.23F;
        double immaDouble = 9.123345456567;
        System.out.println(immaDouble);
        imaFloat = (float) immaDouble;
        System.out.println(imaFloat);

        System.out.println("Exercise Starts Here");

        int myFavoriteNumber = 32;
        System.out.println(myFavoriteNumber);

        String myString = "This is my String";
        System.out.println(myString);
        // this don't be working
//        myString = 'a'
//        myString = 3.14
        float myNumber = 3.143F;
        System.out.println(myNumber);


//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        int x = 4;
        int y = 3;
        x += 5;
        y += x;
        System.out.println(x);
        System.out.println(y);
        long larger = 3L;
        System.out.println(larger);

        int maxInteger = 2147483647;

        long newMaxInteger = maxInteger ++;
        System.out.println(newMaxInteger);

    }
}







