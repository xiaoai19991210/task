package com.example.task;

public class itemNode {
    Item item;
    int count;
    itemNode next;
    public itemNode() {
        item=null;
        count=0;
        next=null;
    }
    public itemNode(Item item) {
        this.item=item;
        count=1;
        next=null;
    }
}
