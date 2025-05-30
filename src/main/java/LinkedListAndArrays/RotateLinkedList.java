package LinkedListAndArrays;

import LinkedListPart1.ListNode;

public class RotateLinkedList {
  public static void main(String[] args) {
    ListNode head = new ListNode(1,new ListNode(2,new ListNode(3)));
    head.next.next.next = new ListNode(4,new ListNode(5));
    String startTitle = "The List Before Rotation : ";
    printList(head,startTitle);

    String endTitle = "\nThe List After k Rotating : ";
    ListNode result = rotateList(head,3);
    printList(result,endTitle);
  }
  private static ListNode rotateList(ListNode head, int k) {
    if(k==0 || head==null || head.next==null) return head;
    ListNode curr = head;
    int count = 1;

    while(curr.next!=null){
      curr = curr.next;
      count++;
    }
    curr.next = head;

    int n = count - (k%count);  //when k value is greater the size of the list.

    for(int i=0;i<n;i++){
      curr = curr.next;
    }
    head = curr.next;
    curr.next = null;
    return head;
  }
  private static void printList(ListNode head,String title) {
    System.out.print(title);
    while(head.next!=null) {
      System.out.print(head.val+"->");
      head = head.next;
    }
    System.out.print(head.val);
  }
}
