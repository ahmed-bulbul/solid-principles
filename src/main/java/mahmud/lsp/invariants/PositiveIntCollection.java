package mahmud.lsp.invariants;


import java.util.ArrayList;
import java.util.List;

public class PositiveIntCollection  {

    private final List<Integer> store;

    public PositiveIntCollection() {
        store = new ArrayList<>();
    }

    public void add(int item) {
        if (item < 0) {
            throw new IllegalArgumentException("Item must be positive");
        }
    }

    public int sum(){
        return store.stream().mapToInt(Integer::intValue).sum();
    }

}
