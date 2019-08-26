import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
//		Money money = new Money(BigDecimal.valueOf(1000000), Currency.getInstance(new Locale("en", "IN")));
//		System.out.println(money);
//		System.out.println(Money.monetaryAmount(BigDecimal.valueOf(12000)));
		Money money = new Money(BigDecimal.valueOf(1000000), (new Locale("hi", "IN")));
		Money money1 = new Money(BigDecimal.valueOf(1000000), (new Locale("en", "US")));
		System.out.println(money);
		System.out.println(money1);
	}
}
