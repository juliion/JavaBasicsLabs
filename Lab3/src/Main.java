public class Main {
    public static void main(String[] args) {
        String text = "I want to try to print this text";
        TextConverter textConverter = new TextConverter();
        String result = textConverter.convertToSetAndSort(text);
        System.out.println(result);
    }
}