package beans;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private Node head;
    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    public void addNode(Object data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(newNode);
        }

        count++;
    }

    public List<Node> getAllNodes() {
        List<Node> nodes = new ArrayList<Node>();

        Node current = head;
        while (current != null) {
            nodes.add(current);
            current = current.getNext();
        }

        return nodes;
    }
}

