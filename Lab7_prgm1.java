package Myjava;

 
public class Lab7_prgm1 {
	public static void main (String[] args){
System.out.println (mystery (2,6));
	}
public static int mystery(int x,int y)
{
	while (x !=0 && y !=0) {
		if(x < y) {
		y -=x ;
	} else {
		
		x -= y;
	}
	}
   return x+y;
}
}

//my output was: 3 , 1 , 2 
