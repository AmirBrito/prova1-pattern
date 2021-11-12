package factories;

import enums.ProductTypes;
import interfaces.FactoryIF;
import interfaces.ProductIF;
import model.Disciplina;

public class DisciplinaFactory implements FactoryIF {
	
	public ProductIF createProduct(ProductTypes type, String name, String code, Double price) {

		if(type == ProductTypes.DISCIPLINA)
			return new Disciplina(name, code, price);
		return null;
	}



}
