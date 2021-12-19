package decorator;

public class DigitalDecorator extends BookDecorator{

	public DigitalDecorator(BookDecoratorIF bookDecorator) {
		super(bookDecorator);
	}
	
	@Override
	public double getPrice() {		
		return bookDecorator.getPrice() * 0.85;
	}
	// preco 15% menor que o livro referencia
	
	@Override
	public String getName() {
		return bookDecorator.getName() + " Digital";
	}
}
