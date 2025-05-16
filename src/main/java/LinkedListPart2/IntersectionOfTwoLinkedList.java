package LinkedListPart2;

import LinkedListPart1.ListNode;

import java.util.HashSet;

public class IntersectionOfTwoLinkedList {
  public static void main(String[] args) {
    ListNode head1 = new ListNode(4,new ListNode(1));
    ListNode head2 = new ListNode(5,new ListNode(6,new ListNode(1)));

    ListNode intersectingNode = new ListNode(8,new ListNode(4,new ListNode(5)));

    head1.next = intersectingNode;
    head2.next = intersectingNode;

    ListNode result = intersectionOfTwoLinkedList(head1,head2);
    ListNode result2 = optimalSolution(head1,head2);
    System.out.println(result.val);
    System.out.println(result2.val);
  }
  private static ListNode intersectionOfTwoLinkedList(ListNode head1, ListNode head2) {
    while(head2 != null) {
      ListNode temp = head1;
      while(temp != null) {
        //if both nodes are same
        if(temp == head2) return head2;
        temp = temp.next;
      }
      head2 = head2.next;
    }
    return null;
  }
  private static ListNode optimalSolution(ListNode head1,ListNode head2) {
    HashSet<ListNode> st=new HashSet<>();
    while(head1 != null) {
      st.add(head1);
      head1 = head1.next;
    }
    while(head2 != null) {
      if(st.contains(head2)) return head2;
      head2 = head2.next;
    }
    return null;
  }
}
