import java.util.Random;

public class Random1 {
public static void main(String[] args) {
	Random random = new Random();
	double d = random.nextDouble();
	System.out.println("======="+d);
	for(int i = 0;i<10;i++) {
		d= d*10;
	}
	System.out.println("---------"+(int)d);
	for(int i=0;i<100;i++) {
		int mun = random.nextInt(1000)%100;
		if(mun<0) {
			System.err.println("num:"+mun);
		}else {
			System.out.println("num:"+mun);
		}

	}

}
}
