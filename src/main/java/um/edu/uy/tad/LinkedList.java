package um.edu.uy.tad;

public interface LinkedList<T> {
    void addfrist(T element);
    void addLast(T element);
    T removeFrist();
    T removeLast();
    T getFrist();
    T getLast();
    int size();
    boolean isEmpty();
}
