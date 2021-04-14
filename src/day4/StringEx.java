package day4;

public class StringEx {
	public void stringEx1() {
		String s1 = "Hello";
        String s2 = new String(s1);

        System.out.println(s1 + " equals " + s2 + " -> " +  
                      s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
	}
	public void stringEx2() {
		String s1 = new String("Hello");
		String s2 = s1;
        
        System.out.println(s1 + " equals " + s2 + " -> " +  
                      s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
	}
	public static void main(String[] args) {
		 StringEx ex=new StringEx();
		 ex.stringEx1();
		 ex.stringEx2();
	}

}
