import java.util.Arrays;
    import java.util.Scanner;
     
class Solution {
    	static char a[] = new char[26];
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		String str = sc.nextLine();
    		int n2=0;
    		for(int j=0; j<str.length(); j++){
    			char ic = str.charAt(j);
    			if(ic>=97 && ic<=122 && a[ic-97]==0)
    				a[ic-97] = ic;
    			else
    				n2++;
    		}
    		if(n2==0){
    		int N = sc.nextInt();
    		for(int i=0; i<N; i++){
    			String s2 = sc.next();
    			if(check(s2)==true)
    				System.out.println("Yes");
    			else
    				System.out.println("No");
    		}
    		}
    	}
    	public static boolean check(String s2){
    		int n1=0;
    		for(int k=0; k<s2.length(); k++){
    			char c = s2.charAt(k);
    			if(a[c-97]!=0){
    				n1++;
    			}
    			else
    				break;
    		}
    		if(n1==s2.length())
    			return true;
    		else
    			return false;
    		
    	}
    }  
