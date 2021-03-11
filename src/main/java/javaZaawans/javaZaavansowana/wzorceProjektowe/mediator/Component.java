package javaZaawans.javaZaavansowana.wzorceProjektowe.mediator;

public interface Component {
    void sendRequest();

    default void sendRequest(String context) {
        sendRequest();
    }
}
