package hello;

import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import org.springframework.stereotype.Component;

import java.io.StringReader;

import static edu.stanford.nlp.process.WhitespaceTokenizer.newWordWhitespaceTokenizer;

@Component
public class Tagger {

    private final LexicalizedParser parser;

    public Tagger(LexicalizedParser parser) {
        this.parser = parser;
    }

    public String taggedWords(String message) {
        return (POSString(parser.apply(newWordWhitespaceTokenizer(new StringReader(message)).tokenize())));
    }

    private String POSString(edu.stanford.nlp.trees.Tree tree) {
        return tree.toString();
    }
}
