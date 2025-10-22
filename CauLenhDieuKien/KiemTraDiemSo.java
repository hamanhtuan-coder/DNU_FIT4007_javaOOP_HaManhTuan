import java.util.Scanner;

public class KiemTraDiemSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập điểm số
        System.out.print("Nhap diem so: ");
        double score = scanner.nextDouble();
        
        // Kiểm tra điểm số có hợp lý không (từ 0 đến 10)
        if (score >= 0 && score <= 10) {
            System.out.println(score + " la diem so hop li");
        } else {
            System.out.println(score + " la diem so khong hop li");
        }
        
        scanner.close();
    }
}