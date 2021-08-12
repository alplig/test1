package demo.my;



public class Main {

    public static void main(String[] args) {
      User user = new User();
        String Name_eq = "simple";//переменная для сравнения
        for (int i =0; i <user.getName().size(); i++){
            if (user.getName().get(i).toLowerCase().contains(Name_eq)) {
                System.out.println(user.getName().get(i));
            }

        }
    }
}