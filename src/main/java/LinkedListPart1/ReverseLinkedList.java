package LinkedListPart1;

public class ReverseLinkedList {
  public static void main(String[] args) {
    ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    ListNode listCopy = list;

    System.out.println("Before Reverse : ");
    while (list != null) {
      System.out.print(list.val + " ");
      list = list.next;
    }
    ListNode reversedList = reverseLinkedList(listCopy);

    System.out.println("\nAfter Reverse : ");
    while (reversedList != null) {
      System.out.print(reversedList.val + " ");
      reversedList = reversedList.next;
    }
  }

  private static ListNode reverseLinkedList(ListNode head) {
    ListNode current = head;
    ListNode previous = null;

    while (current != null) {
      ListNode temp = current.next;
      current.next = previous;
      previous = current;
      current = temp;
    }
    return previous;
  }
}
