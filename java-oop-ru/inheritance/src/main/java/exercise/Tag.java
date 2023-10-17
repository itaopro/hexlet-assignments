package exercise;

import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public abstract class Tag {
    protected String name;
    protected String content;

    public Tag(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public abstract String toHTML();

    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
// END
