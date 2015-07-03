/*
#
#@authors: Jens, Pål-E and Uy!
#
*/
import java.util.*;//import scanner.

public class GraphCalc
{
	public static void main(String[] args)
	{
		int [][] list = new int[][]
		{
				{0, 8, 10, 13, 0, 0, 0},
				{8, 0, 0, 30, 0, 0, 0},
				{10, 0, 0, 20, 0, 12, 0},
				{13, 30, 20, 0, 25, 0, 11},
				{0, 0, 0, 25, 0, 5, 9},
				{0, 0, 12, 0, 5, 0, 7},
				{0, 0, 0, 11, 9, 7, 0}
		};//end list

		int [][] visited = new int[7][3];
		int [] listCheck = {-1,-1,-1,-1,-1,-1,-1};
		int tot = 0;//Totale sum.
		int ListTot = 0;//total rounds of runs.
		int from = 0;//House from
		int to = 0;//House to
		int row = 0;
		int temp = 99;//Temp. value hodler
		String [] chartab = {"A","B","C","D","E","F","G"};//House list.

		Scanner input = new Scanner (System.in);
		System.out.println("Input starting point 0->6");
		int start = input.nextInt();

		listCheck[0] = start;//Starting  point.

		while( ListTot != 6)
		{
			for(int i = 0 ; i <= ListTot ; i++ )
			{
				row = listCheck[i];
				for(int k = 0 ; k < listCheck.length ; k++)
				{
					if (!exist(listCheck, k, ListTot))
					{
						if (list[ row ][k] > 0 && list[ row ][k] < temp )
						{
							temp = list[ row ][k];
							from = row;
							to = k;
						}//end if
					}//end if
				}//end for k loop
			}//end for i loop
				//sets the corect value into visited list.
				visited[ListTot][0] = from;
				visited[ListTot][1] = to;
				visited[ListTot][2] = temp;

				ListTot++;
				listCheck[ListTot] = to;

				//previous tot+ temp value.
				tot = tot + temp;

				//reset
				list[from][to] = 0;
				list[to][from] = 0;
				from = 0;
				to = 0;
				temp = 99;
			}
			//Keep: printing the total sum width *1000, and the house numbers as letters a->f
			System.out.println("The total sum of all houses is " + tot*1000);
			System.out.println("From---->To=======Sum");
			for(int pl = 0 ; pl < 6 ; pl++)
			{
				System.out.println(chartab[visited [pl][0]] + " ------> " +
						chartab[visited[pl][1]]+ " = sum = " + visited[pl][2]);
			}
		}//end main

	public static boolean exist(int[] existList, int a, int counter)
	{
		for (int y = 0 ; y <= counter ; y++)
		{
			if (existList[y] == a)
			{
				return true;
			}
		}
		return false;
	}
}//end class