package demo.my;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        searchNameUser();
        filterUser().forEach(System.out::println);

    }

/*
    private static void searchNameUser() {
        User user = new User();
        Boolean flag = true;
        for (int i = 0; i < user.getName().size(); i++) {
            if (user.getName().get(i).toLowerCase().contains(user.getName_eq())) {
                System.out.println(user.getName().get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.print("Совпадения значений с: " + "\"" + user.getName_eq() + "\"" + " не найдены");
        }
    }*/

    private static void  searchNameUser() {
        User user = new User();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите данные для поиска:");
        user.setName_eq(in.nextLine());
    }

    private static List<String> filterUser() { //почему должен быть обязательно static?
        User user = new User();
        return user.getName().stream()
                .filter(x -> x.contains(user.getName_eq().toLowerCase()))
                .collect(Collectors.toList());
    }
}