// Сторонний класс сервиса с несовместимым интерфейсом
class TextServiceUperLowerCase {
    public String toUpperCase(String text) {
        return text.toUpperCase();
    }

    public String toLowerCase(String text) {
        return text.toLowerCase();
    }
}