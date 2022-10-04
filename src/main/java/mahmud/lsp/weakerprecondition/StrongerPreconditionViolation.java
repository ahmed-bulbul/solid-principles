package mahmud.lsp.weakerprecondition;

public class StrongerPreconditionViolation {

    public static void main(String[] args) {

        IntCollection collection = new IntCollection();
        collection.add(1);
        collection.add(2);
        collection.add(-3);

        collection = new PositiveIntCollection();
        collection.add(1);
        collection.add(2);
        collection.add(-3); // Violation of stronger precondition

    }
}
