package Aufgabe_3.Classen_Vererbung;

public class Cars extends Vechicle {
    private Fahrzeugtypen type;

    public Cars(String marke, String bauJahr, Fahrzeugtypen type) {
        super(marke, bauJahr);
        this.type = type;
    }
    @Override
    public String toString() {
        return super.toString() + "(" + type+ ")";
    }
}
