package Aufgabe_3.Classen_Vererbung;

public class Vechicle implements Driveable {
    private String marke;
    private String bauJahr;
    protected boolean isDriving;

    public Vechicle(String marke, String bauJahr) {
        this.marke = marke;
        this.bauJahr=bauJahr;
    }

    public String toString() {
        return "Vehicle[" + marke + " - "+ bauJahr + "]";
    }
    public void starten() {
        if (!isDriving) {
            System.out.println("I am on!");
            isDriving=true;
        }
    }
    public void beschleunigen(int speed) {
        if(isDriving) {
            if (speed < 200 && speed > 0) {
                System.out.println("i am driving regular");
            } else if (speed > 200 && speed < 350) {
                System.out.println("i am driving fast");
            } else {
                System.out.println("Speed not accepted ..");
            }
        }
    }
    public void stop(boolean stop) {
        if(isDriving){
            System.out.println("I am stopping ..");
            isDriving = false;
        } else{
            System.out.println("I stay");
        }
    }

}
