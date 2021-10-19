package factory;

import enums.ProductTypes;
import model.Book;
import model.Course;
import model.Disciplina;
import model.Product;
import model.ProductIF;

public class ProductFactory implements IFactory {
	

	public ProductIF createProduct(ProductTypes type, String name, String code, Double price) {
		if(type == ProductTypes.BOOK)
			return new Book(name, code, price);
		if(type == ProductTypes.DISCIPLINA)
			return new Disciplina(name, code, price);
		if(type == ProductTypes.COURSE)
			return new Course(name, code, price);
		return null;
	}

}
