package com.string;

public class ImpStringQuestions {

	public static void main(String[] args) {
	
		//1
				System.out.println(" 1");
		    String str1 = "Hello";
			String str2 = "HELLO";
			System.out.println((str1.equals(str2)));
			System.out.println((str1 == str2));
			//false false reasone case sensetive aahe tyamule
			
			//2
			System.out.println("\n 2");
			String s1="ram";
			String s2="sita";
			System.out.println(s1.equals(s2));
			System.out.println(s1==s2);
			//false false reasone contain same nahiye tyamule

			//3.
			System.out.println("\n 3");
			String p="ravna";
			String q="sita";
			p=q;
			System.out.println(p==q);
			System.out.println(p.equals(q));
			//true true contain same hoto na
			
			//4
			System.out.println("\n 4");
			String i="ravna";
			String u="SITA";
			i=u;
			System.out.println(i==u);
			System.out.println(i.equals(u));
			//true true contain same hota na
			
			//5
			System.out.println("\n 5");
			String x="sita";
			String y ="sita";
			System.out.println(x==y);
		    System.out.println(x.equals(y));
			//true true 
		    
		    //5.
		    System.out.println("\n 5");
		    String h="karna";
		    String c= new String("karna");
		    System.out.println(h==c);
			System.out.println(h.equals(c));
			// false and true
			
			//6
			System.out.println("\n 6");
			String f="KARNA";
			String g= new String("karna");
			System.out.println(f==g);
		    System.out.println(f.equals(g));
			//false and false
			
					
			//7
			System.out.println("\n 7");
			String i1="arjun";
			String j =new String ("dropadi");
			i1=j;
			System.out.println(i1==j);
			System.out.println(i1.equals(j));
		    //true and true
			
			//8.
			System.out.println("\n 8");
			String w=new String("hanuman");
			String r=new String("mira");
			System.out.println(w==y);
			System.out.println(w.equals(r));
			//false and false
			
			//9
			System.out.println("\n 9");
			String t= new String("student");
			String e = new String("student");
			System.out.println(t==e);
			System.out.println(t.equals(e));
			// flase and true

	}

}
