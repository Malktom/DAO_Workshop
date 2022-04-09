package pl.coderslab.entity;

public class MainDao {

    public static void main(String[] args) {

        //User user1 = new User();
        // user1.setId(1);
        //  user1.setUserName("Adam");
        //  user1.setEmail("adam@gmail.com");
        //  user1.setPassword("maslo");
        // user1.setId(1);
        // User user2 = new User();
 UserDao userDao = new UserDao();
//          user2.setUserName("Janek");
//          user2.setEmail("jan@gmail.com");
//          user2.setPassword("qwerty");
//          userDao1.create(user2);


        // userDao1.create(user1);
//
//        System.out.println(userDao1.read(1));
//        System.out.println(userDao1.read(3));
        User userToUpdate = userDao.read(1);
        userToUpdate.setUserName("Arkadiusz");
        userToUpdate.setEmail("arek@coderslab.pl");
        userToUpdate.setPassword("superPassword");
        userDao.update(userToUpdate);

    }
}