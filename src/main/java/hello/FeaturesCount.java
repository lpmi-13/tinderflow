package hello;

import org.springframework.stereotype.Component;

@Component
public class FeaturesCount {

    public String text;
    public double numberOfNouns = 0;
    public double wordLength = 0;
    public double maxWordLength = 0;
    public double lexicalDensity = 0;
    public double lexicalDiversity = 0;
    public double lengthOfNounPhrase = 0;
    public double lengthOfCommit = 0;
    public String label;

    public String getText() { return text; }

    public double getNumberOfNouns() {
        return numberOfNouns;
    }

    public double getWordLength() {
        return wordLength;
    }

    public double getMaxWordLength() {
        return maxWordLength;
    }

    public double getLexicalDensity() {
        return lexicalDensity;
    }

    public double getLexicalDiversity() {
        return lexicalDiversity;
    }

    public double getLengthOfNounPhrase() {
        return lengthOfNounPhrase;
    }

    public double getLengthOfCommit() {
        return lengthOfCommit;
    }

    public String getLabel() { return label; }

    public void setText(String text) { this.text = text; }

    public void setNumberOfNouns(double numberOfNouns) {
        this.numberOfNouns = numberOfNouns;
    }

    public void setWordLength(double wordLength) {
        this.wordLength = wordLength;
    }

    public void setMaxWordLength(double maxWordLength) {
        this.maxWordLength = maxWordLength;
    }

    public void setLexicalDensity(double lexicalDensity) {
        this.lexicalDensity = lexicalDensity;
    }

    public void setLexicalDiversity(double lexicalDiversity) {
        this.lexicalDiversity = lexicalDiversity;
    }

    public void setLengthOfNounPhrase(double lengthOfNounPhrase) {
        this.lengthOfNounPhrase = lengthOfNounPhrase;
    }

    public void setLengthOfCommit(double lengthOfCommit) {
        this.lengthOfCommit = lengthOfCommit;
    }

    public void setLabel(String label) { this.label = label; }

}
