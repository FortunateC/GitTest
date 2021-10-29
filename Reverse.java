package LeeCode;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static void main(String[] args){

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dumyHead=new ListNode(0,null);
        List<Integer> vrs = new ArrayList<Integer>();
        ListNode p=head;
        ListNode res=p;
        ListNode h=dumyHead;

        int num=0;
        int i=0;
        while(p!=null){
            num++;
            vrs.add(p.val);
            if(num==k){
                res=p;
                h=reverse(h,vrs,i,i+num-1);
                i=i+num;
                num=0;
            }
            p=p.next;
        }
        if(num<k){
            ListNode t =h;
            while(t.next!=null){
                t=t.next;
            }
            t.next=res.next;

        }
        return dumyHead.next;
    }
    public ListNode reverse(ListNode h,List<Integer> vrs,int first,int end){
        ListNode t =h;
        while(t.next!=null){
            t=t.next;
        }
        for(int i=end;i>=first;i--){
            ListNode x=new ListNode();
            x.val =vrs.get(i);
            t.next=x;
            t=t.next;
        }
        return h;
    }

    public static class ListNode{
        int val;
        ListNode next;

       ListNode(){

        }
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next)
        {
            this.val = val;
            this.next=next;
        }
    }
}
