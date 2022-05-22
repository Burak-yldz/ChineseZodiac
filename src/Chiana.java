import java.util.Scanner;

public class Chiana {
    public static void main(String[] args) {

        int birthDate,mod;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your birthDate : ");
        birthDate = input.nextInt();

        mod = birthDate %12;

        switch (mod){
            case 0:
                System.out.println("Cin Zodyagi Herescope: Maymun");
                break;
            case 1:
                System.out.println("Cin Zodyagi Herescope: Horoz");
                break;
            case 2:
                System.out.println("Cin Zodyagi Herescope: Kopek");
                break;
            case 3:
                System.out.println("Cin Zodyagi Herescope: Domuz");
                break;
            case 4:
                System.out.println("Cin Zodyagi Herescope: Fare");
                break;
            case 5:
                System.out.println("Cin Zodyagi Herescope: Okuz");
                break;
            case 6:
                System.out.println("Cin Zodyagi Herescope: Kaplan");
                break;
            case 7:
                System.out.println("Cin Zodyagi Herescope: Tavsan");
                break;
            case 8:
                System.out.println("Cin Zodyagi Herescope: Ejderha");
                break;
            case 9:
                System.out.println("Cin Zodyagi Herescope: Yilan");
                break;
            case 10:
                System.out.println("Cin Zodyagi Herescope: At");
                break;
            case 11:
                System.out.println("Cin Zodyagi Herescope: Koyun");
                break;
            default:
                System.out.println("Please enter number bigger than ZERO(0)!");
        }
    }
}
