package mahmud.lsp.invariants;

import java.util.ArrayList;
import java.util.List;

public class IntCollection extends PositiveIntCollection{

    private final List<Integer> store;

    public IntCollection() {
        store = new ArrayList<>();
    }

    @Override
    public void add(int item) {
        store.add(item);
    }

    @Override
    public int sum(){
        return store.stream().mapToInt(Integer::intValue).sum();
    }
}
