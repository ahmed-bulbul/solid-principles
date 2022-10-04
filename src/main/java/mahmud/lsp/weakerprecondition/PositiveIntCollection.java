package mahmud.lsp.weakerprecondition;

public class PositiveIntCollection extends IntCollection {

    @Override
    public void add(int item) {
        // Stronger precondition
        if (item < 0) {
            throw new IllegalArgumentException("Item must be positive");
        }
        super.add(item);
    }

    @Override
    public int sum() {
        return super.sum();
    }
}
