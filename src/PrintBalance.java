import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance{

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
	
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		
		Locale[] locales = {new Locale("en","US"), new Locale("fr","FR"), new Locale("de","DE")};
		
		System.out.println("(0) en_US (1) fr_FR (2) de_DE");
		int choice = scanInput.nextInt();
		
		Locale currentLocale = locales[choice];
		ResourceBundle messages = ResourceBundle.getBundle("messages", currentLocale);
		
		//Greeting
		System.out.println(messages.getString("PrintBalance.0")); //$NON-NLS-1$
		
		//Get User's Name
		System.out.println(messages.getString("PrintBalance.1")); //$NON-NLS-1$
		String name = scanInput.nextLine();
		name = scanInput.nextLine();
		System.out.printf(messages.getString("PrintBalance.2")+"\n", name); //$NON-NLS-1$
		
		//print today's date, balance and bid goodbye
		System.out.printf(messages.getString("PrintBalance.3")+"\n", DateFormat.getDateInstance(0, currentLocale).format(today)); //$NON-NLS-1$
		System.out.printf(messages.getString("PrintBalance.4")+"\n", NumberFormat.getCurrencyInstance(currentLocale).format(9876543.21)); //$NON-NLS-1$
		System.out.println(messages.getString("PrintBalance.5")); //$NON-NLS-1$
	}
}



