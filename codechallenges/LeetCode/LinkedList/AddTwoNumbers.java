import java.math.BigInteger;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb = new StringBuilder();
        while(l1 != null){
            sb.append(l1.val);
            l1 = l1.next;
        }
        BigInteger value1 = new BigInteger(sb.reverse().toString());
        sb.setLength(0);
        while(l2 != null){
            sb.append(l2.val);
            l2 = l2.next;
        }
        BigInteger value2 = new BigInteger(sb.reverse().toString());
        String ans = new StringBuilder(new BigInteger(value1 + value2)).reverse().toString();
        ListNode head = null;
        ListNode aux = null;
        char[] c = ans.toCharArray();
        ListNode first = new ListNode(c[0] - '0');
        head = first;
        aux = first;
        for(int i = 1; i < c.length; i++){
            head = new ListNode(c[i] - '0');
            aux.next = head;
            aux = head;
        }
        return first;

    }
}