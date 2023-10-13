public class Trainer3
{
	public static void main(String args[])
	{
	
	Trainer3 trainerKumar= new Trainer3();
	
	float result=trainerKumar.add();
	trainerKumar.divide(result);	
	trainerKumar.divide(result,5);
	trainerKumar.divide("Deva");
	
	}
	
	public void divide(float re,int a){
		System.out.println(re/a);
		}
	
	public void divide(float re){
		System.out.println(re/10);
		
	}
	
	public void divide(String h){
		System.out.println(h);
	}
	
	public float add(){
		return 200+50.5f;
	}
		
	
}
