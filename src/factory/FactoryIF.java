package factory;

import enums.ProductTypes;
import model.Product;
import model.ProductIF;

public interface FactoryIF {
	
	ProductIF createProduct(ProductTypes type, String name, String code, Double price);
}
