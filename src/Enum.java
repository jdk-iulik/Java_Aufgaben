import java.util.Scanner;

public class Enum {
    public static void main(String[] args) {
        Scanner scanner_ = new Scanner(System.in);
        int input;

        do {
            System.out.println("Bitte geben Sie einen Punktzahl ein: ");
            input = scanner_.nextInt();
            if (input >=92&& input<=100) {
                System.out.println(IHK.SEHR_GUT);
            }
            if (input <= 92 && input >=81) {
                System.out.println(IHK.GUT);
            }
            if (input <=81 && input >=67) {
                System.out.println(IHK.BEFRIEDIGEND);
            }
            if (input <=67 && input >=50) {
                System.out.println(IHK.AUSREICHEND);
            }
            if (input <= 50 && input >=30) {
                System.out.println(IHK.MANGELHAFT);
            }
            if (input <= 30 && input >= 0) {
                System.out.println(IHK.UNGENÜGEND);
                continue;
            } else {
                System.out.println("Ups!Bitte geben Sie den Punktzahl noch ein Mal ein: ");
            }
        }while(input>=0 || input<=100);
    }

    enum IHK {
        SEHR_GUT(92), GUT(81), BEFRIEDIGEND(67), AUSREICHEND(50), MANGELHAFT(30), UNGENÜGEND(0);
        public final int note;

        IHK(int note) {
            this.note = note;
        }
    }

    public static boolean isNumber(String number) {
        String numberPattern = "\\d+";
        if (number.matches(numberPattern))
            return true;
        return false;
    }
}

