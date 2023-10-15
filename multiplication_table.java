// MULTIPLICATION TABLE
public class multiplication_table {
	public static void main(String[] args) {
		
		int table = 10;
		int max = 10;
		int n,i;
		
		for(n=1;n<=table;n++){
		    for(i=1;i<=max;i++){
		        System.out.println(n +" x "+ i +" = "+ n*i);
		        } 
		        System.out.println("=========");
		    }
		
	}
}