package observer;

import interfaces.ObserverIF;

public class Observer implements ObserverIF{
	
	public void mensageEmailSnapShot() {
		System.out.println("Mensagem de Email \nCheck Point realizado:");	
	}
	public void mensageEmailRestore() {
		System.out.println("Mensagem de Email \n Restore realizado:");	
	}
	
	public void mensageSmsSnapShot() {
		System.out.println("Mensagem de Sms \n Check Point realizado:");	
	}
	
	public void mensageSmsRestore() {
		System.out.println("Mensagem de Sms \nRestore Realizado:");	
	}
	
	@Override
	public void update(String e) {
		
		if(e=="Get SnapShot") {
			this.mensageEmailSnapShot();
			//this.mensageSmsSnapShot();
			
		}
		else
			if(e=="Get restore") {
				this.mensageEmailRestore();
				//this.mensageSmsRestore();
			}
		
	}

}
