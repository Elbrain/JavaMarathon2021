package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Ты тут?");

        user2.sendMessage(user1, "Здарова!");
        user2.sendMessage(user1, "Да, я тут");
        user2.sendMessage(user1, "Как дела?");

        user3.sendMessage(user1, "Дорогой Юсер1");
        user3.sendMessage(user1, "Пишу я вам");
        user3.sendMessage(user1, "А хуле толку");

        user1.sendMessage(user3, "Уважаемый Юзер три");
        user1.sendMessage(user3, "Спасибо за ваше сообщение");
        user1.sendMessage(user3, "Толк есть всегда");

        user3.sendMessage(user1, "Приободрили, спасибо вам!");

        MessageDatabase.showDialog(user1, user3);
        //System.out.println(MessageDatabase.getMessages().get(0));
    }
}

/*    В методе main() этого класса необходимо создать трех пользователей.
        Затем необходимо:
        Отправить 2 сообщения от пользователя 1 пользователю 2
        Отправить 3 сообщения от пользователя 2 пользователю 1
        Отправить 3 сообщения от пользователя 3 пользователю 1
        Отправить 3 сообщения от пользователя 1 пользователю 3
        Отправить 1 сообщение от пользователя 3 пользователю 1

        Сообщения могут быть любыми.
        После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().*/

