import java.util.*;
import java.lang.Math;

class Dados{
	String string;

	public Dados(String s){
		this.string = s;
	}

	//Exercicios: 1, 2.
	public void verifyString(String s){
		if(s.length()<8)
			System.out.println("String com menos de 8 caracteres!!");
		else if(s.charAt(0)!='A');
			System.out.println("String nao começa com 'A' ");
	} 

	//Exercicios: 3.
	public void firstFourChars(String s){
		System.out.println(""+s.substring(0,4));
	}

	//Exercicios: 4.
	public void verifyStringNumber(String s){
		for(int i=0; i < s.length(); i++)
		{
			if(	  s.charAt(i) == '0' ||s.charAt(i) == '1'
				||s.charAt(i) == '2' ||s.charAt(i) == '3' 
				||s.charAt(i) == '4' ||s.charAt(i) == '5' 
				||s.charAt(i) == '6' ||s.charAt(i) == '7' 
				||s.charAt(i) == '8' ||s.charAt(i) == '9')
			{
				System.out.println("String contem Numeros!!");
				break;
			}
		}	
	}

	//Exercicio: 5
	public void verifyNumberMax(){
		double x = Math.random()*100;
		double y = Math.random()*100;
		System.out.println("Maior numero: "+Math.max(x,y));

	}

	//Exercicio: 6
	public void verifyToYear(){
		Calendar data2 = Calendar.getInstance();
		data2.set(Calendar.DAY_OF_MONTH,0);
		data2.set(Calendar.MONTH,0);
		data2.set(Calendar.YEAR,2020);
		data2.set(Calendar.HOUR_OF_DAY,24);
		data2.set(Calendar.MINUTE,60);
		data2.set(Calendar.SECOND,60);

		Calendar data = Calendar.getInstance();
		System.out.println("Para 2020, Faltam");
		System.out.println(data2.get(Calendar.YEAR)-data.get(Calendar.YEAR)+"Anos");
		System.out.println(data2.get(Calendar.MONTH)-data.get(Calendar.MONTH)+"Meses");
		System.out.println(data2.get(Calendar.DAY_OF_MONTH)-data.get(Calendar.DAY_OF_MONTH)+"Dias");
		System.out.println(data2.get(Calendar.HOUR_OF_DAY)-data.get(Calendar.HOUR_OF_DAY)+"Horas");
		System.out.println(data2.get(Calendar.MINUTE)-data.get(Calendar.MINUTE)+"Minutos");
		System.out.println(data2.get(Calendar.SECOND)-data.get(Calendar.SECOND)+"Segundos");	
	}

	//Exercicio: 7
	//public verifyDateBigest(Calendar date1, Calendar date2){
	//	if()
	//}
}