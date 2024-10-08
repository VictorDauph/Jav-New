package examples.example3;



public class Main {
 public static void main(String[] args) {
     User user1 = new User("Alice", 25, 101);
     User user2 = new User("Bob", 35, 102);
     User user3 = new User("Charlie", 45, 103);
     
     // Utilisation du switch avec Record Pattern
     printUserInfo(user1);
     printUserInfo(user2);
     printUserInfo(user3);
 }

 public static void printUserInfo(User user) {
     // Switch utilisant Record Pattern
     switch (user) {

     }
 }
}
