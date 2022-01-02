package ss23_behavioral_design_pattern.thuc_hanh;

import java.util.List;
import java.util.ArrayList;

public class SortedList {
    private SortStrategy strategy;
    private List<String> items = new ArrayList<>();

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }
    public void add(String name) {
        items.add(name);
    }

    public void sort() {
        strategy.sort(items);
    }
}
