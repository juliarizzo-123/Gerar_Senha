
import java.util.Random;

public class MegaSenha {
    
    public static void main(String[] args) throws Exception {
        Random genereted = new Random();
        int i = 0;
        while(i<6){
            int number = genereted.nextInt(60);
            i++ ;// vai pegar o i +1 tipo i = i + 1
            System.out.println("Número sorteado: " + number);

            



        }
        
    }
}
//    usando o for
     /*for(int i = 0; i<6; i++){
            int number = genereted.nextInt(60);
            System.out.println(number);
           } */
       


