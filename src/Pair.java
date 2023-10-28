public class Pair {
    private Key first;
    private int second;

    public Pair(Key key, int value) {
        this.first = key;
        this.second = value;
    }

    public Key getFirst(){
        return first;
    }
    public int getSecond(){
        return second;
    }

    @Override
    public String toString() {
        return first.toString() + " = " + second;
    }
}
