package hello;

public class NLPAnalyzer {

    public Tagger tagger;

    public String sendPOSTags(String sentence) {
        return tagger.taggedWords(sentence);
    }
}
