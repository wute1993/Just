package com.wute.testapp.cacheAlgorithm;
/**
 * Created by the_moyan on 2019/9/27.
 */

/**
 * Copyright (C) 2014 南京欣网视讯网络科技有限公司
 * <p>
 * TODO:链表节点
 *
 * @author the_moyan
 * @version 1.0,
 * @email wute@xwtec.cn
 * @since 2019/9/27
 */
public class Node {
    String key;
    Object value;
    Node prev;
    Node next;
    public Node(String key,Object value){
        this.key = key;
        this.value = value;
    }
    public Object getValue(){
        return value;
    }
    public String getKey(){
        return key;
    }
}
