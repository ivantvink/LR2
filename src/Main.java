import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ввод текста от пользователя
            System.out.print("Enter text: ");

            // Начальный результат — это введённый текст
            String resultText = scanner.nextLine();

            // Создание начального процессора
            TextProcessor currentProcessor = new TextServiceBase();
            // Создание процессора с несовместимым интерфейсом
            TextServiceUperLowerCase textService = new TextServiceUperLowerCase();

            while (true) {
                // Выбор редактора текста
                System.out.println("Choose text processor:");
                System.out.println("1. Convert to Upper Case");
                System.out.println("2. Convert to Lower Case");
                System.out.println("3. Replace 'World' with 'Universe'");
                System.out.println("4. Add prefix");
                System.out.println("5. Add suffix");
                System.out.println("6. Enter new text");
                System.out.println("7. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();  // Очистка буфера

                if (choice == 6) {
                    break;  // Выйти из внутреннего цикла и ввести новый текст
                } else if (choice == 7) {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;  // Завершить программу
                }

                switch (choice) {
                    case 1:
                        currentProcessor = new TextServiceAdapter(textService, true);
                        break;
                    case 2:
                        currentProcessor = new TextServiceAdapter(textService, false);
                        break;
                    case 3:
                        currentProcessor = new TextServiceUniverse();
                        break;
                    case 4:
                        System.out.print("Enter prefix: ");
                        String prefix = scanner.nextLine();
                        currentProcessor = new PrefixDecorator(currentProcessor, prefix);
                        break;
                    case 5:
                        System.out.print("Enter suffix: ");
                        String suffix = scanner.nextLine();
                        currentProcessor = new SuffixDecorator(currentProcessor, suffix);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                }

                // Создаем клиента и выполняем работу с текущим результатом
                Client client = new Client(currentProcessor);
                resultText = client.doWork(resultText);
                System.out.println("Processed text: " + resultText);
            }
        }
    }
}