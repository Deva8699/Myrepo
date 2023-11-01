package loopingPractice;

public class Day2 {

	public static void main(String[] args) {
		
		Day2 dd = new Day2();
		//dd.Task1();           
		//dd.Task2();
		//dd.Task3();
		//dd.Task4();
		//dd.Task5();
		//dd.Task6();
		//dd.Task7();
		//dd.Task8();
		//dd.Task9();
		//dd.Task10();
		//dd.Task11();
		//dd.Task12();
		//dd.Task13();
		dd.Task14();
		

	}
	private void Task14() {
		int no=1;           // rough
		while(no<=5) {
			System.out.print(no+3 +" ");
			no++;
		}
	}
	private void Task13() {
		int no=1;         // 1 3 9 27 81  243
		while(no<=245) {
			System.out.print(no+" ");
			no=no*3;
		}
	}
	private void Task12() {
		int no=1;
		while(no<=64){    // 1 2 4 8 16 32 64 
			System.out.print(no+" ");
			no=no*2;
		}
		
	}
	
	private void Task11() {
		int no=3;           // 3 6 9 12 15 
		while(no<=15){     
			System.out.print(no+" "); 
			no=no+3;
			
		}
	}
	private void Task10() {
		int no =1;
		while(no<=5){
			System.out.print(no*2+" ");   // 2 4 6 8 10 another method type
			no++;
		}
		
	}
	private void Task9() {
		int no=10;
		while(no>=2){                // 10 8 6 4 2
			System.out.print(no+" ");
			no=no-2;
		}
	}

	private void Task8() {
		int no=2;
		while(no<=10){      // 2 4 6 8 10
			System.out.print(no+" ");
			no=no+2;
		}
		
		
	}

	private void Task7() {
		int no=9;               // 9 7 5 3 1 
	   while	(no>=1){
			System.out.print(no+" ");
			no=no-2;
		}
		
	}

	private void Task6() {
		int no=1;
		while(no<=9){     // 1 3 5 7 9 
			System.out.print(no+" ");   
			no=no+2;
		}
		
	}

	private void Task5() {
		int  no=50; 
		while(no>=40){    // 50 49 48 47 46 45 44 43 42 41 40
			System.out.print(no+" ");  
			no--;
		}
		
	}

	private void Task4() {    
		int no=5;  
		while(no>=1){             // 5 4 3 2 1
			System.out.println(no+" ");
			no--;
		}
		
		
	}

	private void Task3() {
		int no=10;
			while(no<=15) {
				System.out.print(no+" ");     // 10 11 12 13 14 15
				no++;
			}
		
		
	}

	private void Task2() {
		int no=1;                         
			while(no<=5) {                 // 1 2 3 4 5
				System.out.print(no+" ");
				no++;
			}
		
		
	}

	private void Task1() {
		int count=0;                // 1 1 1 1 1 
		while(count<=5) {
			System.out.print(1+" ");
			count = count+1;
		}
		
	}

}
