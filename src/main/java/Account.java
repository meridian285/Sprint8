import java.util.Objects;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }
    public boolean checkNameToEmboss() {

        String[] nameArray = name.split("");
//        String text = new String();
        System.out.println());
        return !Objects.equals(nameArray[0], " ") && !Objects.equals(nameArray[nameArray.length - 1], " ")
                && name.length() >= 3 && name.length() <= 19 && name.contains(" ");

    }
}