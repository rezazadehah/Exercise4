import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("tahsilat e khod ra vared konid");
        boolean tahsilatOK = checkTahsilat(scanner.nextLine());
        if (!tahsilatOK){
            System.out.println("tahsilate shoma taeed nashod");
            return;
        }

        System.out.println("sen e khod ra vared konid");
        boolean senOK = checkAge(scanner.nextInt());
        if (!senOK){
            System.out.println("sene shoma taeed nashod");
            return;
        }


        System.out.println("mekiate e khod ra vared konid");
        boolean meliatOK = checkMeliat(scanner.nextLine());
        if (!meliatOK){
            System.out.println("meliate shoma taeed nashod");
            return;
        }

    }

    private static boolean checkAge(int value)
    {
        return value >= 23;
    }

    private static boolean checkMeliat(String value)
    {
        return value.equals("irani");
    }

    private static boolean checkTahsilat(String value)
    {
        return value.equals("fogheDiplom");
    }
}
