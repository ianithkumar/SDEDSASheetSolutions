package OtherThings;

import LinkedListPart1.ListNode;

import java.util.Arrays;

public class SpiralMatrix4 {
  public static void main(String[] args) {
    int m = 3;
    int n = 5;
    int[] values = {3,0,2,6,8,1,7,9,4,2,5,5,0};
    ListNode head = new ListNode(values[0]);
    ListNode current = head;

    for(int i=1;i<values.length;i++) {
      current.next = new ListNode(values[i]);
      current = current.next;
    }
    int[][] result = spiralMatric4(m,n,head);

    for(int[] nums : result) {
      for(int num : nums){
        System.out.print(num+" ");
      }
      System.out.println();
    }
  }
  private static int[][] spiralMatric4(int m, int n, ListNode head) {
    int[][] matrix = new int[m][n];
    int left = 0;
    int right = n - 1;
    int top = 0;
    int bottom = m - 1;

    // Fill the matrix with -1 initially
    for (int i = 0; i < m; i++) {
      Arrays.fill(matrix[i], -1);
    }

    while (left <= right && top <= bottom && head != null) {

      for (int i = left; i <= right && head != null; i++) {
        matrix[top][i] = head.val;
        head = head.next;
      }
      top++;

      for (int i = top; i <= bottom && head != null; i++) {
        matrix[i][right] = head.val;
        head = head.next;
      }
      right--;

      for (int i = right; i >= left && head != null; i--) {
        matrix[bottom][i] = head.val;
        head = head.next;
      }
      bottom--;

      for (int i = bottom; i >= top && head != null; i--) {
        matrix[i][left] = head.val;
        head = head.next;
      }
      left++;
    }

    return matrix;
  }
}
