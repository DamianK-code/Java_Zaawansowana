package javaZaawans.javaZaavansowana.wzorceProjektowe.prototyp;

import java.util.ArrayList;
import java.util.List;

public class AdapterUżycie {
    private static List<TextEditor> listaEdytorow = new ArrayList<>();
    public static void main(String[] args) {
        WordEditor wordEditor =  new WordEditor("ALA ma kota");
        PdfEditor pdfEditor =  new PdfEditor("JOHN Duch zdobył nowe punkty");
        ExcelEditor excelEditor = new ExcelEditor("Dwa plus cztery");
        listaEdytorow.add(new WordAdapter(wordEditor));
        listaEdytorow.add(new PdfAdapter(pdfEditor));
        listaEdytorow.add(new ExcelAdapter(excelEditor));
        wyswietlRózneTeksty();
    }
    private static void wyswietlRózneTeksty(){
        for(TextEditor editor : listaEdytorow){
            System.out.println(editor.getText() + "\n");
        }
    }
}
