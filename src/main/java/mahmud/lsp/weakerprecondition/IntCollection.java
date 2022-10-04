package mahmud.lsp.weakerprecondition;

import java.util.ArrayList;
import java.util.List;

public class IntCollection {

    private final List<Integer> store;

    public IntCollection() {
        store = new ArrayList<>();
    }

    public void add(int item) {
        store.add(item);
    }

    public int sum(){
        return store.stream().mapToInt(Integer::intValue).sum();
    }
}
