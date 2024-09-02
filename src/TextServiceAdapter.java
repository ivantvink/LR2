// Адаптер, который делает сервис совместимым с клиентским интерфейсом
class TextServiceAdapter implements TextProcessor {
    private final TextServiceUperLowerCase textServiceUperLowerCase;
    private final boolean toUpper;  // Параметр, определяющий, какой метод использовать

    public TextServiceAdapter(TextServiceUperLowerCase textServiceUperLowerCase, boolean toUpper) {
        this.textServiceUperLowerCase = textServiceUperLowerCase;
        this.toUpper = toUpper;
    }

    @Override
    public String processText(String text) {
        if (toUpper) {
            return textServiceUperLowerCase.toUpperCase(text);
        } else {
            return textServiceUperLowerCase.toLowerCase(text);
        }
    }
}