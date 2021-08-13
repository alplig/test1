package demo.my;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class User {
    private final List<String> name = Arrays.asList("Имя1","simple Имя2","Имя3 simple","simpleИмя4", "Имя5simple", "ИмЯ6SiMpLe", "Фильтр1","Фильтр2");
    private  String name_eq = "simple"; //переменная для сравнения по умолчанию

    public List<String> getName() {
        return name;
    }

    public String getName_eq(){
        return name_eq;
    }

    public void setName_eq(String name_eq) {
        if (!Objects.equals(name_eq, "")){ // было: name_eq!=""
        this.name_eq = name_eq;
        } else{
            System.out.println("Пустой ввод, будет отфильтровано значением по умолчанию \"simple\"");
        }
    }
}
