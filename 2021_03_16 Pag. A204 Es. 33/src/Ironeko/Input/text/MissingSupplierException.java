package Ironeko.Input.text;

public class MissingSupplierException extends RuntimeException {

    public MissingSupplierException(Class<?> target) {
        super("Missing supplier for '" + target + "'.");
    }
}
