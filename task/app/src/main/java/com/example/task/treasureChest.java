package com.example.task;

import java.util.Date;

public class treasureChest {
    private itemLink item;
    private int coupon;
    private Date time;
    public treasureChest() {}
    public treasureChest(itemLink item,int coupon,Date time) {
        this.item=item;
        this.coupon=coupon;
        this.time=time;
    }
    public void refreshInfo(User user) {
        itemNode i=item.head;
        for(;i!=null;i=i.next) {
            while(i.count>0) {
                user.addItem(i.item);
                i.count--;
            }
        }
        user.charge(coupon);
    }
    public int getCoupon() {
        return coupon;
    }
}
