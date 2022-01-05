package MethodRef;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

class Cipher_LambdaExp {
	void lambdaExpression(ArrayList<String> list) 
    {
		AnonymousInterface obj = (list1) -> {
        	for (int i=0; i< list1.size();i++) {
                byte[] bytes = list1.get(i).substring(0,1).getBytes(StandardCharsets.US_ASCII);
                
                String str2 = bytes[0] + list1.get(i).substring(1);
                
                // replace space
                str2 = str2.replace("32", "#$");
                
                //reverse
                StringBuilder inputR = new StringBuilder();
                inputR.append(str2);
                inputR.reverse();
                
                list1.set(i,inputR.toString());
      		}
        	
        	for (String x:list1) {
            	System.out.print(x);
            }
        };

        obj.getCipher(list);
    }
}
