

public class Task {

    String task1(int n)
    {
        return new PrimeNumbers().numberSeriesPrime(n).toString();
    }

    String task2(int n)
    {
        return new Fibonachi(n).numberSeriesFibonachi().toString();
    }

    String task3(Segment point1, Segment point2)
    {
        return point1.isIntersection(point2)?"Да":"Нет";
    }

    String task4(int first, int second)
    {
        return new NOKandNOD().found(first,second);
    }

    String task5(String string)
    {
        return (new StringBuilder(string).reverse().toString()).equalsIgnoreCase(string)? "Да": "Нет";
    }

    String task6(String string)
    {
        return string.replaceAll("\\d","");
    }
}
