package com.company;

class DoubleLinkedList {
    private Node first, last;
    private int length;
    public DoubleLinkedList() {
        first = last = null;
        length = 0;
    }

    public void addFirst(int aValue) {
        final Node currFirst = first;
        final Node newNode = new Node(null, currFirst, aValue);
        first = newNode;
        if(currFirst == null)  // if empty list
            last = newNode;
        else
            currFirst.prev = newNode;
        length += 1;
    }

    public void addLast(int aValue) {
        final Node currLast = last;
        final Node newNode = new Node(currLast, null, aValue);
        last = newNode;
        if(currLast == null)  // if empty list
            first = newNode;
        else
            currLast.next = newNode;
        length += 1;
    }

    public boolean isEmpty(){
        if(first == null && last == null){
            return true;
        }
        else{
            return false;
        }
    }

    public int getLast() {
        return last.value;
    }

    public int getFirst() {
        return first.value;
    }

    public java.lang.Integer getMin(){    //поиск минимального элемента
        if (this.isEmpty()){
            return null;
        }
        int min_elem = first.next.value;
        Node p = first.next.next;
        while (p != null){
            if (min_elem > p.value){
                min_elem = p.value;
                p = p.next;
            }
        }
        return min_elem;
    }

    public java.lang.Integer findPosition(int elem){
        Node current = first;
        int i = 0;
        while (current != null && current.value != elem){
            current = current.next;
            i += 1;
        }
        if(current == null){
            return null;
        }
        else {return i;}
    }

    public Node getNode(int position){
        if (position > length - 1 || position < 0){
            return null;
        }
        Node current = first;
        int i = 0;
        while (i < position){
            current = current.next;
            i += 1;
        }
        return current;
    }

    public java.lang.Integer get(int position){
        Node node = getNode(position);
        if (node == null){
            return null;
        }
        else { return node.value;}
    }

    public boolean delete(int elem){    //удаление элемента по значению
        int position = findPosition(elem);
        if (position > length - 1 || position < 0){
            return false;
        }
        if (position == 0){
            first = first.next;
            first.prev = null;
        }
        else if (position == length-1){
            last = last.prev;
            last.next = null;
        }
        else{
            Node node = getNode(position);
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        length -= 1;
        return true;
    }

    public void print_list() {
        Node current = first;
        int i = 0;
        System.out.print("Двусвязный список: ");
        while (i < length){
            System.out.print(" ");
            System.out.print(current.value);
            current = current.next;
            i += 1;
        }
        System.out.println("");
    }

    private static class Node {
        Node next, prev;
        int value;

        public Node(Node aPrev, Node aNext, int aValue) {
            prev = aPrev;
            next = aNext;
            value = aValue;
        }
    }
}

