import java.util.Scanner;

public class programInvestMoney {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi");
        double money = s.nextDouble();
        System.out.println("Nhập số tháng muốn gửi");
        int month = s.nextInt();
        System.out.println("Nhập lãi suất");
        double invest_rate = s.nextDouble();
        double total_invest = 0;
        for(int i = 0; i < month;i++)
            total_invest += money*(invest_rate/100/12)*month;
        System.out.println("Số tiền lãi là: " + total_invest);
    }
}
