package decorator;

public class CapaDuraDecorator extends BookDecorator{

	public CapaDuraDecorator(BookDecoratorIF bookDecorator) {
		super(bookDecorator);
	}
	
	@Override
	public double getPrice() {		
		return bookDecorator.getPrice() * 1.20;
	}
	// preço 20% a mais que o livro referencia
	
	@Override
	public String getName() {
		return bookDecorator.getName() + " Capa Dura";
	}
}
