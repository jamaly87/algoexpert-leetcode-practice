public class RemoveDuplicatesLL {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        /*
        1- we remove the duplicate node by disconnecting the pointer to let point to a different node
        2- this linkedlist is sorted and there for if we have duplicate values they're always gonna be in the same order.
         */
        LinkedList currentNode = linkedList;
        while(currentNode!=null){
            LinkedList distinctNode = currentNode.next;
            //
            while (distinctNode!=null && distinctNode.value ==currentNode.value){
                distinctNode=distinctNode.next;
            }
            currentNode.next=distinctNode;
            currentNode=distinctNode;
        }
        return linkedList;
    }


}
