/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;

import java.util.Scanner;

/**
 *
 * @author LuisGuillermo
 */
public class PhoneContacts {

    /**
     * @param args the command line arguments
     */
    public static Scanner teclado = new Scanner(System.in);
    public static MobilePhone MyPhone = new MobilePhone();
    
    public static void main(String[] args) {
        // TODO code application logic here
        int option;
        
        printMenu();
        option = teclado.nextInt();
        while(option > 0  & option < 6){
            switch(option){
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4: 
                    quaryContact();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }
            System.out.println("Select option");
            option = teclado.nextInt();
        }
    }
    
    public static void printMenu(){
        System.out.println("Menu:");
        System.out.println("0. Quit");
        System.out.println("1. Add contact");
        System.out.println("2. Update contact");
        System.out.println("3. Delete contact");
        System.out.println("4. Query contact");
        System.out.println("5. List all contacts");
        System.out.println("6. Print options");
        
        
    }
    
    public static void addContact(){
        String name;
        int number;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Contact name: ");
        name = teclado.nextLine();
        System.out.println("telephone number: ");
        number = teclado.nextInt();
        
        if(MyPhone.addContact(name,number)){
            System.out.println("Contact added");
        }else{
            System.out.println("Contact is already list");
        }
    }
    
    public static void updateContact(){
        String name;
        int number;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Contact name: ");
        name = teclado.nextLine();
        System.out.println("telephone number: ");
        number = teclado.nextInt();
        
        if(MyPhone.updateContact(name,number)){
           System.out.println("Contact updated");
        }else{
            System.out.println("Contact not updated");
         
        }
    }
    
    public static void deleteContact(){
        String name;
        int number;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Contact name: ");
        name = teclado.nextLine();
        System.out.println("telephone number: ");
        number = teclado.nextInt();
        
        if(MyPhone.removeContacts(name, number)){
            System.out.println("Contact deleted");
        }else{
            System.out.println("Contact not found");
        }
    }
    
    public static void quaryContact(){
        String name; 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Contact name: ");
        name = teclado.nextLine();
        System.out.println(MyPhone.quaryContact(name));
        
        }
    public static void listAll(){
    MyPhone.listContact();
    }
}
    

