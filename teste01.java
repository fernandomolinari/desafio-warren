public class teste01 {

	public static Integer reverse(int n) {
		int resultado = 0;
		while (n > 0) {
			resultado = 10 * resultado + n % 10;
			n /= 10;
		}
		return resultado;
	}

	public static void main(String[] args) {
		for (Integer i = 0; i < 1000000; i++) {
			boolean x = ((reverse(i).toString().length()) < i.toString().length());
			if ((i + reverse(i)) % 2 != 0 && (i + reverse(i)) < 1000000) {
				if (x == false) {
					System.out.println(reverse(i));
				}
			}
		}
	}
}
