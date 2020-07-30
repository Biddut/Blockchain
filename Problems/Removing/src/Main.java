import java.util.Scanner;

public class Main {
    private static class TableEntry<T> {
        private final int key;
        private  T value;
        private boolean removed;

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

        public void remove() {
            removed = true;
        }

        public boolean isRemoved() {
            return removed;
        }
    }

    private static class HashTable<T> {
        private int size;
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


            if (idx == -1 ) {
                return;
            }
            else table[idx].remove();
            // return;
        }


        private void rehash() {
            // put your code here
        }

        @Override
        public String toString() {
            StringBuilder tableStringBuilder = new StringBuilder();

            for (int i = 0; i < table.length; i++) {
                if (table[i] == null) {
                    tableStringBuilder.append(i + ": null");
                } else {
                    tableStringBuilder.append(i + ": key=" + table[i].getKey()
                            + ", value=" + table[i].getValue()
                            + ", removed=" + table[i].isRemoved());
                }

                if (i < table.length - 1) {
                    tableStringBuilder.append("\n");
                }
            }

            return tableStringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        HashTable<String> table = new HashTable(n);
        //  System.out.println(n+" "+m);

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            // System.out.println(command[0]+" "+command[1]);
            table.put(Integer.parseInt(command[0]), command[1]);
        }

        for (int i = 0; i < m; i++) {
            int rKey = Integer.parseInt(scanner.nextLine());
            table.remove(rKey);

        }
        System.out.println(table);
    }
}