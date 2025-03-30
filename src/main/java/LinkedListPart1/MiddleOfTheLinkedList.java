package LinkedListPart1;

public class MiddleOfTheLinkedList {
  public static void main(String[] args) {
    ListNode list = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));

    ListNode middleNode = middleOfTheLinkedList(list);
    while(middleNode!=null){
      System.out.print(middleNode.val+" ");
      middleNode = middleNode.next;
    }
  }
  private static ListNode middleOfTheLinkedList(ListNode head){
    if(head==null || head.next==null) return head;
    ListNode slow = head;
    ListNode fast = head;

    while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}
