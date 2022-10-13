public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        String userString = "";
//        while(i <= 15){
//            userString += i+" ";
//            i++;
//        }
//        System.out.println(userString);

//        for(int i = 0; i<= 15; i++){
//            String acc = "";
//            acc += i;
//            System.out.println(acc);
//        }

//        long i =2;
//        System.out.println(i);
//        do{
//            i*=i;
//            System.out.println(i);
//        } while(i < 65536);

        for(long i = 2; i <= 65536; i*=i){
            System.out.println(i);
        }



    }
}
