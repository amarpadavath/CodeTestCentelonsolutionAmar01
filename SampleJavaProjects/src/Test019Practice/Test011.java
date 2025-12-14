package Test019Practice;

public class Test011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] test= {{1,2,3},{8,9,6}};
		
		for(int row =0;row<test.length;row++)
		{
			for(int col=0;col<test[row].length;col++)
			{
				System.out.println("myNumbers[" + row + "][" + col + "] = " + test[row][col]);
			}
		}

	}

}
