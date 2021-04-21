import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        double Deposit = scan.nextInt();
        System.out.print("Введите проценнты по депозиту: ");
        double Percentages = scan.nextInt(); {
        for (int i = 0; i < 6; i++) {
            double DepositSum = (((Deposit * Percentages * i) / 100) + Deposit);
                String times [] = {" ","за год", "за два года", "за три года", "за четыре года", "за пять лет"};
                    System.out.println("Ваша сумма вклада " + times [i] + ": " + DepositSum);
                }
            }
        }
    }
