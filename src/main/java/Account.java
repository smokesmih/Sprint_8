public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        boolean result = true;
        if (name.length()< 3 | name.length() > 19){
            result = false;}
        else if (name.startsWith(" ")|| name.endsWith(" ")) {
            result = false;
        } else if ((name.chars().filter(x -> x == ' ').count()) != 1) {
          result = false;
        }
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        return result;
    }
    public Account() {
        this.name = "";
    }

}