package com.klindziuk.task01.six;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	public static void main(String[] args){
		new TaskSixArgsChecker().fullArgsCheck(args);
		int[] numbers = ArrayUtils.convertArrayOfStringsToInt(args);
		PrintHelper.print("Array", numbers);
		PrintHelper.print("Sum of min and max element", new Calculator().calculateMinAndMaxSum(numbers));
	}
}