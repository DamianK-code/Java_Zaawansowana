package javaZaawans.javaZaavansowana.wzorceProjektowe.adapter;

public class ExcelEditor {
    private String text;
    public ExcelEditor(String text) {
        this.text = text;
    }
    public String getText() {
        return "Text w formacie xls: " + text;
    }
}
