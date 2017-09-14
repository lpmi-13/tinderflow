package hello;

public class JSONData {

    private final String content;
    private final double meanWordLength;

    public JSONData(String content, double meanWordLength) {
        this.content = content;
        this.meanWordLength = meanWordLength;
    }

    public String getContent() {
        return content;
    }

    public double getMeanWordLength() {
        return meanWordLength;
    }
}
