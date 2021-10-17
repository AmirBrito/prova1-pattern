package factory;

import enums.ProductTypes;
import model.Product;
import model.ProductIF;

public interface IFactory {
	
	ProductIF createProduct(ProductTypes type, String name, String code, Double price, String isbn, Integer chTotal);
}
