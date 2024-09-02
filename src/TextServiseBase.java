// Базовый класс редактора текста
class TextServiceBase implements TextProcessor {
    @Override
    public String processText(String text) {
        return text; // Никаких изменений в базовом редакторе
    }
}