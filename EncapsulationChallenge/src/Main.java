
public class Main {

	public static void main(String[] args) {

		Printer printer = new Printer();
		
		printer.printPage(1000);
		System.out.println("You have printed "+printer.getPagesPrinted()+" in total.");
		System.out.println("You have "+printer.getTonerLevel()+"% of the toner.");
		printer.fillToner(20);
		System.out.println("You have "+printer.getTonerLevel()+"% of the toner.");

	}

}
