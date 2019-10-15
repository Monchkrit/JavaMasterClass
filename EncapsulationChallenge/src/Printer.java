public class Printer {

	private int tonerLevel;
	private int pagesPrinted;
	private boolean isDuplex;
	
	public Printer() {
		tonerLevel = 100;
		pagesPrinted = 0;
		isDuplex = true;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public boolean isDuplex() {
		return isDuplex;
	}
	
	public void printPage(int numberOfPages) {
		if (numberOfPages > 0) {
			System.out.println("You printed "+numberOfPages+" pages.");
			pagesPrinted += numberOfPages;
			tonerLevel -= (numberOfPages * .01);
			System.out.println("You have "+tonerLevel+"% toner remaining.");
		}
	}
	
	public void fillToner(int fillAmount) {
		if ((tonerLevel + fillAmount) > 100) {
			tonerLevel = 100;
		} else {
			tonerLevel += fillAmount;
		}
		System.out.println("You filled the toner with "+fillAmount+"% of toner.");
	}
}
