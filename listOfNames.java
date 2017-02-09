import java.util.*;

public class listOfNames {


    public static void main(String[] args) {
    //ArrayList<String> names = null;
    //greetFolks(names.);
        ArrayList<String> al = new ArrayList<>();
        int namesNumber = 5;
        greetFolks(al, namesNumber);
    }


    public static void greetFolks(ArrayList<String> al, int namesNumber) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < namesNumber; i++) {
            System.out.println("Please enter list of names one by one: ");
            String name = scan.nextLine();
            al.add(name);
        }

        for(int j=0; j<al.size();j++){
            System.out.println("Hello " + al.get(j));
        }
    }
}

