package generalizations;

public interface MaxMin <T extends Comparable<T>> {
    T min();
    T max();
}
