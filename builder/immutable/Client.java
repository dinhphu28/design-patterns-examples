public class Client {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount
				.BankAccountBuilder("GP Coder", "0123456789")
				.withEmail("contact@gpcoder.com")
				.withNewsletter(true)
				.build();

		System.out.println(bankAccount);
	}
}
