import java.util.ArrayList;

public class Fibonachi {

    private int n;

    Fibonachi(int n)
    {
        this.n  = n;
    }

    ArrayList<Integer> numberSeriesFibonachi()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        return fibonachi(list);
    }

    private ArrayList<Integer> fibonachi(ArrayList<Integer> list) {
        int check = list.get(list.size() - 1) + list.get(list.size() - 2);
        if (check < n) {
            list.add(check);
            return fibonachi(list);
        }
        return list;
    }


}
