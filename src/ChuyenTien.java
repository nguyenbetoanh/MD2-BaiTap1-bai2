import java.util.Scanner;

public class ChuyenTien {
    public static void main(String[] args) {

        System.out.println("Hãy nhập số tiền USD muốn chuyển !");
        Scanner money =new Scanner(System.in);
        double change = money.nextDouble();

        double VND = change*23;
        System.out.println("số tiền đc chuyển từ: " +change + "USD thành tiền việt là : " + VND+ " k VND");
    }
}