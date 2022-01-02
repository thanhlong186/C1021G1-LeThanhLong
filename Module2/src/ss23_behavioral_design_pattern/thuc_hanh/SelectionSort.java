package ss23_behavioral_design_pattern.thuc_hanh;

import java.util.List;

public class SelectionSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Selection sort");
    }
}
