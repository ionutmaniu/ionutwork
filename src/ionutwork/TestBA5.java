package ionutwork;

public class TestBA5 {
    public static int product(int[] sir) {
if (sir.length==0) {
	return 1;
}
int produs = 1;
for (int element : sir) {
	if (element != 0) {
		produs *= element;
	}
}
return produs;
    }
    public static void main(String[] args) {
		System.out.println(product (new int[] {2, 5, 6, 8}));
		System.out.println(product (new int[] {0, 0, 0, 0}));
	}
}

