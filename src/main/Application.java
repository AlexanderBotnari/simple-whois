package main;

import java.util.Random;

import box.BigBox;
import box.Box;
import box.SmallBox;

public class Application {

	public static void main(String[] args) {
		
		SmallBox small = new SmallBox();
		BigBox big = new BigBox();
		
		System.out.println(testBox(small));
        System.out.println(testBox(big));
	}
	
	public static Boolean testBox(Box box) {
		if(box.getClass().equals(SmallBox.class)){
	           SmallBox small = (SmallBox)box;
	           Integer value = new Random().nextInt();
	           small.setValue(value);
	           return small.getValue().equals(value);
	       }
	       else{
	           BigBox big = (BigBox)box;
	           Integer valueOne = new Random().nextInt();
	           Integer valueTwo = new Random().nextInt();
	           big.setValueOne(valueOne);
	           big.setValueTwo(valueTwo);

	           return big.getValueOne().equals(valueOne) && big.getValueTwo().equals(valueTwo);
	       }
	}

}
