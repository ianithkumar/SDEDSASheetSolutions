package LinkedListPart2;

import LinkedListPart1.ListNode;

public class ReverseNodesInKGroup {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 2;
    System.out.println("Before Reversal:");
    printLinkedList(head);

    ListNode result = reverseKGroup(head,k);
    System.out.println("\nAfter Reversal:");
    printLinkedList(result);
  }
  private static ListNode reverseKGroup(ListNode head, int k) {
    ListNode temp = head;
    ListNode prevLast = null;

    while(temp!=null) {
      ListNode kThNode = getKThNode(temp,k);

      if(kThNode == null) {
        if(prevLast!=null) {
          prevLast.next = temp;
        }
        break;
      }
      ListNode nextNode = kThNode.next;
      kThNode.next = null;
      reverseLinkedList(temp);

      if(temp==head) {
        head = kThNode;
      } else {
        prevLast.next = kThNode;
      }
      prevLast = temp;
      temp = nextNode;
    }
    return head;
  }
  private static ListNode reverseLinkedList(ListNode head) {
    ListNode prev = null;
    while(head!=null) {
      ListNode temp = head.next;
      head.next = prev;
      prev = head;
      head = temp;
    }
    return prev;
  }
  private static ListNode getKThNode(ListNode temp, int k) {
    k--;
    while (temp != null && k > 0) {
      temp = temp.next;
      k--;
    }
    return temp;
  }
  private static void printLinkedList(ListNode head) {
    while(head!=null) {
      System.out.print(head.val+" ");
      head = head.next;
    }
  }
}
