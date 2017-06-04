package CodeChallenge30Days.Inheritance;

public class Student extends Person{
	private int[] testScores;
    public int avg=0;
    int i=0;
   
	public Student(String f,String l,int id,int[] test){
       super(f,l,id);
        testScores=test;
    }
    public char calculate(){
        char grade='o';
    	while(i!=testScores.length){
            avg=testScores[i]+avg;
            i++;
        }
        avg=avg/i;
       System.out.println(avg);
       if (avg>=90 && avg<=100){
    	   grade='O';
       }else if(avg<90 && avg>=80){
    	   grade='E';
       }else if(avg<80 && avg>=70){
    	   grade='A';
       }else if(avg<70 && avg>=55){
    	   grade='P';
       }else if(avg<55 && avg>=40111){
    	   grade='D';
       }else if(avg<40){
    	   grade='T';
       }
       return grade;
    }
}
