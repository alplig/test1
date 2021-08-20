package demo.my;


import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        User user = new User();
       /* Stream1 a = new Stream1();
        boolean flag = true;
        System.out.println(user.getName_eq());*/
        Scanner in = new Scanner(System.in);
        System.out.print("Введите данные для поиска:");
        user.setName_eq(in.nextLine());


        user.getName().stream().filter(x -> x.toLowerCase().contains(user.getName_eq().toLowerCase())).forEach(System.out::println);

       /* Stream<String> streamName = user.getName().stream();
        streamName.filter(x -> x == user.getName_eq())
                .forEach(System.out::println);*/



       /* for (int i =0; i <user.getName().size(); i++){
            if (user.getName().get(i).toLowerCase().contains(user.getName_eq())) {
                System.out.println(user.getName().get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.print("Совпадения значений с: "+"\""+user.getName_eq()+"\""+" не найдены");
        } */
    }
}