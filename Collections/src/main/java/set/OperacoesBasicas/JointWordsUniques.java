package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class JointWordsUniques {
    Set<String> wordsUniques;

    public JointWordsUniques() {
        this.wordsUniques = new HashSet<>();
    }

    public void addWord(String word) {
        wordsUniques.add(word);
    }

    public void removeWord(String word) {
        wordsUniques.remove(word);
    }

    public boolean verifyWord(String word) {
        return wordsUniques.contains(word);
    }

    public void showWordsUniques() {

        System.out.println("Palavras únicas do conjunto");

        for (String words : wordsUniques) {
            System.out.println(words);
        }
    }

    public static void main(String[] args) {
        JointWordsUniques join = new JointWordsUniques();

        join.addWord("Java");
        join.addWord("Spring");
        join.addWord("Groovy");
        join.addWord("Javascript");

        join.showWordsUniques();

        System.out.println(join.verifyWord("Javascript"));

        join.removeWord("Spring");

        join.showWordsUniques();
    }
}
