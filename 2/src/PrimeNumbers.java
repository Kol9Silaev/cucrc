import java.util.ArrayList;

public class PrimeNumbers {

    ArrayList<Integer> numberSeriesPrime(int n)
    {
        boolean isComprosite;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n;i++)
        {
            isComprosite = true;
            for (int j = 2; j < i; j++)
                if (i % j == 0) {
                    isComprosite = false;
                    break;
                }
            if (isComprosite)
                list.add(i);
        }
        return list;
    }
}
