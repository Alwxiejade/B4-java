
public class Initiate {

	public static void main(String[] args) {
		
		int count = 0;
		int remain = 0;
		// while loops never may run
		while (count < 25){
			remain = count % 2;
			//count++;
			System.out.println("count = " + count + ", remainder = " + remain);
			count++;
			//count -= 2;
			//count /= 3;
			//count *= 2;
			//count+= 2;
			// count = count + 1;
			
		}
	// do loops always run at least one at a time
		int num = 0;
		do {
			System.out.println("num = " + num);
			num++;
			
		}while (num < 12);

	}

}
