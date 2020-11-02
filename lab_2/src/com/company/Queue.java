package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Queue {
    private int[] _arr;
    private int _size;
    private int _head;
    private int _tail;
    private int _capacity; //количество элементов под которые выделено памяти
    private int _defaultCapacity = 10; //количество элементов под которые выделено памяти в момент создания

    public Queue() {
        this._capacity = _defaultCapacity;
        this._arr = new int[_defaultCapacity];
        this._size = 0;
        this._head = -1;
        this._tail = 0;
    }

    public boolean isEmpty(){
        return this._size == 0;
    }

    //добавляет элемент в конец очереди
    public void Enqueue(int newElement) {
        // Проверяем ёмкость массива, если недостаточна - удваиваем.
        if (this._size == this._capacity) {
            int[] newQueue = new int[2 * _capacity];
            System.arraycopy(_arr, 0, newQueue, 0, _arr.length);
            _arr = newQueue;
            _capacity *= 2;
        }
        _size++;
        _arr[_tail++ % _capacity] = newElement;
    }

    //удаляет элемент из головы очереди
    public int delete_first() {
        if (this._size == 0) {
            throw new IllegalStateException ();
        }
        _size--;
        return _arr[++_head % _capacity];
    }

    //возвращает количество элементов в очереди
    public int get_size(){
        return this._size;
    }

    public int get_arr(int index) {
        return _arr[index];
    }
    public void set_arr(int index, int value){
        this._arr[index] = value;
    }

    //Поиск индекса минимального элемента
    public int GetIndexOfMin() {
        int min = _arr[0];
        int minIndex = 0;

        for (int i = 0; i < _size; i++) {
            if (_arr[i] < min) {
                min = _arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    //Удаление минимального элемента из очереди
    public void DeleteMin() {
        int min = GetIndexOfMin();
        int[] newQueue = new int[_capacity];

        if (min == 0) {
            for (int i = 0; i < _size; i++) {
                newQueue[i] = _arr[i + 1];
            }
        }
        else {
            System.arraycopy(_arr, 0, newQueue, 0, min);

            for (int i = 0; i < _size; i++) {
                newQueue[min + i] = _arr[min + i + 1];
            }
        }
        _arr = newQueue;
        _size--;
    }


    public void print_ar() {
        int i = 0;
        System.out.print("Очередь: ");
        System.out.println(" ");
        while (i < _size){
            System.out.print(" ");
            System.out.print(this.get_arr(i));
            i += 1;
        }
    }
}

