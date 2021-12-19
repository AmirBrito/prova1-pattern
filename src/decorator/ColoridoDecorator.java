package decorator;

public class ColoridoDecorator extends BookDecorator{

	public ColoridoDecorator(BookDecoratorIF bookDecorator) {
		super(bookDecorator);
	}	
	
	@Override
	public double getPrice() {		
		return bookDecorator.getPrice() * 1.05;
	}
	// preço 5% a mais que o livro referencia
	
	@Override
	public String getName() {
		return bookDecorator.getName() + " Colorida";
	}
}
