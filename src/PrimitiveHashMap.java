import java.io.ObjectStreamException;

public abstract class PrimitiveHashMap{
    Object[] arr;
    int size;

    public PrimitiveHashMap(){
        arr = new Object[0];
        this.size = 0;
    }

    public PrimitiveHashMap(int size) {
        arr = new Object[size];
        this.size = size;
    }

    public abstract void put(Object key, Object value);

    public abstract boolean isExist(Object key);

    public abstract void remove(Object key);

    public abstract int getSize();
    public abstract Object getValue(Object key);

}

