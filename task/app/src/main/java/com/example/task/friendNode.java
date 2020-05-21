package com.example.task;

public class friendNode {
    User data;
    friendNode next;
    public friendNode() {
        data=null;
        next=null;
    }
    public friendNode(User user) {
        data=user;
        next=null;
    }
}
