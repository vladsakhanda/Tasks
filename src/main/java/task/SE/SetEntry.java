package task.SE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SetEntry<K, V>{
    private Entry[] entryArray = {};


    public SetEntry(SetEntry<K, V> entArr) {
        entryArray = entArr.getEntryArray();
    }

    public SetEntry() {}

    @Override
    public String toString() {
        String str = "{";
        for (int i = 0; i < entryArray.length; i++) {
            if (i+1 == entryArray.length) {
                str = str+ entryArray[i].getKey() + " = " +  entryArray[i].valuesToString();
                break;
            }
            str = str + entryArray[i].getKey() + " = " + entryArray[i].valuesToString() + "; ";
        }
        return str + "}";
    }




    public void addLast(K key, V[] values) {
        boolean isTrue = false;
       for (int i = 0; i < entryArray.length; i++) {
           if (key == entryArray[i].getKey()) {
               isTrue = true;
           }
       }
       if (isTrue == false) {
           Entry<K, V> entry = new Entry<>(key, values);
           entryArray = Arrays.copyOf(entryArray, entryArray.length + 1);
           entryArray[entryArray.length - 1] = entry;
       }
    }




    public void removeLast() {
        entryArray = Arrays.copyOf(entryArray, entryArray.length - 1);
    }



    public int size() {
        return entryArray.length;
    }


    public int sizeOfValues(int index) {
        return entryArray[index].getSize();
    }




    public int sizeOfValues(K key) throws Exception {
        KOI iok = new KOI();
        return entryArray[iok.keyOfIndex(key)].getSize();
    }

    public K indexOfKey(int index)  {
       return (K) entryArray[index].getKey();

    }




    public void reversed()  {
        KOI iok = new KOI();
        iok.reversed();
    }

    public void removeFirst() {
        KOI iok = new KOI();
        iok.reversed();
        entryArray = Arrays.copyOf(entryArray, entryArray.length - 1);
        iok.reversed();
    }

    public void clear()  {
        KOI iok = new KOI();
        iok.clear();
    }


    public void addFirst(K key, V[] values) {
        KOI iok = new KOI();
        iok.reversed();
        boolean isTrue = false;
        for (int i = 0; i < entryArray.length; i++) {
            if (key == entryArray[i].getKey()) {
                isTrue = true;
            }
        }
        if (isTrue == false) {
            Entry<K, V> entry = new Entry<>(key, values);
            entryArray = Arrays.copyOf(entryArray, entryArray.length + 1);
            entryArray[entryArray.length - 1] = entry;
        }
        iok.reversed();
    }


    public void remove(int index) {
        Entry[] newEntryArray = {};
        for (int i = 0; i < entryArray.length; i++) {
            if (i == index) {
                continue;
            }
            newEntryArray = Arrays.copyOf(newEntryArray, newEntryArray.length + 1);
            newEntryArray[newEntryArray.length - 1] = entryArray[i];
        }
        KOI iok = new KOI();
        iok.clear();
        entryArray = newEntryArray;
    }

    public void remove(K key) throws Exception {
        KOI iok = new KOI();
        int index = iok.keyOfIndex(key);
        Entry[] newEntryArray = {};
        for (int i = 0; i < entryArray.length; i++) {
            if (i == index) {
                continue;
            }
            newEntryArray = Arrays.copyOf(newEntryArray, newEntryArray.length + 1);
            newEntryArray[newEntryArray.length - 1] = entryArray[i];
        }

        iok.clear();
        entryArray = newEntryArray;
    }

    public void setValue(K key, V[] values) throws Exception {
        KOI iok = new KOI();
        int index = iok.keyOfIndex(key);
        entryArray[index].setValues(values);
    }

    public void setValue(int index, V[] values) throws Exception {
        entryArray[index].setValues(values);
    }


    public void add(int index, K key, V[] values) throws Exception {
        KOI iok = new KOI();
        Entry[] newEntryArray = {};
        Entry<K, V> entry = new Entry<>(key, values);
        for (int i = 0; i < entryArray.length+1; i++) {
            if (i == index) {
                newEntryArray = Arrays.copyOf(newEntryArray, newEntryArray.length + 1);
                newEntryArray[newEntryArray.length - 1] = entry;
                continue;
            }
            if (i > index) {
                newEntryArray = Arrays.copyOf(newEntryArray, newEntryArray.length + 1);
                newEntryArray[newEntryArray.length - 1] = entryArray[i-1];
                continue;
            }
            newEntryArray = Arrays.copyOf(newEntryArray, newEntryArray.length + 1);
            newEntryArray[newEntryArray.length - 1] = entryArray[i];
        }

        iok.clear();
        entryArray = newEntryArray;
    }

    public Entry[] getEntryArray() {
        return entryArray.clone();
    }

    private class KOI {
    private int keyOfIndex(K key) throws Exception {
        for (int i = 0; i < entryArray.length; i++) {
            if (key == entryArray[i].getKey()) {
                return i;
            }
        }
        throw new Exception("Такого ключя не існує");
    }

    private void clear()  {
        entryArray = Arrays.copyOf(entryArray, 0);
    }

    private void reversed()  {
        Entry[] newEntryArray = new Entry[entryArray.length];
        for (int i = 0; i < entryArray.length; i++) {
            newEntryArray[i] = entryArray[entryArray.length-i-1];
        }
        entryArray = newEntryArray;
    }

        public void removeLast() {
            entryArray = Arrays.copyOf(entryArray, entryArray.length - 1);
        }
}


    private class Entry<K, V> {
        private K key;
        private V[] values;

        private Entry(K key, V[] values) {
            this.key = key;
            this.values = values;
        }

        private K getKey() {
            return key;
        }


        private String valuesToString() {
            String str = "[";
            for (int i = 0; i < values.length; i++) {
                if (i+1 == values.length) {
                    str = str+ values[i];
                    break;
                }
                str = str+ values[i]+ ",";
            }
            return str+"]";

        }

        public V[] getValues() {
            return values.clone();
        }

        @Override
        public String toString() {
            String str = "[";
            for (int i = 0; i < values.length; i++) {
                if (i+1 == values.length) {
                    str = str+ values[i];
                    break;
                }
                str = str+ values[i]+ ",";
            }
            return str+"]";
        }

        private void setValues(V[] values) {
            this.values = values;
        }

        private int getSize() {
            return values.length;
        }

    }
}