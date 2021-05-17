public class Op7 extends Thread {
    private double numA = 0;
    private double numB = 0;

    public Op7(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public double operation(){
        return this.numA - this.numB;
    }
}
