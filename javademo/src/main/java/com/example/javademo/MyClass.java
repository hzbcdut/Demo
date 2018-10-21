package com.example.javademo;

import com.example.javademo.sort.UserRemarkBean;
import com.example.javademo.sort.UserRemarkComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass {
    public static void main(String[] args){
        sort();
    }



    private static void sort() {
        List<UserRemarkBean> lists = new ArrayList<>();
        UserRemarkBean userRemarkBean = new UserRemarkBean();
        userRemarkBean.setMe(false);
        userRemarkBean.setRead(true);
        userRemarkBean.setUseName("aaa");

        UserRemarkBean userRemarkBean1 = new UserRemarkBean();
        userRemarkBean1.setMe(true);
        userRemarkBean1.setRead(true);
        userRemarkBean1.setUseName("bbb");


        UserRemarkBean userRemarkBean2 = new UserRemarkBean();
        userRemarkBean2.setMe(false);
        userRemarkBean2.setRead(false);
        userRemarkBean2.setUseName("ccc");


        lists.add(userRemarkBean);
        lists.add(userRemarkBean1);
        lists.add(userRemarkBean2);

        Collections.sort(lists, new UserRemarkComparator());

        // 需要的效果是 "bbb"是我自己 排在第一位， 未读 ccc排在第二位 aaa已读排在最后

        for (int i = 0; i< lists.size(); i++) {
            System.out.println(lists.get(i).getUseName());
        }
    }
}

