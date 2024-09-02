// Новый класс редактора текста, который реализует TextProcessor
class TextServiceUniverse implements TextProcessor {
    @Override
    public String processText(String text) {
        // Допустим, редактор заменяет все вхождения слова "World" на "Universe"
        return text.replace("World", "Universe");
    }
}

