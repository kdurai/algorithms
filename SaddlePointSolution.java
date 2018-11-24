package algorithms

public class SaddlePointSolution {

	public int solution(int[][] A)
	{
		int saddle = 0;
		
		for(int i = 1; i < A.length-1;i++)
		{
			for(int j = 1; j < A[i].length-1; j++)
			{
				if(A[i][j] < A[i][j-1] && A[i][j] < A[i][j+1])
				{
					if(A[i][j] > A[i-1][j] && A[i][j] > A[i+1][j])
					{
						++saddle;
					}
				}
				else
				{
					if(A[i][j] > A[i][j-1] && A[i][j] > A[i][j+1])
					{
						if(A[i][j] < A[i-1][j] && A[i][j] < A[i+1][j])
						{
							++saddle;
						}
					}
				}
					
			}
		}
		return saddle;
	}
	public static void main(String[] args) {

		int[][] A = {
				{0,1,9,3},
				{7,5,8,3},
				{9,2,9,4},
				{4,6,7,1}
		};

		SaddlePointSolution soln = new SaddlePointSolution();
		System.out.println(soln.solution(A));
	
	}

}
