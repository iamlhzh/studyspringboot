package com.company;


class super {
        String name ;
public super(String name) {
        this.name = name ;
        }
public void fun1()     {
        System.out.println("this is class super !"+name);
        }
        }
class sub extends super {
public void fun1()     {
        System.out.println("this is class sub !"+name);
        }
        }
public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}