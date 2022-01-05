package MethodRef;

import java.util.ArrayList;

class Cipher_MethodRef {
	void methodReference(ArrayList<String> list)        
	{	
		AnonymousInterface obj = (ArrayList<String> list1) -> {
			list1.forEach(System.out::print);
		};
		
		obj.getCipher(list);
    }
}
