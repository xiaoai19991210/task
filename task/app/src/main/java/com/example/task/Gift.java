package com.example.task;

public class Gift {
    private Item item;
    private User recv;
    private User send;
    public Gift() {}
    public Gift(Item item,User recv,User send) {
        this.item=item;
        this.recv=recv;
        this.send=send;
    }
    void give() {
        recv.addItem(item);
        send.deleteItem(item);
    }
}
