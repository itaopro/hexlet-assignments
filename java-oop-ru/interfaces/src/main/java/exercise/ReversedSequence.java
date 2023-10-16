package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private final String original;

    public ReversedSequence(String original) {
        this.original = original;
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public char charAt(int index) {
        return original.charAt(original.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sub = new StringBuilder();
        for (int i = end - 1; i >= start; i--) {
            sub.append(charAt(i));
        }
        return sub.toString();
    }

    @Override
    public String toString() {
        return new StringBuilder(original).reverse().toString();
    }

}
// END
