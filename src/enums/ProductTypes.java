package enums;

import model.Book;
import model.Product;

public enum ProductTypes {	
	
	BOOK {
		@Override
		public String getCaract() {

			return Book.getIsbn();
		}
	}, 
	DISCIPLINA {
		@Override
		public String getCaract() {
			// TODO Auto-generated method stub
			return null;
		}
	}, 
	COURSE {
		@Override
		public String getCaract() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	public abstract String getCaract();
}
