public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        String userString = "";
//        while(i <= 15){
//            userString += i+" ";
//            i++;
//        }
//        System.out.println(userString);
        long i =2;
        System.out.println(i);
        do{

            if(i%2== 0) {
//                System.out.println(i);
            }
            i*=i;
            System.out.println(i);


        } while(i <= 1000000);

    }
}
