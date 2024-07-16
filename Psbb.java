import java.util.Scanner;

public class Psbb {
    public static void main(String[] args) {
        int total = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the number of families :");
        int a = input.nextInt();
        
        System.out.print("Input the number of members in the family (separated by a space): ");
        int[] families = new int[a];
        
        for(int i = 0; i < a; i++) {  
            families[i] = input.nextInt(); 

            if (families.length != a) {
                System.out.println("Input must be equal with count of family");
                input.close();
            }
        }

        for(int size : families) {
            total += size;
        }
        System.out.println(total);

        int minBus = ((int) Math.ceil((double) total / 5)) + 1;

        System.out.println("Minimum bus required is: " + minBus);
    }
}
