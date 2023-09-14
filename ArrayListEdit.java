import java.util.ArrayList;

public class ArrayListEdit {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int index=1;
        int temp = numbers.get(index);
        int num = 3;

        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(num,index);
        for (int i=index+1;i<numbers.stream().count();i++)
        {
            numbers.add(temp,i);
        }
    }
}
