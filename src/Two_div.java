import java.util.Scanner;


/*

Данный алгоритм считает наибольший общий делитель, обновленная версия, работает быстрее.

 */

public class Two_div {


    private long find(long n, long m) {
        int save = 0;
       for (int i = 1; i <= Math.max(n, m); i++){
           if (n%i == 0 && m%i == 0) {
               save = i;
               i++;
           }
       }
        return save;
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
        new Two_div().run();
        double finalTime = System.currentTimeMillis(); // конец работы алгоритма
        System.out.println((finalTime - startTime)*time + " - Время работы алгоритма в секундах");  // методы дл

    }

}