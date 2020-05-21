package com.example.task;

public class itemLink {
    public itemNode head;
    public itemLink() {
        head=new itemNode();
    }
    public itemLink(Item i) {
        itemNode node=new itemNode(i);
        head=node;
    }
    public void addNode(Item item) {
        itemNode node=head;
        while(node.next!=null) {
            if(node.item==item) break;
            node=node.next;
        }
        if(node.next==null&&node.item!=item) {
            itemNode n=new itemNode(item);
            node.next=n;
        }
        else {
            node.count++;
        }
    }
    public void deleteNode(Item item) {
        itemNode node=head;
        itemNode pnode=null;
        while(node.item!=item) {
            pnode=node;
            node=node.next;
        }
        if(pnode!=null&&node.count==1) {
            pnode.next=node.next;
        }
        else if(pnode==null&&node.count==1){
            head=head.next;
        }
        else {
            node.count--;
        }
    }
}
