import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        HashTable<String> table = new HashTable(num);
        for (int i = 0; i < num; i++) {
            String[] command = scanner.nextLine().split(" ");
            table.put(Integer.parseInt(command[0]), command[1]);
        }
        System.out.println(table);
    }
}

class HashTable<T> {
    private final int size;
    private TableEntry[] table;

    public HashTable(int size) {
        this.size = size;
        table = new TableEntry[size];
    }

    private int findEntryIndex(int key) {
        int hash = key % size;

        while (!(table[hash] == null || table[hash].getKey() == key)) {
            hash = (hash + 1) % size;

            if (hash == key % size) {
                return -1;
            }
        }

        return hash;
    }

    public boolean put(int key, T value) {
        TableEntry entry = getEntry(key);
        if (entry != null) {
            entry.setValue(entry.getValue() + " " + value);
            return true;
        }
        int idx = findEntryIndex(key);

        if (idx == -1) {
            return false;
        }

        table[idx] = new TableEntry(key, value);
        return true;
    }

    public TableEntry getEntry(int key) {
        if (table.length > 0) {
            for (TableEntry e : table
            ) {
                if (e != null && e.getKey() == key) {
                    return e;
                }
            }
        }
        return null;
    }

    public T get(int key) {
        int idx = findEntryIndex(key);

        if (idx == -1 || table[idx] == null) {
            return null;
        }

        return (T) table[idx].getValue();
    }

    public void remove(int key) {
        int idx = findEntryIndex(key);
        table[idx] = null;

        if (idx == -1 || table[idx] == null) {
            return;
        }
    }

    @Override
    public String toString() {
        StringBuilder tableStringBuilder = new StringBuilder();

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                tableStringBuilder.append(table[i].getKey()
                        + ": " + table[i].getValue());
                if (i < table.length - 1) {
                    tableStringBuilder.append("\n");
                }
            }

        }

        return tableStringBuilder.toString();
    }
}

class TableEntry<T> {
    private final int key;
    private T value;

    public TableEntry(int key, T value) {
        this.key = key;
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
}