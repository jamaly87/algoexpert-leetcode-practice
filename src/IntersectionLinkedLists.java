import java.util.HashSet;
import java.util.Set;

public class IntersectionLinkedLists {

    //Singly Linked List Definition

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

      //O(N) Time and Space Complexity

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
       //we need to store one of the nodes inside a datastructure that provides a quick lookup
       Set<ListNode> visited = new HashSet<>();
       while (headA!=null){
           visited.add(headA);
           headA=headA.next;
       }
       /*
        Now we check the elements of the ListNode B if they're contained in our HashSet.
       The first occurrence of a shared element will be returned as the intersection point
        */

        while(headB!=null){
            if (visited.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }

    //Optimized Solution -- O(N) time O(1) memory
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
          //Calculate the length/size of each list
        int sizeA= getSize(headA);
        int sizeB=getSize(headB);

        //we advance the longest list until they're both the same size so we can compare node by node
        while(sizeA>sizeB){
            headA=headA.next;
            sizeA--;
        }

        while(sizeA<sizeB){
            headB=headB.next;
            sizeB--;
        }
        /*
        We compare one node to the other in both lists; the first equal node we encounter
        we will return it (return either A or B doesn't matter). if no intersection then we will
        reach to the end of both lists and return null.
         */
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;

    }

    private static int getSize (ListNode node){
          int size=0;
          while (node!=null){
              node=node.next;
              size++;
          }
          return size;
    }


    public static void main(String[] args) {


    }

}
