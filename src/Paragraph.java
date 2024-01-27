import java.util.*;
public class Paragraph {

	    private StringBuffer paragraph;

	    public Paragraph(String initialText) {
	        paragraph = new StringBuffer(initialText);
	    }

	    public void insertText(String text, int index) {
	        if (index >= 0 && index <= paragraph.length()) {
	            paragraph.insert(index, text);
	        } else {
	            System.out.println("Invalid index for insertion.");
	        }
	    }

	    public void deleteWord(String word) {
	        int startIndex = 0;
	        while ((startIndex = paragraph.indexOf(word, startIndex)) != -1) {
	            paragraph.delete(startIndex, startIndex + word.length());
	        }
	    }

	    public void replaceWord(String oldWord, String newWord) {
	        int startIndex = 0;
	        while ((startIndex = paragraph.indexOf(oldWord, startIndex)) != -1) {
	            paragraph.replace(startIndex, startIndex + oldWord.length(), newWord);
	            startIndex += newWord.length();
	        }
	    }

	    public void convertPunctuators() {
	        for (int i = 0; i < paragraph.length(); i++) {
	            char c = paragraph.charAt(i);
	            if (isPunctuator(c)) {
	                paragraph.setCharAt(i, '@');
	            }
	        }
	    }

	    private boolean isPunctuator(char c) {
	        return !Character.isLetterOrDigit(c) && c != ' ';
	    }
	    public String getParagraphText() {
	        return paragraph.toString();
	    }

	    public static void main(String[] args) {
	 
	        Paragraph myParagraph = new Paragraph("I am Prasath, I study at VIT Vellore.");
	        myParagraph.insertText("VS", 12);
	        myParagraph.deleteWord("Vellore");
	        myParagraph.replaceWord("VIT", "Vellore Institute of Technology");
	        myParagraph.convertPunctuators();
	        System.out.print("\n23MCA0078 || PRASATH VS\n\n");
	        System.out.print("Given sentence:\nI am Prasath, I study at VIT Vellore.");
	        System.out.println("\n\nAfter altering:\n"+myParagraph.getParagraphText());
	    }
	}


