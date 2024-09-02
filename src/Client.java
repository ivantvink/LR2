// Класс клиента, использующий TextProcessor
class Client {
    private final TextProcessor textProcessor;

    public Client(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    public String doWork(String text) {
        return textProcessor.processText(text);
    }
}