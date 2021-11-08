package interfaces;

import enums.ProductTypes;

public interface FactoryIF {
	
	ProductIF createProduct(ProductTypes type, String name, String code, Double price);
}
