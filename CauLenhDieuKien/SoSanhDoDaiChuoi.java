import java.util.Scanner;

public class SoSanhDoDaiChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap chuoi a: ");
        String a = scanner.nextLine();
        
        System.out.print("Nhap chuoi b: ");
        String b = scanner.nextLine();
        
        int doDaiA = a.length();
        int doDaiB = b.length();
        
        System.out.println("Do dai chuoi a: " + doDaiA + " ky tu");
        System.out.println("Do dai chuoi b: " + doDaiB + " ky tu");
        
        if (doDaiA > doDaiB) {
            System.out.println("Chuoi a dai hon: '" + a + "'");
        } else if (doDaiB > doDaiA) {
            System.out.println("Chuoi b dai hon: '" + b + "'");
        } else {
            System.out.println("Hai chuoi co cung do dai. In chuoi a: '" + a + "'");
        }
        
        scanner.close();
    }
}