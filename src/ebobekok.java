import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 , n2 , bolen = 1, ebob = 1;

        System.out.println("Ilk sayiyi giriniz : ");
        n1 = input.nextInt();
        System.out.println("Ikinci sayiyi giriniz : ");
        n2 = input.nextInt();
        while (bolen <= n1 && bolen <= n2){
            if((n1 % bolen == 0) && (n2 % bolen == 0)){
                ebob = bolen;
            }
            bolen++;
                   }
        System.out.println("Ebob : " + ebob );
        System.out.println((n1*n2)/ebob);
    }

    }
