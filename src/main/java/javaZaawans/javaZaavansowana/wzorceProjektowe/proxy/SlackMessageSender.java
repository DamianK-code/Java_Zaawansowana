package javaZaawans.javaZaavansowana.wzorceProjektowe.proxy;

public class SlackMessageSender implements MessageSender {
    @Override
    public void sendMessage(String wiadosc) {
        System.out.println(wiadosc);
    }

}
