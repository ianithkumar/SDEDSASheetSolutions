package LinkedListPart2;

import LinkedListPart1.ListNode;

public class LinkedListCycle {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(4);
    ListNode fifth = new ListNode(5);

    head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = third; //creating loop

    System.out.println(linkedListCycle(head));
  }
  private static boolean linkedListCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while(fast!=null && fast.next!=null) {
      slow = slow.next;
      fast = fast.next.next;

      if(slow == fast) {
        return true;
      }
    }
    return false;
  }
}
