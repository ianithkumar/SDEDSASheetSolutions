package LinkedListAndArrays;

import java.util.HashMap;
import java.util.Map;

class Node {
  int val;
  Node next;
  Node random;

  Node() {

  }

  Node(int val) {
    this.val = val;
  }

  Node(int val, Node next) {
    this.val = val;
    this.next = next;
  }

  Node(int val, Node next, Node random) {
    this.val = val;
    this.next = next;
    this.random = random;
  }
}

public class CopyListWithRandomPointer {
  public static void main(String[] args) {
    Node head = new Node(7);
    head.next = new Node(13);
    head.next.next = new Node(11);
    head.next.next.next = new Node(10);
    head.next.next.next.next = new Node(1);

    head.random = null;
    head.next.random = head;
    head.next.next.random = head.next.next.next.next;
    head.next.next.next.random = head.next.next;
    head.next.next.next.next.random = head;

    System.out.println("Before Deep Copying : ");
    printList(head);

//    Node result = copyListWithRandomPointer(head);
    Node result = optimalSolutionWithOutUsingMap(head);

    System.out.println("\nAfter Deep Copying : ");
    printList(result);
  }

  private static Node copyListWithRandomPointer(Node head) {
    Map<Node, Node> copy = new HashMap<>();

    Node temp = head;

    while (temp != null) {
      Node copyNode = new Node(temp.val);
      copy.put(temp, copyNode);
      temp = temp.next;
    }
    temp = head;

    while (temp != null) {
      Node newNode = copy.get(temp);
      newNode.next = temp.next;
      newNode.random = temp.random;
      temp = temp.next;
    }
    return copy.get(head);
  }

  private static Node optimalSolutionWithOutUsingMap(Node head) {
    Node temp = head;

    while (temp != null) {
      Node nextElement = temp.next;
      Node newNode = new Node(temp.val);
      newNode.next = nextElement;
      temp.next = newNode;
      temp = nextElement;
    }

    temp = head;

    while (temp != null) {
      Node copyNode = temp.next;
      if (temp.random != null) {
        copyNode.random = temp.random.next;
      } else {
        copyNode.random = null;
      }
      temp = temp.next.next;
    }

    Node dummy = new Node(-1);
    Node res = dummy;

    temp = head;
    while (temp != null) {
      res.next = temp.next;
      temp.next = temp.next.next;

      temp = temp.next;
      res = res.next;
    }
    return dummy.next;

  }

  private static void printList(Node head) {
    while (head != null) {
      System.out.print("Data : " + head.val);
      if (head.random != null) {
        System.out.print(", Random : " + head.random.val);
      } else {
        System.out.print(", Random : NULL");
      }
      System.out.println();
      head = head.next;
    }
  }
}
