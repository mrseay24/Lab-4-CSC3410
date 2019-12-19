/*
 * CSC3420 - Spring 2015
 * Sidney Seay - sseay5@student.gsu.edu
 * DateDue: 02-5-2015
 * Assignment: 4, Lab4 code
 * File(s): Main.java, IntSLLNode.java, IntSLList.java
 */

public class Main {
 public static void main (String[] args) {
 IntSLList ll = new IntSLList();
 ll.addToHead(5);
 ll.addToHead(6);
 ll.addToHead(9);
 ll.printAll(); // should print 9 6 5
 ll.deleteFromHead();
 ll.printAll(); // should print 6 5
 }
}