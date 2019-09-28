package com.wute.testapp;

import android.app.Activity;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wute.testapp.cacheAlgorithm.DoubleLinkedList;
import com.wute.testapp.cacheAlgorithm.Node;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testDoubleLinkedList();
    }

    private void testDoubleLinkedList() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        for(int i =0;i<10;i++){
            Node node = new Node(i+"",i);
            doubleLinkedList.addTail(node);
        }
        doubleLinkedList.print();
        doubleLinkedList.addHead(new Node("-1",-1));
        doubleLinkedList.print();
        doubleLinkedList.popHead();
        doubleLinkedList.print();
        doubleLinkedList.delNode(null);
        doubleLinkedList.print();
    }
}
