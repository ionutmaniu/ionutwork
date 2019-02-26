package ionutwork;
public class TestBA7 {
	  public static int find(int[] sir, int n) {
for(int i = 0; i< sir.length; i++) {
	if (sir[i]==n) {
		return i;
	}
}
return -1;
		  
	  }
	  public static void main(String[] args) {
		System.out.println(find(new int[] {1, 2, 3, 4}, 4));
		System.out.println(find(new int[] {4, 7, 8, 3}, 4));
	}
	}

