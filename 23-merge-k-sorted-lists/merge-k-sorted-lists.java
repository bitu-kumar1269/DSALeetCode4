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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();

        for(ListNode head : lists){
            ListNode curr = head;

            while(curr != null){
                list.add(curr.val);
                curr = curr.next;
            }
        }
        Collections.sort(list);

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for(int i=0; i<list.size(); i++){
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return dummy.next;

    }
}