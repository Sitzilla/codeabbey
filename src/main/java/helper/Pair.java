package main.java.helper;

/**
 * Created by evan on 8/19/15.
 */
public class Pair<F extends Comparable<F>, S> implements Comparable<Pair<F, S>> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return first;

    }

    public S getSecond() {
        return second;
    }

    @Override
    public int compareTo(Pair<F, S> p) {
        final int compareFirst = first.compareTo(p.first);

        if (compareFirst != 0) {
            return compareFirst;
        }

        return 0;
    }
}
