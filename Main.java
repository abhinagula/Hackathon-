import java.util.Scanner;
public class RutuSped{
    public static void main(String[]args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter a number");
        int f1=inp.nextInt();

        System.out.println("Enter another integer");
        int f2=inp.nextInt();

        int b=f1+f2;
        System.out.println("sum = "+ b);

        int x=f1-f2;
        System.out.println("difference between first minus second num= "+x);

        int y=f2-f1;
        System.out.println("difference between second minus first num= "+y);

        int d=f1*f2;
        System.out.println("product= "+d);

        int a=f1/f2;
        System.out.println("quotient of first num by second num= "+a);
        
        int p= f1%f2;
        System.out.println("remainder is " + p);

    }
}
