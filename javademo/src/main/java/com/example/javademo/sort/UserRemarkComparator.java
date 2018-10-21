package com.example.javademo.sort;

import java.util.Comparator;

/**
 * 主要功能:
 * author huzhengbiao
 * date : On 2018/10/21
 */
public class UserRemarkComparator implements Comparator<UserRemarkBean>{

    @Override
    public int compare(UserRemarkBean t1, UserRemarkBean t2) {
        if (t1.isMe()) return -1;
        if (t2.isMe()) return 1;
//
//
//        if (!t1.isRead() || !t2.isRead()) {
//
//
//        }else {
//
//            if (t1.getTime() >= t2.getTime()) {
//                return 1;
//            }else{
//                return -1;
//            }
//
//        }


        return 0;

    }
}
