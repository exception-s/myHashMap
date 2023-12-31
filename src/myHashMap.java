public class myHashMap extends PrimitiveHashMap{
    int current = 0;
    Object[] keys = new Object[size];
    Object[] values = new Object[size];
    public myHashMap() {
        super();
    }
    public myHashMap(int size) {
        super(size);
    }
    public void put(Object key, Object value){
        int index = key.hashCode() & (size - 1);
        keys[current] = key;
        values[current] = value;
        arr[index] = value;
        current++;
        if (current >= size - 1){
            Object[] help_arr = new Object[size * 2];
            for (int i = 0; i < size; i++){
                int helpIndex = keys[i].hashCode() & (2 * size - 1);
                help_arr[helpIndex] = values[i];
            }
            arr = help_arr;
        }
    }
    public boolean isExist(Object key){
        int index = key.hashCode() & (size - 1);
        if (arr[index] == null) return false;
        return true;
    }
    public Object getValue(Object key){
        int index = key.hashCode() & (size - 1);
        return arr[index];
    }

    //to do
    public void remove(Object key){
        int index = key.hashCode() & (size - 1);
        arr[index] = null;
        current--;
    }

    public int getSize(){
        return size;
    }
}

