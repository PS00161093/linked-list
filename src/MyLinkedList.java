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

    public void getAllItems() {

        Item currentItem = this.head;
        while (currentItem.next != null) {
            System.out.print(currentItem.value + " ");
            currentItem = currentItem.next;
        }
        System.out.print(currentItem.value + " ");
    }

    public void pushItem(int index, int newValue) {

        if (index == 0) {
            prepend(newValue);
        } else if (index == this.size) {
            append(newValue);
        } else {
            Item previousItem = null;
            Item currentItem = this.head;
            while (index > 0) {
                previousItem = currentItem;
                currentItem = currentItem.next;
                index--;
            }
            Item newItem = new Item(newValue);
            newItem.next = currentItem;
            previousItem.next = newItem;
            size++;
        }
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