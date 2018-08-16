package com.pavlo.adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("text1");
        list.add("text2");
        list.add("text3");
                 
        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);
    }

}
