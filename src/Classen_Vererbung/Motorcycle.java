package Classen_Vererbung;

public class Motorcycle extends Vechicle {
    private  TypeMotor type;
    public Motorcycle(String marke, String bauJahr, TypeMotor type) {
       super (marke, bauJahr);
        this.type=type;
    }

    public String toString(){
        return super.toString()+ "(" + type+ ")";
    }
}
