package interfaces;

import enums.ProductTypes;
import model.Product;

public interface FactoryIF {
	
	ProductIF createProduct(ProductTypes type, String name, String code, Double price);
}
