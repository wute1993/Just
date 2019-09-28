package com.wute.testapp.cacheAlgorithm;
/**
 * Created by the_moyan on 2019/9/27.
 */

import android.util.Log;

/**
 * <p>
 * TODO:双向链表
 *
 * @author the_moyan
 * @version 1.0,
 * @email wute@xwtec.cn
 * @since 2019/9/27
 */
public class DoubleLinkedList {
    int capacity;
    Node head;
    Node tail;
    int size;
    public DoubleLinkedList(int capacity){
        this.capacity = capacity;
    }
    public Node addHead(Node node){
        if(head == null){
            head = node;
            tail = node;
            head.prev =null;
            head.next =null;
        }else{
            head.prev = node;
            node.next = head;
            head = node;
            head.prev = null;
        }
        size++;
        return node;
    }
    public Node addTail(Node node){
        if(tail == null){
            head = node;
            tail = node;
            tail.prev = null;
            tail.next = null;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            node.next = null;
        }
        size++;
        return node;
    }
    private Node delTail(){
        Node node = null;
        if(tail == null){
            return null;
        }
        if(tail.prev != null){
            tail = tail.prev;
            tail.next = null;
        }else {
            head= tail = null;
        }
        size--;
        return node;
    }
    private Node delHead(){
        Node node = null;
        if(head == null){
            return null;
        }
        if(head.next != null){
            head = head.next;
            head.prev = null;
        }else {
            head= tail = null;
        }
        size--;
        return node;
    }
    public Node delNode(Node node){
        if(node ==null){
            node = tail;
        }
        if(tail == node){
            delTail();
        }else if(head == node){
            delHead();
        }else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }
        return node;
    }
    public Node popHead(){
        Node node = head;
        delNode(head);
        return node;
    }
    public void print(){
        StringBuffer printContent = new StringBuffer();
        for(Node node = head;node != null;node = node.next){
            if(node != tail){
                printContent.append(node.key+","+node.value+"->");
            }else {
                printContent.append(node.key+","+node.value);
            }
        }
        Log.e("DoubleLinkedList",printContent.toString()+"");
    }
}
