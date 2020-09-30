package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = {10, 20, 30, -10, -20, -30};
	    for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
	        for(int i = 0; i < lastUnsortedIndex; i++){
	            if(intArray[i] < intArray[i+1]){
	                swap(intArray, i, i+1);
                }
            }
        }
	    for(int i = 0; i< intArray.length; i++)
            System.out.println(intArray[i]);
    }
    public static void swap(int[] array, int i, int j){
        if(i==j)
            return;
        //Swapping
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}