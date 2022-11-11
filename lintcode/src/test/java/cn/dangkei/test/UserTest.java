package cn.dangkei.test;

import cn.dangkei.beans.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class UserTest {

    @Test
    void compare() {
        User user1=new User("dingli",25,true);
        User user2=new User("huxiaojuan",24,false);
        User user3=new User("xxx",24,false);
        List<User> list=new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Collections.sort(list, new User()); //类实现了的Comparator能满足需求
        System.out.println("类自身实现Comparator:"+list);
        //现在我想要按照名字升序，显然类中实现的不能满足要求，于是可以在类外自己实现想要的比较器
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName()); //按照名字升序
            }
        });
        System.out.println("匿名内部类方式："+list);
        //由于Comparator接口是一个函数式接口，因此根据jdk1.8新特性，我们可以采用Lambda表达式简化代码
        Collections.sort(list,(u1,u2)->{return u1.getName().compareTo(u2.getName());});
        System.out.println("Lambda表达式方式："+list);

    }
}