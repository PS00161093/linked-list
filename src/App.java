class App {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(10);

        myLinkedList.append(12);
        myLinkedList.append(14);
        System.out.println("Size = " + myLinkedList.getSize());

        myLinkedList.prepend(8);
        myLinkedList.prepend(6);
        System.out.println("Size = " + myLinkedList.getSize());

        System.out.print("Before pushItem(): ");
        myLinkedList.getAllItems();
        System.out.println();

        myLinkedList.pushItem(1,15);
        System.out.print("After pushItem(): ");
        myLinkedList.getAllItems();
        System.out.println();

        myLinkedList.pushItem(0,4);
        System.out.print("After pushItem() at beginning: ");
        myLinkedList.getAllItems();
    }
}
