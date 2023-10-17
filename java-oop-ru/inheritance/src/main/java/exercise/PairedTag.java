package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.StringJoiner;
import java.util.ArrayList;

// BEGIN
public class PairedTag extends Tag {
    private Map<String, String> attributes;
    private List<SingleTag> children;

    public PairedTag(String name, Map<String, String> attributes, String content, List<Tag> children) {
        super(name, content);
        this.attributes = attributes;
        this.children = new ArrayList<>();

        for (Tag child : children) {
            if (child instanceof SingleTag) {
                this.children.add((SingleTag) child);
            } else {
                // Ошибка: несовместимый тип
            }
        }
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public List<SingleTag> getChildren() {
        return children;
    }

    public void setChildren(List<SingleTag> children) {
        this.children = children;
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
            sb.setLength(sb.length() - 1);
        }

        sb.append(">");
        sb.append(getContent());

        for (SingleTag child : children) {  // Теперь здесь нет ошибки
            sb.append(child.toHTML());
        }

        sb.append("</").append(getName()).append(">");

        return sb.toString();
    }

    @Override
    public String toString() {
        return toHTML();
    }
}
// END
