package Aufgabe_3.Classen_Vererbung;

public class Demoversion {
    public static void main(String[] args) {
        Cars c2=new Cars("jaguar", "1984",Fahrzeugtypen.CABRIOLET);
        System.out.println(c2);
        c2.starten();
        c2.stop(true);
        c2.beschleunigen(333);

        Motorcycle m=new Motorcycle("BMW","1999", TypeMotor.ZWEI_CYLINDER);
        System.out.println(m);
        m.starten();
        m.stop(true);
    }
}
