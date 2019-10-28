import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Task task = new Task();
        Scanner in = new Scanner(System.in);
        String res;
        while(true) {
            res = "";
            System.out.println("Выберите номер задачи, в случаи выхода введите 0 ");
            try {
                int changeTask = Integer.parseInt(in.nextLine());
                if (changeTask == 0) break;
               switch (changeTask)
                {
                    case 1:
                        System.out.println("Введите N");
                        res = task.task1(Integer.parseInt(in.nextLine()));
                        break;
                    case 2:
                        System.out.println("Введите N");
                        res = task.task2(Integer.parseInt(in.nextLine()));
                        break;
                    case 3:

                        System.out.println("Введите для первой точки первую вершину (х,у) через пробел");
                        String[] firstPoint = in.nextLine().trim().split(" ");
                        System.out.println("Введите для первой точки вторую вершину (х,у) через пробел");
                        String[] secondPoint = in.nextLine().trim().split(" ");

                        Segment point1 = new Segment(
                                Double.parseDouble(firstPoint[0]),
                                Double.parseDouble(secondPoint[0]),
                                Double.parseDouble(firstPoint[1]),
                                Double.parseDouble(secondPoint[1]));

                        System.out.println("Введите для второй точки первую вершину (х,у) через пробел");
                        firstPoint = in.nextLine().trim().split(" ");
                        System.out.println("Введите для второй точки вторую вершину (х,у) через пробел");
                        secondPoint = in.nextLine().trim().split(" ");

                        Segment point2 = new Segment(
                                Double.parseDouble(firstPoint[0]),
                                Double.parseDouble(secondPoint[0]),
                                Double.parseDouble(firstPoint[1]),
                                Double.parseDouble(secondPoint[1]));

                        res = task.task3(point1, point2);
                        break;
                    case 4:
                        System.out.println("Введите первое число");
                        int first = Integer.parseInt(in.nextLine());
                        System.out.println("Введите второе число");
                        int second = Integer.parseInt(in.nextLine());

                        res = task.task4(first,second);
                        break;
                    case 5:
                        System.out.println("Введите строку");
                        res = task.task5(in.nextLine());
                        break;
                    case 6:
                        System.out.println("Введите строку");
                        res = task.task6(in.nextLine());
                        break;
                        default: System.out.println("Такой задачи нет");
                        break;
                }
                System.out.println("Ответ:" + res);
            } catch (NumberFormatException e){
                  System.out.println("Ошибка " + e.getMessage() + "введите все занаво");
            }
        }
    }
}
