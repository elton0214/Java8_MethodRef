package MethodRef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CipherMain
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list=new ArrayList<>();
		
//		String input=br.readLine();
		String input = "Hi, how are you?";
		String inputarr[]=input.split(" ");
		
		list.add(inputarr[0]);
		for(int i=0;i<inputarr.length-1;i++)
		 {
			list.add(" ");
			list.add(inputarr[i+1]);
		 }
		
		Cipher_LambdaExp l1=new Cipher_LambdaExp();
		System.out.print("Lambda Expression : ");
		l1.lambdaExpression(list); //Already modify list
		
//		System.out.print("\nlist : "+list);
		
		Cipher_MethodRef m1=new Cipher_MethodRef();
		System.out.print("\nMethod Reference : ");
		m1.methodReference(list);
		
		Cipher_Anonymous a1=new Cipher_Anonymous();
		System.out.print("\nAnonymous Class : ");
		a1.anonymousClass(list);
    }
}
