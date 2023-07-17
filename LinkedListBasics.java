public class LinkedListBasics {
    public static void main(String[] args) {
        ll list = new ll();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

       //list.removeFirst();
       //list.addAt(5,100);
       //list.removeLast();

        list.display();

      
    }
}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class ll {
    Node head;
    Node tail;
    int size;

    ll() {
        this.head = this.tail = null;
    }

    public void addFirst(int val) {
        Node n = new Node(val);
        if (size == 0) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;

        }
        size++;
    }

    public void addLast(int val) {
        Node newNode = new Node(val);

        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public int removeFirst() {
        if (size == 0) {
            return -1;
        } else if (size == 1) {
            int val = this.head.val;
            head = tail = null;
            size--;
            return val;
        } else {
            int val = this.head.val;
            head = head.next;
            size--;
            return val;
        }

    }

    public int getFirst() {
        if (size == 0) {
            return -1;
        } else {
            return head.val;
        }
    }

    public int getLast() {
        if (size == 0) {
            return -1;
        } else {
            return tail.val;
        }
    }

    public int getAt(int idx) {
        if (size == 0) {
            System.out.println("List is empty ");
            return -1;
        } else if (idx < 0 || idx >= size) {
            System.out.println("Invalid Argument");
            return -1;
        } else {
            Node temp = head;
            while (idx > 0) {
                temp = temp.next;
                idx--;
            }
            return temp.val;
        }
    }

    public void addAt(int idx, int val) {
        if (idx < 0 || idx > size) {
            return;
        } else if (idx == 0) {
            addFirst(val);
        } else if (idx == size) {
            addLast(val);
        } else {
            Node n = new Node(val);
            Node temp = head;
            while (idx - 1 > 0) {
                temp = temp.next;
                idx--;
            }
            n.next = temp.next;
            temp.next = n;
            size++;
        }
    }

    public void removeLast() {
        if (size == 0) {
            return;
        } else {
            int idx = size - 2;
            Node temp = head;
            while (idx > 0) {
                temp = temp.next;
                idx--;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }

    public void removeAt(int idx) {
        if (idx < 0 || idx >= size) {
            return;
        } else if (idx == 0) {
            removeFirst();
        } else if (idx == size - 1) {
            removeLast();
        } else {
            Node temp = head;
            while (idx - 1 > 0) {
                temp = temp.next;
                idx--;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

}