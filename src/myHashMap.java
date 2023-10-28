import java.util.ArrayList;

public class myHashMap {
    private int maxCapacity;
    public myHashMap(int capacity){
        this.maxCapacity = capacity;
    }
    private ArrayList<Pair> map = new ArrayList<>();
    private ArrayList<Key> keys = new ArrayList<>();
    private int[] values = new int[maxCapacity];

    public void put(Pair pair) {
        boolean flag = true;
        for (int i = 0; i < map.size(); i++){
            if (pair.getFirst().equals(map.get(i).getFirst())) {
                map.remove(i);
                map.add(pair);
                flag = false;
                break;
            }
        }
        if (flag) map.add(pair);
    }

    public void remove(Key key) {
        boolean flag = true;
        for (int i = 0; i < map.size(); i++){
            if (key.equals(map.get(i).getFirst())) {
                map.remove(i);
                break;
            }
        }
    }

    public boolean containsKey(Key key){
        for (int i = 0; i < map.size(); i++){
            if (key.hashCode() == map.get(i).getFirst().hashCode()) return true;
        }
        return false;
    }

    public boolean containsValue(int value){
        for (int i = 0; i < map.size(); i++){
            if (value == map.get(i).getSecond()) {
                return true;
            }
        }
        return false;
    }

    public ArrayList keySet() {
        for (int i = 0; i < map.size(); i++){
            keys.add(map.get(i).getFirst());
        }
        return keys;
    }

    public int[] values() {
        for (int i = 0; i < map.size(); i++){
            values[i] = map.get(i).getSecond();
        }
        return values;
    }

    public int size(){
        return map.size();
    }

    public void clear(){
        map.clear();

    }

    public boolean isEmpty(){
        return size() == 0;
    }

    @Override
    public String toString() {
        for (int i = 0; i < map.size(); i++){
            System.out.println(map.get(i).toString());
        }
        if (isEmpty()) {
            System.out.println("I am empty :(");
            return "";
        }
        else return "";
    }
}
