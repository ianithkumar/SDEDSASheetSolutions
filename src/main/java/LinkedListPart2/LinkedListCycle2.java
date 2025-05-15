package LinkedListPart2;

import LinkedListPart1.ListNode;

import java.util.HashMap;

public class LinkedListCycle2 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(4);

    head.next = second;
    head.next.next = third;
    head.next.next.next = fourth;
    fourth.next = second;

//    ListNode result = linkedListCycle2(head);
    ListNode result = optimalSolution(head);
    System.out.println(result.val);
  }
  private static ListNode linkedListCycle2(ListNode head) {
    ListNode temp = head;

    HashMap<ListNode,Integer> map = new HashMap<>();

    while(temp!=null) {
      if(map.containsKey(temp)) {
        return temp;
      }
      map.put(temp,1);
      temp = temp.next;
    }
    return null;
  }
  private static ListNode optimalSolution(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while(fast!=null && fast.next!=null) {
      slow = slow.next;
      fast = fast.next.next;
      if(slow==fast) {
        slow = head;
        while(slow!=fast) {
          slow = slow.next;
          fast = fast.next;

        }
        return slow;
      }
    }
    return null;
  }
}
