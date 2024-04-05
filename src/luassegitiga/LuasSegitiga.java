package luassegitiga;
import java.util.Scanner;

/**
 *
 * @author Juni Antari
 * NIM : 2201010172
 */
public class LuasSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, t;
        double luas;
        
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("========================");
        
        
        System.out.print("Masukan Alas = ");
        a = input.nextInt();
        System.out.print("Masukan Tinggi = ");
        t = input.nextInt();
        
        
        luas= 0.5*a*t;
        System.out.println("Luas Segitiga adalah = " +luas);
        
        
    }
    
}
