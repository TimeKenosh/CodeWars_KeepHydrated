import java.util.Scanner;

public class Communicator {
    Scanner scanner =  new Scanner(System.in);
    public double getTime(String text){
        System.out.print(text);
        return scanner.nextDouble();
    }
    public void resultOut(String text, int litres){
        System.out.print(text);
        System.out.println(litres);
    }
    public void close(){
        scanner.close();
    }
}
