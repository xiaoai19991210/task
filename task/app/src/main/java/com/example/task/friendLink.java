package com.example.task;

public class friendLink {
    public friendNode head;
    public friendLink() {
        head=new friendNode();
    }
    public friendLink(User user) {
        friendNode node=new friendNode(user);
        head=node;
    }
    public void addNode(User user) {
        friendNode node=head;
        while(node.next!=null) {
            node=node.next;
        }
        friendNode u=new friendNode(user);
        node.next=u;
    }
    public void deleteNode(String id) {
        friendNode node=head;
        friendNode pnode=null;
        while(node.data.getID()!=id) {
            pnode=node;
            node=node.next;
        }
        if(pnode!=null) {
            pnode.next=node.next;
        }
        else {
            head=head.next;
        }
    }
}
