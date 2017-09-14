package hello;

import org.springframework.stereotype.Component;

@Component
public class CountModel {

    public TextData textData;

    public String[] dataArray = textData.getData();

//    public final FeaturesCount featuresCount;

//    for (String item : dataArray) {
        //s et the text from dataArray to the text property in the featuresCount
        // object, then add that object to a new object array
//    }

//    public String sendSuccessString() {
//        return String.format("the current mean length of commit is: %s \n" +
//                "the current mean number of nouns is is: %s \n" +
//                "the current mean word length is: %s \n" +
//                "the current mean max word length is: %s \n" +
//                "the current mean lexical density is: %s \n" +
//                "the current mean lexical diversity is: %s \n" +
//                "the current mean length of noun phrase is: %s",
//                meanLengthOfCommit, meanNumberOfNouns, meanWordLength, meanMaxWordLength, meanLexicalDensity, meanLexicalDiversity, meanLengthOfNounPhrase);
//    }
}
