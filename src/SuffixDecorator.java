// Декоратор, добавляющий суффикс к тексту
class SuffixDecorator implements TextProcessor {
    private final TextProcessor textProcessor;
    private final String suffix;

    public SuffixDecorator(TextProcessor textProcessor, String suffix) {
        this.textProcessor = textProcessor;
        this.suffix = suffix;
    }

    @Override
    public String processText(String text) {
        return textProcessor.processText(text) + suffix;
    }
}