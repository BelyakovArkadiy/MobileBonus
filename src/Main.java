public class Main {
    public static void main(String[] args) {
        int account = 100;
        int accountRefill = 850;

        if (accountRefill >= 1000) {
            int bonus = accountRefill / 100;
            accountRefill = account + accountRefill + bonus;
            System.out.println("Your mobile account is credited to " + accountRefill);

        } else {
            accountRefill = account + accountRefill;
            System.out.println("Your mobile account is credited to " + accountRefill);
        }

    }
}
