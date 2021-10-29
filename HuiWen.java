package LeeCode;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class HuiWen {
    public static void  main(String[] args){

        ListNode head = new ListNode(1);
        head.add(1);
        head.add(2);
        head.add(2);
        head.add(1);
        HuiWen h1 = new HuiWen();
        boolean flag=h1.isPalindrome(head);
        System.out.println(flag);

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        public void add(int newval) {
            ListNode newNode = new ListNode(newval);
            if (this.next == null)
                this.next = newNode;
            else
                this.next.add(newval);
        }

    }
        public boolean isPalindrome(ListNode head) {
            if(head==null){
                return false;
            }
            List<Integer> vas = new ArrayList<Integer>();
            ListNode temp = head;
            while(head!=null){
                vas.add(head.val);
                head=head.next;
            }
            int j=0;
            int k =vas.size()-1;
            while(j<k){
                if(!vas.get(j).equals(vas.get(k))){
                    return false;

                }
                j++;
                k--;
            }
            return true;
//            ListNode dumyHead = new ListNode(0);
//            dumyHead.next=head;
//            ListNode l=head.next;
//            head.next=null;
//            ListNode p=dumyHead;
//            while(l!=null){
//                ListNode t=l;
//                l=l.next;
//                t.next=p.next;
//                p.next=t;
//
//            }
//            ListNode h1 =head;
//            ListNode h2=dumyHead.next;
//            while(h1!=null&&h2!=null){
//                if(h1.val!=h2.val){
//                    return false;
//                }
//                h2=h2.next;
//                h1=h1.next;
//            }
        }
    }


