package LinkedListPart2;

import LinkedListPart1.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(1);

//    System.out.println(palindromeLinkedList(head));
//    System.out.println(palindromeLinkedListOptimalSolution(head));
    System.out.println(usingStack(head));
  }
  private static boolean palindromeLinkedList(ListNode head) {
    String s = "";
     while(head!=null) {
         s += String.valueOf(head.val);
         head = head.next;
     }
     char[] ch = s.toCharArray();

     int left = 0;
     int right = ch.length-1;

     while(left<right) {
         if(ch[left]!=ch[right]) {
             return false;
         }
         left++;
         right--;
     }
     return true;
  }
  private static boolean palindromeLinkedListOptimalSolution(ListNode head) {
    List<Integer> list = new ArrayList();
    while(head != null) {
      list.add(head.val);
      head = head.next;
    }

    int left = 0;
    int right = list.size()-1;
    while(left < right && list.get(left) == list.get(right)) {
      left++;
      right--;
    }
    return left >= right;
  }
  private static boolean usingStack(ListNode head) {
    Stack<Integer> s = new Stack<>();

    ListNode temp = head;

    while(temp!=null) {
      s.push(temp.val);
      temp = temp.next;
    }

    while(head!=null) {
      if(head.val != s.peek()) {
        return false;
      }
      head = head.next;
      s.pop();
    }
    return true;
  }
}
