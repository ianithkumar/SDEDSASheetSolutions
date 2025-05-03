package LinkedListPart1;

public class DeleteANodeWhenANodeIsGiven {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    ListNode head = new ListNode(arr[0]);
    head.next = new ListNode(arr[1]);
    head.next.next = new ListNode(arr[2]);
    head.next.next.next = new ListNode(arr[3]);
    head.next.next.next.next = new ListNode(arr[4]);

    System.out.print("Before Deleting the Node : \n");
    printList(head);

    ListNode node = getNode(head,4);
    deleteNode(node);

    System.out.print("\nAfter Deleting the Node : \n");
    printList(head);
  }
  private static ListNode getNode(ListNode head,int val){
    if(head==null)
      return null;
    while(head.val != val) {
      head = head.next;
    }

    return head;
  }
  private static void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
  private static void printList(ListNode head) {
    while(head!=null) {
      System.out.print(head.val+" ");
      head = head.next;
    }
  }
}
