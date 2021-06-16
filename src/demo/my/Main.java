package demo.my;


import java.util.Locale;
/* коментарий для коментария */
public class Main {

    public static void main(String[] args) {
        User user = new User();
        String Name_eq = "simple";//переменная для сравнения
        for (int i =0; i <user.Name.size(); i++){
            if (user.Name.get(i).toLowerCase().contains(Name_eq)) {
                System.out.println(user.Name.get(i));
            }

        }
    }
}