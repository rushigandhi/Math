import java.util.Scanner;

public class Coordinates {

	public static void main(String[] args){
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Input the transformed function:");
	String function = in.nextLine();
	
	// y-coordinates
	
	System.out.println();
	System.out.println("Y-COORDINATES:");
	System.out.println();
	
	System.out.println("Multiply all y-values by a factor of " + function.substring(function.indexOf('=') + 1, function.indexOf('f')).trim() + ".");
	
	String c = function.substring(function.indexOf(']') + 1);
	
	for(int x = 0; x < c.length(); x++){
		
		if (c.charAt(x)=='-'){
			
			System.out.println("Subtract " + c.substring(c.indexOf('-') + 1).trim() + " from all y-values.");
			
		}
		else if (c.charAt(x)=='+'){
			
			System.out.println("Add " + c.substring(c.indexOf('+') + 1).trim() + " to all y-values.");
			
		}
		
		
	}

	// x-coordinates
	

		
		
	System.out.println();
	System.out.println("X-COORDINATES:");
	System.out.println();
	
	String k = function.substring(function.indexOf('[') + 1, function.lastIndexOf('(')).trim();
	if(k.equals("-")){
		
		k = "-1";
		
	}
	else if(k.equals("")){
		
		k = "1";
		
	}
	
	for (int i = 0; i < k.length(); i++){
		
		if (k.charAt(i)=='/'){
			
			double num = Double.parseDouble(k.substring(0, k.indexOf('/')));
			double den = Double.parseDouble(k.substring(k.indexOf('/')+1));
			double div = num/den;
			k = String.valueOf(div);
		}
		
	}
	double kVal = Double.parseDouble(k);
	kVal = 1/kVal;
	
	if (!(k.equals("1"))){
	System.out.println("Multiply all x-values by a factor of " + kVal + ".");	
	}
	
	String d = function.substring(function.lastIndexOf('x') + 1, function.lastIndexOf(')'));
	
	for(int x = 0; x < d.length(); x++){
		
		if (d.charAt(x)=='-'){
			
			System.out.println("Add " + d.substring(d.indexOf('-') + 1).trim() + " too all x-values.");
			
		}
		else if (d.charAt(x)=='+'){
			
			System.out.println("Subtract " + d.substring(d.indexOf('+') + 1).trim() + " from all x-values.");
			
		}
		
		
	}
		
		
		
	}
	
	
}
