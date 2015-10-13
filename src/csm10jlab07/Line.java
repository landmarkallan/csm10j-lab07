/*
********************************************************************************
* Student Name: Mark Land                             Moorpark College         *
* Program Name: Line.java                             CS M10J (Intro Java)     *
* Comment     : Custom 'Line' Class creation          Intro to Prog using Java *
*               Lab07, class file project half        Fall of 2015             *
*               Due on 10-13-15                       Prof. John C. Reynolds   *
********************************************************************************
*/

/*
Class Purpose:

This 'Line' Class' purpose is to provide a line equation fuctionality library ~
module for the 'scm10jlab07' package, for users' programs to import and use.
*/

// Packages~Libraries~Modules:

package csm10jlab07;

	// This 'Line' Class is from~within the package 'csm10jlab07'
	
// import java.util.Scanner;
// import java.util.Vector;

// Classes:

public class Line
{
	// 'Line' class' Members:
	
		// 'Line' class' instance variables:
	
	private double A, B, C, A_buffer, B_buffer, C_buffer, slope;
	
	// private double X_1, X_2, Y_1, Y_2
	
	private boolean is_line;
	
	// private double[] point_1_array, point_2_array;
	
	// private Vector<double> point_1_vector, point_2_vector;
	
	private String slope_type_name;
	
	// private String[] slope_type_name_array = new String{
	// 		"horizontal", "vertical (undefined)", "positive", "negative"};
	
	// private Vector<String> slope_type_name_vector = new Vector<String>{
	//		"horizontal", "vertical (undefined)", "positive", "negative"};
	
	// Methods:
	
		// 'Line' class' special 'Constructor' Methods:
	
			// default Constructor:
	
	public Line()
	{
		Set();
	}
	
			// Constructor with Parameters:
	public Line(double A)
	{
		Set(A);
	}
	
	public Line(double A, double B)
	{
		Set(A, B);
	}
	
	public Line(double A, double B, double C)
	{
		Set(A, B, C);
	}
	
		// 'Line' class' non-constructor (and for this lab, non-static:
		//		'Line' class' instance methods) Methods:
	
	public void Set_A(double A)
	{
		this.A_buffer = A;
	}
	
	public void Set_B(double B)
	{
		this.B_buffer = B;
	}
	
	public void Set_C(double C)
	{
		this.C_buffer = C;
	}
	
