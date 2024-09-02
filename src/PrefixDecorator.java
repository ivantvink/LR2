// Декоратор, добавляющий префикс к тексту
class PrefixDecorator implements TextProcessor {
    private final TextProcessor textProcessor;
    private final String prefix;

    public PrefixDecorator(TextProcessor textProcessor, String prefix) {
        this.textProcessor = textProcessor;
        this.prefix = prefix;
    }

    @Override
    public String processText(String text) {
        return prefix + textProcessor.processText(text);
    }
}