package dataStructures;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    public LinkedList(String data) {
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getHead() {
        if(this.head == null) {
            System.out.println("Empty list");
        } else {
            System.out.println("Head: " + head.data);
        }
    }

    public void getTail() {
        if(this.tail == null) {
            System.out.println("Empty list");
        }else {
            System.out.println("Tail: " + tail.data);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void emptyList() {
        head = null;
        tail = null;
        length = 0;
    }

    public void print() {
        System.out.println("###################");
        Node current = this.head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("###################");
    }

    public void append(String data) {
        Node newNode = new Node(data);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void prepend(String data) {
        Node preNode = new Node(data);
        if(length == 0) {
            head = preNode;
            tail = preNode;
        } else {
            preNode.next = head;
            head = preNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node removeLast() {
        if(length == 0) return null;
        Node pre = head;
        Node temp = null;
        while (pre.next != tail) {
            pre = pre.next;
        }
        temp = tail;
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if(index < 0 || index > length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean insert(int index, String data) {
        if(index < 0 || index >= length) return false;
        if(index == 0) {
            prepend(data);
            return true;
        }
        if(index == length-1) {
            append(data);
            return true;
        }
        Node newNode = new Node(data);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public boolean set(int index, String data) {
        Node temp = get(index);
        if(temp != null) {
            temp.data = data;
            return true ;
        }
        return false;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length-1) return removeLast();
        Node prev = get(index);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.getHead();
        list.getTail();
        list.getLength();
        list.append("elemento 2");
        list.append("elemento 3");
        System.out.println(list.removeLast().data);
        list.prepend("Elemento 0");
        list.print();
//        System.out.println(list.removeFirst().data);
        list.print();
        System.out.println(list.get(2).data);
        list.insert(2, "Elemento 2.5");
//        list.print();
        list.set(3, "Elemento 3 modificado");
//        list.print();
        list.getLength();
        list.remove(3);
        list.insert(2, "Último");
        list.print();
    }
}