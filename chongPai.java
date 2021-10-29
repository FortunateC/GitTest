package LeeCode;

import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class chongPai {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.add(5);
        chongPai ch = new chongPai();
        ch.reorderList(head);




    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
        public void add(int newval){
            ListNode l =new ListNode(newval);
            if(this.next==null){
                this.next=l;
            }
            else{
                this.next.add(newval);
            }
        }


    }
    public void reorderList(ListNode head) {
        ListNode h1=head;

        List<Integer> vrs = new ArrayList<Integer>();

        while(h1!=null){
            vrs.add(h1.val);
            h1=h1.next;
        }
        int len = vrs.size();
        ListNode t=head;

       for(int i =len-1;i>len/2;i--){
            ListNode n = new ListNode();
            n.val=vrs.get(i);
            n.next=t.next;
            t.next =n;
            t=n.next;

        }
       if(len%2==0){
           t.next.next=null;
       }
       else{
           t.next=null;
       }



    }
}
