import java.util.*;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: " + al.size());
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");
        al.add("f");
        al.add(1, "a2");
        System.out.println("Size of al after additions: " + al.size());
        System.out.println("Contents of al: " + al);
        String str = al.get(2);
        al.set(2, str + " updated");
        System.out.println("Contents of al after updation: " + al);
        al.remove("d");
        al.remove("a2");
        System.out.println("Size of al after deletion: " + al.size());
        System.out.println("Contents of al: " + al);
    }
}

