package com.company;

public class Main {

    public static void main(String[] args) {

        DoubleLinkedList double_linked_list = new DoubleLinkedList();
        double_linked_list.addFirst(0);
        double_linked_list.addFirst(5);
        double_linked_list.addFirst(45);
        double_linked_list.addFirst(2);
        double_linked_list.print_list();
        int min = double_linked_list.getMin();
        System.out.println("Минимальный элемент двусвязного списка: " + min);
        System.out.println(double_linked_list.delete(min));


        Queue queue = new Queue();
        queue.set_arr(0,12);
        queue.set_arr(1,23);
        queue.set_arr(2,83);
        queue.set_arr(3,0);
        queue.set_arr(4,-54);

        int index_min = queue.GetIndexOfMin();
        queue.print_ar();
        System.out.println("Минимальный элемент очереди: " + queue.get_arr(index_min));

        Stack theStack = new Stack(10);
        theStack.addElementToStack(89);
        theStack.addElementToStack(69);
        theStack.addElementToStack(45);
        theStack.addElementToStack(34);
        theStack.print_ar();
        System.out.println("Минимальный элемент стека: " + theStack.find_min());

        theStack.deleteMinElementFromStack();


    }
}
