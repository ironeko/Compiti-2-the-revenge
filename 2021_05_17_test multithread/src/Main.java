//3*(7-2) * [12/(3+1) - 6*(5-1)]

public class Main {
    public static void main(String[] args) {
        Op1 uno = new Op1(7,2);
        Op2 due = new Op2(3,1);
        Op3 tre = new Op3(5,1);
        uno.start();
        due.start();
        tre.start();
        Op4 quattro = new Op4(3,uno.operation());
        Op5 cinque = new Op5(12,due.operation());
        Op6 sei = new Op6(6,tre.operation());
        quattro.start();
        cinque.start();
        sei.start();
        Op7 sette = new Op7(cinque.operation(),sei.operation());
        sette.start();
        System.out.println(quattro.operation()*sette.operation());
    }
}
