package factories;

import enums.ProductTypes;
import interfaces.FactoryIF;
import interfaces.ProductIF;
import model.Book;
import model.Disciplina;

public class BookFactory implements FactoryIF{
	
	public ProductIF createProduct(ProductTypes type, String name, String code, Double price) {
		if(type == ProductTypes.BOOK)
			return new Book(name, code, price);
		return null;
	}

}
