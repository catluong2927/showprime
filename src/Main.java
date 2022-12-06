import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra: ");
        double num = scanner.nextDouble();
        int count = 0;
        int i = 2;
        while(count <num){
            if(checksnt(i)){
                System.out.println(i);
                count++;
            }
            i++;

        }
    }
    public static boolean checksnt(double n){
        if( n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n% i == 0) return false;
        }
        return true;
    }
}