	public boolean Is_Line_Return(double A, double B, double C)
	{
		/*
		Credit: http://stackoverflow.com/questions/6959220/imaginary-numbers
		by (I believe~hope if I understand the site formatting correctly):
		Mohit Deshpande, as I used his code for help (if it works, I guess the
		' Double.isNaN ' checks the value of the square root of the input if
		it's an imaginary result or not) ~ I'm an idiot for not realizing to
		use the quadratic formula for checking if imaginary, in hindsight.
		*/
		
		// quadratic formula: sqrt(b^2-4ac)
		// Math.sqrt(Math.pow(B,2)-4*A*C)
		// discriminant: (b^2-4ac)
		double discriminant = (B*B)-(4*A*C);
		
		if ((A == 0.0 && B == 0.0)||(Double.isNaN(discriminant)))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public void Is_Line(double A, double B, double C)
	{
		/*
		Credit: http://stackoverflow.com/questions/6959220/imaginary-numbers
		by (I believe~hope if I understand the site formatting correctly):
		Mohit Deshpande, as I used his code for help (if it works, I guess the
		' Double.isNaN ' checks the value of the square root of the input if
		it's an imaginary result or not) ~ I'm an idiot for not realizing to
		use the quadratic formula for checking if imaginary, in hindsight.
		*/
		
		// quadratic formula: sqrt(b^2-4ac)
		// Math.sqrt(Math.pow(B,2)-4*A*C)
		// discriminant: (b^2-4ac)
		double discriminant = (B*B)-(4*A*C);
		
		if ((A == 0.0 && B == 0.0)||(Double.isNaN(discriminant)))
		{
			this.is_line = false;
		}
		else
		{
			this.is_line = true;
		}
	}
	
	public void If_Line()
	{
		if (this.is_line)
		{
			this.Set(A_buffer, B_buffer, C_buffer);
		}
	}
	
	public void Set()
	{
		this.A = 0.0;
		this.B = 0.0;
		this.C = 0.0;
	}
	
	public void Set(double A)
	{
		this.A = A;
	}
	
	public void Set(double A, double B)
	{
		this.A = A;
		this.B = B;
	}
	
	public void Set(double A, double B, double C)
	{
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public double Get_A()
	{
		return this.A;
	}
	
	public double Get_B()
	{
		return this.B;
	}
	
	public double Get_C()
	{
		return this.C;
	}
	
	public double Get(char letter)
	{
		if (letter == 'A')
		{
			return this.A;
		}
		else if (letter == 'B')
		{
			return this.B;
		}
		else if (letter == 'C')
		{
			return this.C;
		}
		else
		{
			return Double.NaN;
		}
	}
	
	public double Get_Buffer(char letter)
	{
		if (letter == 'A')
		{
			return this.A_buffer;
		}
		else if (letter == 'B')
		{
			return this.B_buffer;
		}
		else if (letter == 'C')
		{
			return this.C_buffer;
		}
		else
		{
			return Double.NaN;
		}
	}
	
	public double Get_Slope_Return()
	{
		if (this.B != 0.0)
		{
			return (-((this.A)/(this.B)));
		}
		else
		{
			this.slope_type_name = "vertical (undefined)";
			return Double.NaN;
			// this.slope_type_name = slope_type_name_array[1];
			// this.slope_type_name = slope_type_name_vector.elementAt(1);
		}
	}
	
	public double Get_Slope_Return(double slope)
	{
		if (this.B != 0.0)
		{
			return slope;
		}
		else
		{
			this.slope_type_name = "vertical (undefined)";
			return Double.NaN;
			// this.slope_type_name = slope_type_name_array[1];
			// this.slope_type_name = slope_type_name_vector.elementAt(1);
		}
	}
	
	public double Get_Slope_Return(double slope, double B)
	{
		if (B != 0.0)
		{
			return slope;
		}
		else
		{
			this.slope_type_name = "vertical (undefined)";
			return Double.NaN;
			// this.slope_type_name = slope_type_name_array[1];
			// this.slope_type_name = slope_type_name_vector.elementAt(1);
		}
	}
	
	public void Get_Slope()
	{
		if (this.B != 0.0)
		{
			this.slope = -this.A/this.B;
		}
		else
		{
			this.slope_type_name = "vertical (undefined)";
			this.slope = Double.NaN;
			// this.slope_type_name = slope_type_name_array[1];
			// this.slope_type_name = slope_type_name_vector.elementAt(1);
		}
	}
	
	public void Get_Slope(double slope)
	{
		if (this.B != 0.0)
		{
			this.slope = slope;
		}
		else
		{
			this.slope = Double.NaN;
			this.slope_type_name = "vertical (undefined)";
			// this.slope_type_name = slope_type_name_array[1];
			// this.slope_type_name = slope_type_name_vector.elementAt(1);
		}
	}
	
	public void Get_Slope(double slope, double B)
	{
		if (B != 0.0)
		{
			this.slope = slope;
		}
		else
		{
			this.slope = Double.NaN;
			this.slope_type_name = "vertical (undefined)";
			// this.slope_type_name = slope_type_name_array[1];
			// this.slope_type_name = slope_type_name_vector.elementAt(1);
		}
	}
	
	public boolean Is_Equals_To(Line other)
	{
		// credit to the resource by (?King? ~ whoever the prof is presumably):
		// https://www.math.washington.edu/~king/coursedir/m445w04/notes/
		// 		vector/equations.html, and a family member for helping me
		//		realize that it's not just any real constant, but (if exists)
		//		the real constant (a ratio) FROM A1/A2, B1/B2, or C1/C2, or
		//		A2/A1, B2/B1, or C2/C1, for the equals comparison check-test
		
		double ratio;
		
		// these 6 conditionals are needed for being able to check vertical
		//		'(A:1)*(X)=(C:-OO,OO)' and horizontal '(B:1)*(Y)=(C:-OO,OO)'
		//		lines for equality, as can be seen, there's not always an A or
		//		a B, and~or we can have A, B, and~or C be 0, thus we need to be
		//		able to check the ratios of As, Bs, and Cs, to account for every
		//		line equation
		
		if (other.A != 0)
		{
			ratio = ((this.A)/(other.A));
		
			return (((this.A==other.A)&&(this.B==other.B)&&(this.C==other.C))||
				(((ratio==((this.B)/(other.B)))&&
					(ratio==((this.C)/(other.C))))));
		}
		else if (other.B != 0)
		{
			ratio = ((this.B)/(other.B));
		
			return (((this.A==other.A)&&(this.B==other.B)&&(this.C==other.C))||
				(((ratio==((this.A)/(other.A)))&&
					(ratio==((this.C)/(other.C))))));
		}
		else if (other.C != 0)
		{
			ratio = ((this.C)/(other.C));
		
			return (((this.A==other.A)&&(this.B==other.B)&&(this.C==other.C))||
				(((ratio==((this.A)/(other.A)))&&
					(ratio==((this.B)/(other.B))))));
		}
		
		else if (this.A != 0)
		{
			ratio = ((other.A)/(this.A));
		
			return (((other.A==this.A)&&(other.B==this.B)&&(other.C==this.C))||
				(((ratio==((other.B)/(this.B)))&&
					(ratio==((other.C)/(this.C))))));
		}
		else if (this.B != 0)
		{
			ratio = ((other.B)/(this.B));
		
			return (((other.A==this.A)&&(other.B==this.B)&&(other.C==this.C))||
				(((ratio==((other.A)/(this.A)))&&
					(ratio==((other.C)/(this.C))))));
		}
		
		else if (this.C != 0)
		{
			ratio = ((other.C)/(this.C));
		
			return (((other.A==this.A)&&(other.B==this.B)&&(other.C==this.C))||
				(((ratio==((other.A)/(this.A)))&&
					(ratio==((other.B)/(this.B))))));
		}
		else
		{
			return false;
		}
	}
	
	public boolean Is_Parallel_To(Line other)
	{
		return ((this.slope == other.slope)||
			(Double.isNaN(this.slope)&&(Double.isNaN(this.slope))));
	}
	
	public boolean Is_Perpendicular_To(Line other)
	{
		return ((this.slope == other.slope)||
			((this.slope == 0.0)&&(Double.isNaN(other.slope)))||
			((other.slope == 0.0)&&(Double.isNaN(this.slope))));
	}
	
	public boolean Is_Vertical()
	{
		if ((Double.isNaN(this.slope))||(this.B == 0.0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean Is_Horizontal()
	{
		if (this.slope == 0.0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void If_Vertical()
	{
		if (this.Is_Vertical())
		{
			this.slope_type_name = "vertical (undefined)";
			// this.slope_type_name = slope_type_name_array[1];
			// this.slope_type_name = slope_type_name_vector.elementAt(1);
		}
	}
	
	public void If_Horizontal()
	{
		if (this.Is_Horizontal())
		{
			this.slope_type_name = "horizontal";
			// this.slope_type_name = slope_type_name_array[0];
			// this.slope_type_name = slope_type_name_vector.elementAt(0);
		}
	}
	
	public void Slope_Type_Name()
	{
		if (this.slope == 0.0)
		{
			this.slope_type_name = "horizontal";
			// this.slope_type_name = slope_type_name_array[0];
			// this.slope_type_name = slope_type_name_vector.elementAt(0);
		}
		else if (Double.isNaN(this.slope) || this.B == 0.0)
		{
			this.slope_type_name = "vertical (undefined)";
			// this.slope_type_name = slope_type_name_array[1];
			// this.slope_type_name = slope_type_name_vector.elementAt(1);
		}
		else if (this.slope > 0.0)
		{
			this.slope_type_name = "positive";
			// this.slope_type_name = slope_type_name_array[2];
			// this.slope_type_name = slope_type_name_vector.elementAt(2);
		}
		else if (this.slope < 0.0)
		{
			this.slope_type_name = "negative";
			// this.slope_type_name = slope_type_name_array[3];
			// this.slope_type_name = slope_type_name_vector.elementAt(3);
		}
	}
	
	public void Slope_Type_Name(double slope)
	{
		if (slope == 0.0)
		{
			this.slope_type_name = "horizontal";
			// this.slope_type_name = slope_type_name_array[0];
			// this.slope_type_name = slope_type_name_vector.elementAt(0);
		}
		else if (Double.isNaN(slope) || this.B == 0.0)
		{
			this.slope_type_name = "vertical (undefined)";
			// this.slope_type_name = slope_type_name_array[1];
			// this.slope_type_name = slope_type_name_vector.elementAt(1);
		}
		else if (slope > 0.0)
		{
			this.slope_type_name = "positive";
			// this.slope_type_name = slope_type_name_array[2];
			// this.slope_type_name = slope_type_name_vector.elementAt(2);
		}
		else if (slope < 0.0)
		{
			this.slope_type_name = "negative";
			// this.slope_type_name = slope_type_name_array[3];
			// this.slope_type_name = slope_type_name_vector.elementAt(3);
		}
	}
	
	public void Slope_Type_Name(double slope, double B)
	{
		if (slope == 0.0)
		{
			this.slope_type_name = "horizontal";
			// this.slope_type_name = slope_type_name_array[0];
			// this.slope_type_name = slope_type_name_vector.elementAt(0);
		}
		else if (Double.isNaN(slope) || B == 0.0)
		{
			this.slope_type_name = "vertical (undefined)";
			// this.slope_type_name = slope_type_name_array[1];
			// this.slope_type_name = slope_type_name_vector.elementAt(1);
		}
		else if (slope > 0.0)
		{
			this.slope_type_name = "positive";
			// this.slope_type_name = slope_type_name_array[2];
			// this.slope_type_name = slope_type_name_vector.elementAt(2);
		}
		else if (slope < 0.0)
		{
			this.slope_type_name = "negative";
			// this.slope_type_name = slope_type_name_array[3];
			// this.slope_type_name = slope_type_name_vector.elementAt(3);
		}
	}
	
	public String Get_Slope_Type_Name()
	{
		return this.slope_type_name;
	}
	
		// 'Line' Class' apecial 'finalizer' Method (garbage collection of
		//		class objects gone out of scope):
	
	// public void finalize();
}
