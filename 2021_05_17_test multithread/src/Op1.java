public class Op1 extends Thread {
    private double numA = 0;
    private double numB = 0;

    public Op1(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public double operation(){
        return this.numA - this.numB;
    }
}
