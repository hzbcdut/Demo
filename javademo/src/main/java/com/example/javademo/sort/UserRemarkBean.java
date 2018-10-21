package com.example.javademo.sort;

import java.io.Serializable;

/**
 * 主要功能:
 * author huzhengbiao
 * date : On 2018/10/21
 */
public class UserRemarkBean implements Serializable{

    private String useName;
    private boolean isRead;
    private long time;
    private boolean isMe;

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isMe() {
        return isMe;
    }

    public void setMe(boolean me) {
        isMe = me;
    }
}
