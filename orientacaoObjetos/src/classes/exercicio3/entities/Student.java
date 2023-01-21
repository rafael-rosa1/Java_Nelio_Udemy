package classes.exercicio3.entities;

public class Student {
    public String name;
    public double g1;
    public double g2;
    public double g3;

    public double finalGrade() {
        return g1 + g2 + g3;
    }

    public void approved() {
        if(finalGrade() >= 60.0) {
            System.out.println("PASS");
        } else {
            double missing = 60.0 - finalGrade();
            System.out.println("FAILED");
            System.out.println("MISSING " + missing + " POINTS");
        }
    }
}
