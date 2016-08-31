/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 *
 * @author Patiwet
 */
public class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size; // Last element can be indexed at size-1

    public DynamicArray(int cap){ // Class Constructor
        arr = new int[cap];
        capacity = cap;
    }

    public void pushBack(int data){
        // FIXED by ball
        size += 1;
        if(size <= capacity){
            arr[size-1] = data;
        }else{
            int oldCap = capacity;
            int[] oldArr = arr;
            capacity = 2*oldCap;
            arr = new int[capacity];
            for (int i=0;i<oldCap;i++){
                arr[i] = oldArr[i];
            }
            arr[size-1] = data;
        }

    }

    public int popBack(){
        // FIXED by ball lastest 590831 0214
        if(size > 0){
            int tmp = arr[size];
            arr[size] = 0;
            size--;
            return tmp;
        }else{
            System.out.println("ERROR");
            return 0;
        }

    }

    public int get(int i){
        // FIXED by ball lasted 590831 0152
        if(i < size-1)
            return arr[i];
        else
            System.out.println("ERROR");
        return 0;
    }
    public void set(int i, int value){
        // FIXED by ball lasted 590831 0205
        if(i < size-1){
            arr[i] = value;
            System.out.println(arr[i]);
        }else
            System.out.println("ERROR");
    }

    public void remove(int i){
        // FIXED by ball lasted 590831 0234
        if(i < size-1){
            int s=0;
            boolean f=false;
            while(s<size){
                if(s==i-1)
                    f = true;
                if(f){
                    arr[s] = arr[s+1];
                }
                s++;
            }
        }else
            System.out.println("ERROR");
    }

    public boolean isEmpty(){
        //FIXED by ball lastest 590831 0049
        return !(size > 0);
        //return (capacity == 0 || arr.length == 0);
    }

    public int getSize(){
        // FIXED THIS
        return 0;
    }

    public void printStructure(){
        // FIXED by ball
        System.out.print("Size = " + size + ", Cap = " + capacity + ", arr = [ ");
        for (int i=0;i<capacity;i++){
            if(arr[i]>0) {
                System.out.print(arr[i]);
                if(i < size-1)
                    System.out.print(",");
            }
        }
        System.out.println(" ]");
    }
}
