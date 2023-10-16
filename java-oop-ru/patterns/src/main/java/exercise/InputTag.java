package exercise;

// BEGIN
public class InputTag implements TagInterface {
    private final String type;
    private final String value;

    public InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String render() {
        return String.format("<input type=\"%s\" value=\"%s\">", type, value);
    }

    public static void main(String[] args) {
        TagInterface tag = new InputTag("submit", "Save");
        System.out.println(tag.render());  // Output: <input type="submit" value="Save">
    }
}
// END
