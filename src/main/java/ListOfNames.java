import java.util.*;

public class ListOfNames {


    public String askUserForName() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }


    public static void main(String[] args) {
        int namesNumber = 5;
        List<String> names = new ArrayList<>();
        System.out.println("Please enter list of names one by one: ");
        for (int i = 0; i < namesNumber; i++) {
            names.add(new ListOfNames().askUserForName());
        }

        for (int j = 0; j < names.size(); j++) {
            System.out.println("Hello " + names.get(j));
        }

    }
}







