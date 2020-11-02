package com.company;


public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }

    public java.lang.Integer find_min(){
        if (isEmpty()){
            return null;
        }
        int min_elem = stackArray[0];
        for (int i = 0; i < stackArray.length; i++){
            if (min_elem > stackArray[i]){
                min_elem = stackArray[i];
                stackArray[i] = stackArray[i+1];
            }
        }
        return min_elem;
    }


    public void addElementToStack(int element) {
        stackArray[++top] = element;
    }

    public boolean deleteMinElementFromStack() { //удалить минимальный
        int d = find_min();
        if (top + 1 -d <= 0) {return false;}
        else {
            for(int i=top+1-d;i<top;i++){
                stackArray[i] = stackArray[i + 1];}
            top--;
            return true;
        }
    }

    public int readTop() {
        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void print_ar(){
        System.out.print("Наш стек: ");
        System.out.print(" ");
        for(int i=0;i<=top;i++){
            System.out.print(stackArray[i]);
            System.out.print(" ");
        }
        System.out.println("");

    }
}
