import java.util.Scanner;

/*

Данный алгоритм считает наибольший общий делитель, обновленная версия, работает быстрее.


Алгоритм Евклида

 */

public class UpdateTwo_div {


    private long find(long n, long m){
        while (n!= 0 && m!= 0){
            if (n>m){
                n = n%m;
            }else {
                m = m%n;
            }
        }
        return m+n;
    }

    private void run()
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.skip("\\s*");
        String str = sc.nextLine();
        long m = Long.parseLong(str);
        System.out.println(find(n,m));
    }

    public static void main(String[] args) {
        double time  = 0.001; // константа для перевода мс в сек
        double startTime = System.currentTimeMillis(); // начало работы алгаритма
        new UpdateTwo_div().run();
        double finalTime = System.currentTimeMillis(); // конец работы алгоритма
        System.out.println((finalTime - startTime)*time + " - Время работы алгоритма в секундах");  // методы дл

    }

}
