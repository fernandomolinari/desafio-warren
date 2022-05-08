import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class teste03 {

	public static void main(String[] args) {

		int[] numbers = { 2, 3, 4, 55 };
		int meta = 10;
		ArrayList<Integer> otherNumbers = new ArrayList();

		for (int num : numbers) {
			if (num < meta) {
				otherNumbers.add(num);
			}
		}
		int greatestNumber = Collections.max(otherNumbers);
		ArrayList<Integer> list = new ArrayList();
		int counter = meta / greatestNumber;
		System.out.println(counter);

		for (int i = 0; i < counter; i++) {
			list.add(greatestNumber);
		}
		if (counter * greatestNumber != meta) {
			int diference = meta - (greatestNumber * counter);
			for (int num : otherNumbers) {
				if (num == diference) {
					list.add(diference);
				} // else {
					// counter = (diference + greatestNumber) / num;
					// System.out.println(num);
					// if (num != 1 && ((diference + greatestNumber) % num == 0)) {
					// list.remove(0);
					// for (int i = 0; i < counter; i++) {
					// list.add(num);
					// }
			}
		}
		System.out.println(list);
	}
}
