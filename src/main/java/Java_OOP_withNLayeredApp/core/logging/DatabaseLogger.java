package Java_OOP_withNLayeredApp.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı : " + data);
    }
}
