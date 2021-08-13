package demo.my;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      User user = new User();
    //  System.out.println(user.getName_eq());
      Scanner in = new Scanner(System.in);
      System.out.print("Введите данные для поиска:");
      user.setName_eq(in.nextLine());
     // System.out.println(user.getName_eq());

        for (int i =0; i <user.getName().size(); i++){
            if (user.getName().get(i).toLowerCase().contains(user.getName_eq())) {
                System.out.println(user.getName().get(i));
            }

        }
    }
}