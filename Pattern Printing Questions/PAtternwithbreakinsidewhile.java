package Break_Continue;

public class PAtternwithbreakinsidewhile {

	public static void main(String[] args) {
		int n = 4;
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print(j + " ");
				j++;
				if (j > i) {
					break; //only inner while loop break hogi , traingle pattern print krne k lie 
				}
			}
			System.out.println();
			i++;
		}

	}

}
