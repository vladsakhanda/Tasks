# Клас Task1

## Для чого цей клас?

>_Цей клас потрібен для додовання елементів до масивів, залежно від типу елемента він додається до
певного масиву його типу. А потім гетер повертає останьо змінений масив._


## Поля

В цьому класі є 6 полів з яких п'ять масивів, типів int, float, char, String і boolean.
А також поле typeOfEl яке зберігає інформацію про масив який змінили останім.

    private int[] intArray= {};
    private float[] floatArray= {};
    private char[] charArray= {};
    private String[] StringArray= {};
    private boolean[] booleanArray= {};
    private String typeOfEl;


## Методи

***В цьому класі п'ять методів і усі вони називаються add та мають параметр <sub>value</sub> з різними типами.***

### Що робить add?

Метод add спочатку збільшує масив, а потім додає value на останье місце масиву та записує тип даних value
у поле typeOfEl.

    public void add(int value) {
    intArray = Arrays.copyOf(intArray, intArray.length + 1);
    intArray[intArray.length-1] = value;
    typeOfEl = "int";
    }
    public void add(float value) {
        floatArray = Arrays.copyOf(floatArray, floatArray.length + 1);
        floatArray[intArray.length-1] = value;
        typeOfEl = "float";
    }
    public void add(char value) {
        charArray = Arrays.copyOf(charArray, charArray.length + 1);
        charArray[charArray.length-1] = value;
        typeOfEl = "char";
    }
    public void add(String value) {
        StringArray = Arrays.copyOf(StringArray, StringArray.length + 1);
        StringArray[StringArray.length-1] = value;
        typeOfEl = "String";
    }
    public void add(boolean value) {
        booleanArray = Arrays.copyOf(booleanArray, booleanArray.length + 1);
        booleanArray[booleanArray.length-1] = value;
        typeOfEl = "boolean";
    }



## Гетер

В класі є гетер під назвою getArrays, який спочатку визначає який масив було змінено останім, а
повертає останьо змінений масив.

     public String getArrays() {
        switch (typeOfEl) {
            case "int":
                return Arrays.toString(intArray);
            case "float":
                return Arrays.toString(floatArray);
            case "String":
                return Arrays.toString(StringArray);
            case "boolean":
                return Arrays.toString(booleanArray);
            case "char":
                return Arrays.toString(charArray);
            default:
                return null;
        }
    }


[Силка на Task1](Task1.java)