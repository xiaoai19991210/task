package com.example.task;

public class User {
    private String ID;
    private String sex;
    private int level;
    private String region;
    private int coupon;
    private friendLink friend;
    private itemLink item;
    public User() {
        level=1;
        coupon=0;
        friend=new friendLink(this);
        item=new itemLink();
    }
    public User(String ID,String sex,int level,String region,int coupon,friendLink friend,itemLink item) {
        this.ID=ID;
        this.sex=sex;
        this.level=level;
        this.region=region;
        this.coupon=coupon;
        this.friend=friend;
        this.item=item;
    }
    public String getID() {
        return ID;
    }
    public void charge(int amount) {
        coupon+=amount;
    }
    public void expend(int amount) {
        coupon-=amount;
    }
    public void addFriend(User u) {
        friend.addNode(u);
    }
    public void deleteFriend(String id) {
        friend.deleteNode(id);
    }
    public void addItem(Item i) {
        item.addNode(i);
    }
    public void deleteItem(Item i) {
        item.deleteNode(i);
    }
}
