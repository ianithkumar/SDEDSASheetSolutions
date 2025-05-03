package LinkedListPart1;

public class RemoveNthNodeFromTheEndOfTheList {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    ListNode head = new ListNode(arr[0]);
    head.next = new ListNode(arr[1]);
    head.next.next = new ListNode(arr[2]);
    head.next.next.next = new ListNode(arr[3]);
    head.next.next.next.next = new ListNode(arr[4]);

    int N = 1;

    ListNode temp = head;
    System.out.println("Before Removing : ");
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp = temp.next;
    }

    ListNode result = removeNthNodeFromTheEndOfTheList(head,N);
    System.out.println("\nAfter Removing : ");
    while(result!=null){
      System.out.print(result.val+" ");
      result = result.next;
    }
  }
  private static ListNode removeNthNodeFromTheEndOfTheList(ListNode head,int N) {
    if(head==null){
      return head;
    }
    ListNode slowPointer = head;
    ListNode fastPointer = head;

    for(int i=0;i<N;i++){
      fastPointer = fastPointer.next;
    }
    if(fastPointer==null){
      return head.next;
    }
    while(fastPointer.next!=null){
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next;
    }

    ListNode delNode = slowPointer.next;
    slowPointer.next = slowPointer.next.next;
    delNode = null;
    return head;
  }
}
