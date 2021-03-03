package com.company;

import java.util.Scanner;

public class Main {
    public Node head = null;
    public Node tail = null;
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String ans = null;
        do{
            System.out.println("Enter the value:");
            int a = sc.nextInt();
            main.append(a);
            System.out.println("Do you want to add another node? Type Yes/No");
            ans = sc.next();
        } while (ans.equalsIgnoreCase("yes"));
        System.out.print("The elements in the linked list are: ");
        main.display();
        System.out.println();
        main.reverse();
        System.out.print("The elements in the reversed linked list are : ");
        main.display();
    }
    class Node {
        int data;
        Node  next;
        public Node(int data){
            this.data = data;
        }
    }
    public void append(int data){
        Node node = new Node(data);
        Node temp = head;
        if(head == null){
            head = node;
            temp = node;
        }
        else {
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
            temp = temp.next;
        }
        temp.next = null;
    }
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
