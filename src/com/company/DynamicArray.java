package com.company;
import java.util.*;

public class DynamicArray<T>
{
    private ArrayList<T> array;

    public DynamicArray() {array = new ArrayList<T>();}

    public T GetItem(int index) { return array.get(index); }
    public void Add(T element) { array.add(element); }
    public void Clear() { array.clear(); }
    public void RemoveAt(int index) { array.remove(index); }

    public ArrayList<T> DifferentItems()
    {
        ArrayList<T> result = new ArrayList<T>();
        for (int i=0; i<array.size(); i++)
        {
            if (result.indexOf(array.get(i)) == -1)result.add(array.get(i));
        }
        return result;
    }

    public int ItemCount(T item)
    {
        int count = 0;
        for (int i=0; i<array.size(); i++)
        {
            if (array.get(i).equals(item))count++;
        }
        return count;
    }
}
