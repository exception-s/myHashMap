public class Main {
    public static void main(String[] args) {
        myHashMap map = new myHashMap(10);
        Key key1 = new Key("hello world");
        Key key2 = new Key("this is me");
        Key key3 = new Key("hashMap");
        map.put(new Pair(key1, 1));
        map.put(new Pair(key2, 2));
        map.put(new Pair(key3, 3));
        map.toString();
    }
}