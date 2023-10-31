package controlStatements;

public class Day1 {

	public static void main(String[] args) {
		
		
		Day1 DD = new Day1();
	//DD.match();
	DD.match1();
	
		
		}

	

	private void match1() {      //Nested if
		int IND =400;
		int AUS=380;
		int SA=400;
		int NZ=300;
		
		if(IND>AUS&&SA>NZ) {
			if(IND>SA) {
			System.out.println("India Win");
			
		}
			else if(SA>IND) {
				System.out.println("SA Win");
			}
			else {
				System.out.println("Match Draw");
			}
		}
		
		
	}



	private void match() {
		int sa = 450;     //int sa=300;    int sa=500;
		
                          //int aus=500;  int aus=500;
         int aus = 400;
     {
       if(sa>aus) {
    System.out.println("SA win");
    }
   else if(aus>sa) {
   System.out.println("Aus Win");
   }
   else
  {
   System.out.println("Match Die");
  }
		
	 }

  }
   }

