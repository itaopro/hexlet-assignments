package exercise;

import java.util.Map;
import java.util.StringJoiner;

// BEGIN
public class SingleTag extends Tag {
    private Map<String, String> attributes;

    public SingleTag(String name, Map<String, String> attributes) {
        super(name, "");
        this.attributes = attributes;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(getName());

        if (!attributes.isEmpty()) {
            sb.append(" ");
            for (Map.Entry<String, String> entry : attributes.entrySet()) {
                sb.append(entry.getKey()).append("=\"").append(entry.getValue()).append("\" ");
            }
            sb.setLength(sb.length() - 1);  // Удаление лишнего пробела
        }
        sb.append(">");

        return sb.toString();
    }

    @Override
    public String toString() {
        return toHTML();
    }
}
// END
