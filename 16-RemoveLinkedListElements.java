class Solution {
    //TC - O(N)
    //SC - O(1)
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        
        while(head!=null) {
            ListNode nex = head.next;
            if(head.val!=val){
                prev.next = head;
                head.next = null;
                prev = prev.next;
            }
            head = nex;
        }
        
        return dummy.next;
    }
}
