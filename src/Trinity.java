public class Trinity<F,S,T extends Comparable> {
    private F first;
    private S second;
    private T third;

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public Trinity(F first, S second,T third) {
        if (first!=null) this.first = first;
        if (second!=null)this.second = second;
        if (third!=null) this.third = third;
    }

}
