import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день");
        int d = sc.nextInt();
        System.out.println("Введите месяц");
        int m = sc.nextInt();
        System.out.println("Введите год");
        int y = sc.nextInt();
        try{
            Data date = new Data(d,m,y);
            date.print();
            System.out.println("Введите количество дней которое хотите добавить к текуей дате:");
            int k=sc.nextInt();
            date.plusDate(k);
        }
        catch(MyException e){
            System.out.println(e.getMessage()+" "+e.getDate());
        }
    }
}

