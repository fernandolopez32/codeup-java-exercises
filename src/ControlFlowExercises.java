public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        String userString = "";
//        while(i <= 15){
//            userString += i+" ";
//            i++;
//        }
//        System.out.println(userString);
        int i = 0;
        do{
            if(i%2 ==0){
            System.out.println(i*i);
            }
            i++;

        } while(i <= 100);

    }
}
