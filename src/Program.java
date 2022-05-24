import java.util.ArrayList;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Один");
        arrayList.add("Один два");
        arrayList.add("Один два три");
        System.out.println(getElementsByWorld(arrayList, "два"));
    }

    public static ArrayList<String> getElementsByWorld(ArrayList<String> arrayList, String world) {
    return (ArrayList<String>) arrayList.stream().filter(a -> a.contains(world)).collect(Collectors.toList());
    }
}
