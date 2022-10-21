import java.util.Objects;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }
    public boolean checkNameToEmboss() {
//        https://tproger.ru/articles/java-regex-ispolzovanie-reguljarnyh-vyrazhenij-na-praktike/
        String[] nameArray = name.split("");
        name.equals(" ");
//        name.matches();
        boolean min = name.length() >= 3;
        name.contains(" ");
        boolean max = name.length() <= 19;

//        return !Objects.equals(nameArray[0], " ") && !Objects.equals(nameArray[nameArray.length - 1], " ");
        return true;
    }
}