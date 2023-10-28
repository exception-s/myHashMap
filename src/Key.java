public class Key {
    private String key;
    public Key(String key) {
        this.key = key;
    }

    public boolean equals(Key obj) {
        return key.hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return key;
    }
}
