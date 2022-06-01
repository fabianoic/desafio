package solution13;

public class Solution {
    public static void main(String[] args) {

        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.insertNodeToPosition(linkedList.getHead(), 1, 0);
        linkedList.insertNodeToPosition(linkedList.getHead(), 10, 1);
        linkedList.insertNodeToPosition(linkedList.getHead(), 5, 10);
        linkedList.insertNodeToPosition(linkedList.getHead(), 22, 1);
        linkedList.insertNodeToPosition(linkedList.getHead(), 11, 3);
        linkedList.insertNodeToPosition(linkedList.getHead(), 0, 0);
        linkedList.insertNodeToPosition(linkedList.getHead(), 1000, 2);
        linkedList.insertNodeToPosition(linkedList.getHead(), 1001, 2);
        linkedList.insertNodeToPosition(linkedList.getHead(), 1001, 7);
    }
}
