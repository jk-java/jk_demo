package basicdatastructure.collection.classes;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyQueue<Item> implements Iterable<Item>, Queue<Item> {

    private Node first;
    private Node last;
    private int size;
//LinkedList linkList;

    private class Node {
        Item item;
        Node next;
    }


    @Override
    public boolean add(Item item) {
        //���Ԫ�أ����β��ӣ����ڽṹ��������ʽ���� ��ԭ����β�ڵ��е�ָ��ָ�������ӵĽڵ㡣����

        //1. ��¼��ԭβ�ڵ�
        Node oldlast = last;

        //2. ������last����Ϊ����ӵ�β�ڵ㣬��֯�ڵ�����
        last = new Node();
        last.item = item;
        last.next = null;

        //3. ��ԭ����β�ڵ�ָ�����ڵ�β�ڵ�
        if (isEmpty()) {
            //���ǵ�һ����ӣ�˵����һ��β�ڵ�Ϊ NULL ������������ýڵ㼴Ҳ��ͷ���
            first = last;
        } else {
            //���ǵ�һ����ӣ����轫��һ��β�ڵ�ָ�������ӵĽڵ㣬ͷ��㲻�趯
            oldlast.next = last;
        }

        //4. �����Ϻ��ö��д�С����1
        size++;
        //5. ���������ȷ�Ľ��
        return true;
    }

    @Override
    public boolean offer(Item item) {
        return false;
    }

    /**\
     *������ɾ���˶��е�ͷ��
     * @return
     */
    @Override
    public Item remove() {
        Item item = poll();
        if(item == null ){
            throw new NoSuchElementException();
        }
        return item;
    }

    /**
     * ������ɾ���˶��е�ͷ������˶���Ϊ�գ��򷵻� null ��
     * @return
     */
    @Override
    public Item poll() {
        if (first == null) {
            return null;
        } else {
            Node oldfirst = first;
            Node next = first.next;
            Item item = oldfirst.item;
            oldfirst.item = null;
            oldfirst.next = null;//help GC
            first = next;
            if (first == null) {
                last = null;
            }
            size--;
            return item;
        }

    }

    /**
     * ��������ɾ��������е�ͷ�� �˷�����peek�Ĳ�֮ͬ�����ڣ�����˶���Ϊ�գ������׳��쳣��
     * @return
     */
    @Override
    public Item element() {
        Node oldfirst = first;
        if (oldfirst == null)
            throw new NoSuchElementException();
        return oldfirst.item;
    }

    /**
     * ��������ɾ���˶��е�ͷ��������˶���Ϊ�գ��򷵻� null ��
     *
     * @return
     */
    @Override
    public Item peek() {
        Node oldfirst = first;

        return oldfirst == null ? null : oldfirst.item;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean addAll(Collection<? extends Item> c) {
        return false;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
