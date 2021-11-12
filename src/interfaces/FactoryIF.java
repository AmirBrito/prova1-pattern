package interfaces;

import enums.ProductTypes;
import model.Book;

public interface FactoryIF {
	
	ProductIF createProduct(ProductTypes type, String name, String code, Double price);
}
