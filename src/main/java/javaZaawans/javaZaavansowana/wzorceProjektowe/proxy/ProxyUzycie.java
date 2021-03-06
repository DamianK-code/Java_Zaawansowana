package javaZaawans.javaZaavansowana.wzorceProjektowe.proxy;

public class ProxyUzycie {
    public static void main(String[] args) {
        User gold = new User("Złoty_User", TypUser.USER_GOLD);
        User user = new User("Hot_Andrzej", TypUser.USER_ZALOGOWANY);
        User admin =  new User("admin", TypUser.ADMIN);
        User anonimowy =  new User("nieznany", TypUser.USER_NIE_ZALOGOWANY);
        MessageSender messageSender =  new SlackMessageSender();
        SlackMessageSenderProxy proxy = new SlackMessageSenderProxy(messageSender, gold);
        proxy.sendMessage("Witaj userze: ");
    }
}
