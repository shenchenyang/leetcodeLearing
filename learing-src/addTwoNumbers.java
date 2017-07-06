/**
 * Created by scy on 2017/7/5.
 */
public class addsum {
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode resN=res;
        int carry=0;

        while(l1!=null||l2!=null||carry!=0){
            ListNode node=new ListNode(0);
            int add=(l1!=null?l1.val:0)+(l2!=null?l2.val:0)+carry;
            node.val=add%10;

            carry=add/10;

            resN.next=node;
            resN=node;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return res.next;
    }