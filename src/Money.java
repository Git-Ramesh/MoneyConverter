import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Money {
	private static final Locale DEFAULT_LOCALE = new Locale("en", "US");
//	private static final Currency CURRENCY = Currency.getInstance(DEFAULT_LOCALE);
	private static final NumberFormat NUMBER_FORMAT = NumberFormat.getCurrencyInstance(DEFAULT_LOCALE);
	private final BigDecimal amount;
//	private final Currency currency;
	private final NumberFormat numberFormat;

	public static Money monetaryAmount(BigDecimal amount) {
		return new Money(amount, DEFAULT_LOCALE);
	}

	public Money(BigDecimal amount, Locale locale) {
		this.amount = amount;
		this.numberFormat = NumberFormat.getCurrencyInstance(locale);
	}

	public BigDecimal getAmount() {
		return amount;
	}

//	public Currency getCurrency() {
//		return currency;
//	}

//	@Override
//	public String toString() {
//		return NUMBER_FORMAT.format(amount) + " " + (currency == null ? CURRENCY.getSymbol() : currency.getSymbol());
//	}

	@Override
	public String toString() {
		return ((this.numberFormat == null) ? NUMBER_FORMAT : numberFormat).format(amount);
	}
}
