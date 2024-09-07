package task.T15;


import java.util.Arrays;

public class Task1 {
    private int[] intArray= {};
    private float[] floatArray= {};
    private char[] charArray= {};
    private String[] StringArray= {};
    private boolean[] booleanArray= {};


    private String typeOfEl;

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
}
