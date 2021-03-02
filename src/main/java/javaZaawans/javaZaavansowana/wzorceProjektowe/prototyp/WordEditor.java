package javaZaawans.javaZaavansowana.wzorceProjektowe.prototyp;

public class WordEditor {
    private String text;
    public WordEditor(String text) {
        this.text = text;
    }
    public String getText() {
        return "Text w formacie docx: " + text;
    }
}
