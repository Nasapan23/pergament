package principal;
import java.util.Scanner;

public class Master {
	static Scanner input= new Scanner(System.in);
	public static void pergament() {
		int Length=input.nextInt();
		int Width=input.nextInt();
		int LenStr=input.nextInt();
		int[][] Fpergament;
		Fpergament= new int[Length][Width];
		HorizontalStreet(Length,Width);
}	
	public static void HorizontalStreet(int Length,int Width,int[][] FPergament) {
				//Generation Variables for n-1 streets
				
				int A=input.nextInt();
				int B=input.nextInt();
				int C=input.nextInt();
				int D=input.nextInt();
				
		        //Data for Streets
		
				int StreetPos[]=new int[Width];
				int StreetLength[]=new int[Width];
				
				//First street
				
				StreetPos[1]=input.nextInt();
				StreetLength[1]=input.nextInt();
				
				//StreetsMath
				
				for(int i=2;i<Length;i++) {
					StreetPos[i]=1+(StreetPos[i-1]*A+B)%Width;
					StreetLength[i]=1+(StreetLength[i-1]*C+D)%(Width - StreetPos[i]+1);
				}
				//Add to pergament

				for(int i=1;i<=Length;i++) {
					for(int j=1;j<=Width;j++) {
						int cnt=0;
					   if((j>=StreetPos[i])&&(cnt<StreetLength[i])) {
						   FPergament[i][j]=FPergament[i][j]+1;
					   }
			 }
		}
	}

	public static void VerticalStreets(int[][] Fpergament,int Length,int Width[]) {

		int VertLine=input.nextInt();
		for(int q=1;q<=VertLine;q++) {
			int VColumn=input.nextInt();
			int VRow=input.nextInt();
			int VLength=input.nextInt();
			for(int i=VRow;i<=VLength;i++) {
				Fpergament[i][VColumn]=Fpergament[i][VColumn];
			}
		}
	}
	public static void main(String args[]) {
		int colisions;
		}
}

