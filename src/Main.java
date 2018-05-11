public class Main {
    public static void main(String[] args) {
        DoubleLinkedList sampleList = new DoubleLinkedList();
        sampleList.addAtBeginning("First");
        sampleList.addAtEnd("Fourth");
        sampleList.addAtMiddle("Third", "First");
        sampleList.addAtEnd("Sixth");
        sampleList.addAtBeginning("Bait");
        sampleList.addAtMiddle("Second", "First");
        sampleList.addAtMiddle("Fifth", "Fourth");
        sampleList.addAtEnd("Seventh");
        sampleList.removeAtBeginning();
        sampleList.removeAtMiddle("Sixth");
        sampleList.removeAtEnd();
        sampleList.printList();

        System.out.println(sampleList.getSizeOfList());

    }
}
