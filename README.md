# linked-list

1. Value & the Pointer combines to form a <b>Node</b>.
2. The first node is called <b>Head</b>.
3. The last node is called <b>Tail</b>.
4. Linked list are <b>null</b> terminated which signifies that it's the end of the list.
![alt text](https://github.com/PS00161093/linked-list/blob/main/LinkedList.jpg?raw=true)
5. Linked list is not synchronized.
6. Iterators returned are fail-fast. Hence, can throw <code>ConcurrentModificationException</code>.
7. Class definition: <br>
<code>public class LinkedList<E> 
extends AbstractSequentialList<E> 
implements List<E>, Deque<E>, Cloneable, java.io.Serializable
</code>
8. Class variables:
<br><code>transient int size = 0;</code> 
<br><code>transient Node<E> first;</code> Pointer to first node.
<br><code>transient Node<E> last;</code> Pointer to last node.
9. Two Constructors:
<br><code>public LinkedList() { } </code> Constructs an empty list.
<br><code>public LinkedList(Collection<? extends E> c) { }</code> Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
