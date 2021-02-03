import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        double a = ConsoleInput.readDouble("Inserire il coefficiente \"A\": ");
        double b = ConsoleInput.readDouble("Inserire il coefficiente \"B\": ");
        double c = ConsoleInput.readDouble("Inserire il coefficiente \"C\": ");4
        double[] tot = eccezioni(a,b,c);
        System.out.println("Risultato 1 = " + tot[0]);
        System.out.println("Risultato 2 = " + tot[1]);
    }

    public static double[] eccezioni(double a, double b, double c){
        try{
            return equazione(a,b,c);
        }
        catch(DividedByZeroException | DeltaException eccezione1){
            System.out.println(eccezione1.getMessage());
            return new double[0];
        }
    }

    public static double[] equazione(double a, double b, double c) throws DividedByZeroException, DeltaException{
        if (a == 0) { throw new DividedByZeroException(); }
        double delta = b*b-4*a*c;
        if (delta<0){ throw new DeltaException(); }
        double[] tot = new double[2];
        tot[0]= (-b+Math.sqrt(delta))/(a*2);
        tot[1]= (-b-Math.sqrt(delta))/(a*2);
        return tot;
    }
}
