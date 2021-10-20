package factory;

import enums.ProductTypes;
import model.Book;
import model.Course;
import model.Disciplina;
import model.Product;
import model.ProductIF;

public class ProductFactory implements FactoryIF {
	

	public ProductIF createProduct(ProductTypes type, String name, String code, Double price) {
		if(type == ProductTypes.BOOK)
			return new Book(name, code, price);
		if(type == ProductTypes.DISCIPLINA)
			return new Disciplina(name, code, price);
		return null;
	}

}
