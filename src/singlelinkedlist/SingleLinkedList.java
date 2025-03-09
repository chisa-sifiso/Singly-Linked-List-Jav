/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlelinkedlist;

/**
 *
 * @author Sifiso
 */
public class SingleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SinglyLinkedList list = new SinglyLinkedList();

        // Adding Elements
        list.addAtBeginning(30);
        list.addAtBeginning(20);
        list.addAtBeginning(10);
        list.printList(); // 10 → 20 → 30 → null

        list.addAtEnd(40);
        list.printList(); // 10 → 20 → 30 → 40 → null

        // Removing Elements
        list.removeAtBeginning();
        list.printList(); // 20 → 30 → 40 → null

        list.removeAtEnd();
        list.printList(); // 20 → 30 → null
    }
    
}
