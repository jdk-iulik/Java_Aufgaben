import java.util.Scanner;

public class Use_Mail_Age {
    /**
     * Erstelle ein Programm, welches den User nach E-Mail-Adresse, Name und Alter
     * fragt. Diese eingaben sollen auf Korrektheit geprüft werden. Eine E-Mail
     * braucht ein @ Zeichen. Der Name darf keine Zahlen enthalten und das Alter
     * kann nur aus Ganzzahlen bestehen. Diese eingaben müssen so lange wiederholt
     * werden bis diese dem Format entsprechen. Im Anschluss sollen aus den Eingaben
     * ein Objekt vom Typ Person erstellt werden. Dabei sollen der eingegebene Wert
     * als Values für die Eigenschaften des Type Person dienen. Kleiner Tipp => Keep
     * it Simple. Mach nur das, was gefordert ist.
     *
     * @author flori
     **/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean stateName = false;
        boolean stateEmail = false;
        boolean stateAlt = false;

        boolean stateUserInpute=false;

        String name = "";
        byte alt = -1;
        String mail = "";
        do {
            if (!stateName) {
                System.out.println("Name: ");
                String input = scanner.nextLine();
                if (input.matches("\\D*")) {
                    name = input;
                    stateName = true;
                }
            }
            if (!stateEmail) {
                System.out.println("Geben Sie ihre email ein: ");
                String input = scanner.nextLine();
                if (input.contains("@")) {
                    mail = input;
                    stateEmail = true;
                }
            }
            if (!stateAlt) {
                System.out.println("Geben Sie ihre Alt ein: ");
                String input = scanner.nextLine();
                if (input.matches("\\d+")) {
                    alt = Byte.parseByte(input);
                    stateAlt = true;
                }
            }
            stateUserInpute=stateAlt&& stateEmail&&stateName;
            System.out.println(stateUserInpute);
        } while(!stateUserInpute);
        System.out.println(String.format("Name: "+ name + "\n" + "Alter: "+ alt + "\n"+ "Email: "+ mail));
        Person p=new Person(name, mail, alt);
    }

}
class Person{
    String name;
    String mail;
    byte alt;

    public Person(String name, String mail, byte alt){
        this.name=name;
        this.mail=mail;
        this.alt=alt;
    }

}
