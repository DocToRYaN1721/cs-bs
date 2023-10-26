package com.example.csbs.Server;


import java.util.ArrayList;
import java.util.List;

//定义一个服务类，实现对联系人信息的增删改查等功能
public class Service {
    //定义一个列表，用于存储联系人对象
    private List<Contact> contacts;

    //构造方法，初始化列表
    public Service() {
        contacts = new ArrayList<>();
        //可以在这里添加一些测试数据
        contacts.add(new Contact("张三", "北京市朝阳区", "13812345678"));
        contacts.add(new Contact("李四", "上海市浦东新区", "13987654321"));
        contacts.add(new Contact("王五", "成都市新都区", "13666666666"));
    }

    //添加联系人方法，接收一个联系人对象作为参数，将其添加到列表中
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    //删除联系人方法，接收一个姓名作为参数，根据姓名删除对应的联系人对象
    public void deleteContact(String name) {
        //遍历列表，找到匹配的联系人对象
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name)) {
                //从列表中移除该对象
                contacts.remove(i);
                break;
            }
        }
    }

    //修改联系人方法，接收一个联系人对象作为参数，根据姓名修改对应的联系人对象
    public void updateContact(Contact contact) {
        //遍历列表，找到匹配的联系人对象
        for (int i = 0; i < contacts.size(); i++) {
            Contact c = contacts.get(i);
            if (c.getName().equals(contact.getName())) {
                //更新该对象的属性
                c.setAddress(contact.getAddress());
                c.setPhone(contact.getPhone());
                break;
            }
        }
    }

    //查询联系人方法，接收一个姓名作为参数，根据姓名查询对应的联系人对象，并返回该对象
    public Contact queryContact(String name) {
        //遍历列表，找到匹配的联系人对象
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                //返回该对象
                return contact;
            }
        }
        //如果没有找到匹配的对象，返回null
        return null;
    }

    //显示所有联系人方法，返回一个包含所有联系人信息的字符串
    public String showAllContacts() {
        //创建一个字符串缓冲区，用于拼接字符串
        StringBuffer sb = new StringBuffer();
        //遍历列表，将每个联系人对象的信息添加到字符串缓冲区中
        for (Contact contact : contacts) {
            sb.append(contact.toString() + "\n");
        }
        //返回字符串缓冲区的内容
        return sb.toString();
    }
}
