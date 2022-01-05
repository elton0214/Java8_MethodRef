package MethodRef;

import java.util.ArrayList;

class Cipher_Anonymous {
	void anonymousClass(ArrayList<String> list) 
    {
		AnonymousInterface obj = new AnonymousInterface() {
			@Override
			public void getCipher(ArrayList<String> list1) {
				for(String x:list1) {
					System.out.print(x);
				}
			}
		};
		
		obj.getCipher(list);
	          
    }
}
