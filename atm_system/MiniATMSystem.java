package atm_system;

public class MiniATMSystem {
    public static void main(String[] args) {
       
        User[] users = new User[5];
        users[0] = new User("1234", 5000);
        users[1] = new User("1111", 3000);
        users[2] = new User("2222", 7000);
        users[3] = new User("3333", 2500);
        users[4] = new User("4444", 10000);

        ATM atm = new ATM(users);
        atm.start();
    }
}
