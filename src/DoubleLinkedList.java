public class DoubleLinkedList {
    private Node headNode;
    private Node tailNode;
    private int sizeOfList = 0;

    protected class Node {
        protected Node previousNode;
        protected Node nextNode;
        protected String nodeValue;

        protected Node(String value, Node previous, Node next) {
            nodeValue = value;
            previousNode = previous;
            nextNode = next;
        }
    }


    public void addAtBeginning(String item) {
        Node firstNode = new Node(item, null, headNode);
        if(headNode != null)
            headNode.previousNode = firstNode;
        headNode = firstNode;
        if(tailNode == null)
            tailNode = firstNode;
        sizeOfList++;
    }

    public void addAtEnd(String item) {
        Node lastNode = new Node(item, tailNode, null);
        if(tailNode != null)
            tailNode.nextNode = lastNode;
        tailNode = lastNode;
        if(headNode == null)
            headNode = lastNode;
        sizeOfList++;
    }
    public void addAtMiddle(String item, String valueOfReference) {
        Node referenceNode = headNode;
        while(referenceNode.nodeValue != valueOfReference)
            referenceNode = referenceNode.nextNode;
        Node nextToReferenceNode = referenceNode.nextNode;
        Node newNode = new Node(item, referenceNode, referenceNode.nextNode);
        referenceNode.nextNode = newNode;
        nextToReferenceNode.previousNode = newNode;
        sizeOfList++;
    }

    public void removeAtBeginning() {
        headNode = headNode.nextNode;
        headNode.previousNode = null;
        sizeOfList--;
    }

    public void removeAtEnd() {
        tailNode = tailNode.previousNode;
        tailNode.nextNode = null;
        sizeOfList--;
    }
    public void removeAtMiddle(String valueOfReference) {
        Node referenceNode = headNode;
        while(referenceNode.nodeValue != valueOfReference)
            referenceNode = referenceNode.nextNode;
        Node previousToReferenceNode = referenceNode.previousNode;
        Node nextToReferenceNode = referenceNode.nextNode;
        previousToReferenceNode.nextNode = referenceNode.nextNode;
        nextToReferenceNode.previousNode = previousToReferenceNode;
        sizeOfList--;
    }

    public void printList() {
        Node referenceNode = headNode;
        while(referenceNode != null) {
            System.out.println(referenceNode.nodeValue);
            referenceNode = referenceNode.nextNode;
        }
    }

    public int getSizeOfList() {
        return sizeOfList;
    }
}
