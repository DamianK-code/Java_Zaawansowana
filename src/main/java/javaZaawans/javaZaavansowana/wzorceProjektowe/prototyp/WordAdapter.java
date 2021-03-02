package javaZaawans.javaZaavansowana.wzorceProjektowe.prototyp;

public class WordAdapter implements TextEditor{
    private WordEditor wordEditor;
    public WordAdapter(WordEditor wordEditor) {
        this.wordEditor = wordEditor;
    }
    @Override
    public String getText() {
        return wordEditor.getText().replace("Text w formacie docx: ", "");
    }
}
