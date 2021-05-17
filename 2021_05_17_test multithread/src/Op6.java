public class Op6 extends Thread {
    private double numA = 0;
    private double numB = 0;

    public Op6(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public double operation(){
        return this.numA * this.numB;
    }
}
