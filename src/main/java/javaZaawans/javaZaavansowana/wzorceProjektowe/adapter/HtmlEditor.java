package javaZaawans.javaZaavansowana.wzorceProjektowe.adapter;

public class HtmlEditor {
    private String text;

    public HtmlEditor(String text) {
        this.text = text;
    }

    public String getText() {
        return "<html>" + text +"</html>";
    }
}
