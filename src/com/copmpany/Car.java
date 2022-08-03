package com.copmpany;

public class Car implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("машина жабылат");
    }
    public void drive (){
        System.out.println("машина журуп жатат");
    }
}
