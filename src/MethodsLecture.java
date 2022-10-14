import com.sun.security.jgss.GSSUtil;

public class MethodsLecture {
    //    public is an access modifier
    // can be accessed from anywhere inside the JAVA program

    // Static you do not need to define an object

    // Void does not return anything
    public static String bark(){
       System.out.println("woof woof!");
       return "woof woof!";
    }
    public static void bark(int weight){
        if(weight < 25){
            System.out.println("yip yip");
        } else{
            System.out.println("woof woof!");
        }
    }

    public static void bark(int weight, String name) {
        String output = name + " goes ";
        if(weight<25) {
            output  += "yip yip";
        } else {
            output += "woof woof!";
        }
        System.out.println(output);
    }

    public static void main(String[] args) {

        String bark = bark();

//        bark();
//        bark(3);
//        bark(39);
//        bark(39, "Rudo");
//        bark(15, "Fido");
    }
}

