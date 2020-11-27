public class MyLinkedList {

    Item head;

    Item tail;

    int size = 0;

    public MyLinkedList(int value) {

        this.head = new Item(value);
        this.tail = this.head;
        size++;
    }

    public void append(int newValue) {

        Item newItem = new Item(newValue);
        this.tail.next = newItem;
        this.tail = newItem;
        size++;

    }

    public void prepend(int newValue) {

        Item newItem = new Item(newValue);
        newItem.next = this.head;
        this.head = newItem;
        size++;
    }

    public int getSize() {

        return size;
    }

    public int[] getAllItems() {

        int[] values = new int[this.size];

        Item nextItem = this.head;
        for (int i = 0; i < size; i++) {
            values[i] = nextItem.value;
            nextItem = nextItem.next;
        }

        return values;
    }


    class Item {

        int value;

        Item next;

        Item(int v) {

            this.value = v;
            this.next = null;
        }

    }

}