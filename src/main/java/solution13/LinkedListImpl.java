package solution13;

public class LinkedListImpl implements ILinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    private Node insertEmptyHeadNode(Integer value) {
        head = new Node();
        head.setValue(value);
        head.setNextNode(null);
        return head;
    }

    private Node insertNodeToHead(Integer value) {
        Node newNode = new Node();
        newNode.setValue(value);
        newNode.setNextNode(this.head);
        this.head = newNode;
        return this.head;
    }

    @Override
    public Node insertNodeToPosition(Node head, Integer value, Integer position) {
        if (position == 0 && head == null) {
            return insertEmptyHeadNode(value);
        } else if (position == 0) {
            return insertNodeToHead(value);
        }

        Integer count = 0;
        Node currentNode = head;
        Node lastNode = currentNode;
        do {
            if (count == position) {
                Node newNode = new Node();
                newNode.setValue(value);
                lastNode.setNextNode(newNode);
                newNode.setNextNode(currentNode);
                break;
            }

            if (currentNode.getNextNode() == null) {
                if (count + 1 == position) {
                    Node newNode = new Node();
                    newNode.setValue(value);
                    newNode.setNextNode(null);
                    currentNode.setNextNode(newNode);
                }
                break;
            }

            count++;
            lastNode = currentNode;
            currentNode = currentNode.getNextNode();
        } while (currentNode != null);

        return this.head;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null) {
            stringBuilder.append(node.getValue()).append(" -> ");
            node = node.getNextNode();
        }
        stringBuilder.append("NULL");

        return stringBuilder.toString();
    }
}
