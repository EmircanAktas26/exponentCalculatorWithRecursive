import java.util.Scanner;

/*
*@Author Emircan Aktas - 29.Dec.2022
 */
public class Main {
    static int exp(){
        Scanner inp = new Scanner(System.in);

        double base, pow, result;

        System.out.print("Enter the base number :");
        base = inp.nextInt();

        System.out.print("Enter the pow number :");
        pow = inp.nextInt();

        if(base == 0 || pow == 0){
            return 0;
        }
        result = Math.pow(base,pow);
        System.out.println("Result :"+result);
        return exp();
    }
    public static void main(String[] args) {
        System.out.println(exp());
    }
}