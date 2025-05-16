package LinkedListPart1;

public class MergeTwoSortedLinkedList {
  public static void main(String[] args) {
    ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
    ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));

    ListNode result = mergeTwoSortedList(list1,list2);
    System.out.println("Final Result : ");

    while(result!=null) {
      System.out.print(result.val);
      result = result.next;
    }
  }
  private static ListNode mergeTwoSortedList(ListNode list1,ListNode list2) {
    ListNode result = new ListNode(0);
    ListNode temp = result;
    while(list1!=null && list2!=null){
      if(list1.val<=list2.val) {
        temp.next = list1;
        list1 = list1.next;
      }
      else {
        temp.next = list2;
        list2 = list2.next;
      }
      temp = temp.next;
    }
    if(list1!=null){
      temp.next = list1;
    }
    if(list2!=null){
      temp.next = list2;
    }

    return result.next;
  }
}
