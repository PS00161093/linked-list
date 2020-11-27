class App {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(10);

        myLinkedList.append(12);
        myLinkedList.append(14);
        System.out.println("Size = " + myLinkedList.getSize());

        myLinkedList.prepend(8);
        myLinkedList.prepend(6);
        System.out.println("Size = " + myLinkedList.getSize());

        myLinkedList.getAllItems();

    }
}
