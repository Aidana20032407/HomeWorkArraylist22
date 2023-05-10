import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer>evenNumbers = new ArrayList<>(); // четные числа
        ArrayList <Integer>oddNumbers = new ArrayList<>(); // не четные
        ArrayList<Integer> oddNumbers2 = new ArrayList<>(); // не четные
        Random random = new Random();
        for (int i = 0; i < 50 ; i++) {
         evenNumbers.add(random.nextInt(100));
        }
        for (int i = 0; i < evenNumbers.size(); i++) {
            if(evenNumbers.get(i) % 2 == 0){
                oddNumbers2.add(evenNumbers.get(i));
            }else {
                oddNumbers.add(evenNumbers.get(i));
            }
        }
        System.out.println( "Массив"  + evenNumbers);
        System.out.println( "Четные числа"  + oddNumbers2);
        System.out.println( "Не четные числа"  + oddNumbers);
    }
}