package decorator;


public class BookDecorator implements BookDecoratorIF{
	
	protected BookDecoratorIF bookDecorator;
	
	
	public BookDecorator(BookDecoratorIF bookDecorator) {
		this.bookDecorator = bookDecorator;
	}

	@Override
	public double getPrice() {		
		return bookDecorator.getPrice();
	}

	@Override
	public String getName() {
		return bookDecorator.getName();
	}
	
}
