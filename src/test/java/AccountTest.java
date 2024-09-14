import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AccountTest {
    @Spy
    Account account;

    @Test
    @DisplayName("Позитивная проверка логического метода валидации")
    public  void checkNameToEmbossPositiveTest(){
    account = new Account("Иван Петров");
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Негативная проверка логического метода валидации с двумя пробелами")
    public  void checkNameToEmbossTwoSpace(){
        account = new Account("Иван  Петров");
        Assert.assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("Негативная проверка логического метода валидации с  пробелом в начале строки")
    public  void checkNameToEmbossStartWithSpace(){
        account = new Account(" ИванПетров");
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Негативная проверка логического метода валидации с  пробелом в конце строки")
    public  void checkNameToEmbossEndWithSpace(){
        account = new Account("ИванПетров ");
        Assert.assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("Негативная проверка логического метода валидации со строкой меньше 3х символов")
    public  void checkNameToEmbossLess2Chars(){
        account = new Account("И ");
        Assert.assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("Негативная проверка логического метода валидации со строкой больше 19ти символов")
    public  void checkNameToEmbossMore19Chars(){
        account = new Account("Иван Петровичусвичсc");
        Assert.assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("Тест конструктора")
    public  void AccountConstructorTest(){
        account = new Account("Иван Петровичусвичсc213213213123123");
       Assert.assertNotNull(account);
    }


}
