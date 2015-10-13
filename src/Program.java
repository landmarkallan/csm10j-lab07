/*
********************************************************************************
* Student Name: Mark Land                             Moorpark College         *
* Program Name: Hw01b.java                            CS M10J (Intro Java)     *
* Comment     : Files, Loops, Method Calls Program    Intro to Prog using Java *
*               homework 01b, stock tickers ver2      Fall of 2015             *
*               Due on 10-6-15                        Prof. John C. Reynolds   *
********************************************************************************
*/

/*
Program Purpose:

xxx
*/

// Packages~Libraries~Modules:

import csm10jlab07.Line;

public class Program
{
	public static void main(String[] args)
	{
		// test cases
		
		// default constructor
		Line Line_1 = new Line();
		
		// test default constructor
		System.out.println();
		System.out.println("test default constructor");
		System.out.println();
		
		System.out.println("A == 0.0 ? " + (Line_1.Get_A()));
		System.out.println("B == 0.0 ? " + (Line_1.Get_B()));
		System.out.println("C == 0.0 ? " + (Line_1.Get_C()));
		System.out.println();
		
		// test the get / set methods
		System.out.println("Test Get / Set");
		System.out.println();
		
		Line_1.Set_A(-1.0);
		System.out.println("A == -1.0 ? " + (Line_1.Get_Buffer('A')));
		Line_1.Set_B(1.0);
		System.out.println("B == 1.0 ? " + (Line_1.Get_Buffer('B')));
		Line_1.Set_C(1.0);
		System.out.println("C == 1.0 ? " + (Line_1.Get_Buffer('C')));
		System.out.println();
		
		// special constructor
		Line Line_2 = new Line(-2.0,1.0,2.0);
		System.out.println("Test special constructor");
		System.out.println();
		
		System.out.println("A == -2.0 ? " + (Line_2.Get_A()==-2.0));
		System.out.println("B == 1.0 ? " + (Line_2.Get_B()==1.0));
		System.out.println("C == 2.0 ? " + (Line_2.Get_C()==2.0));
		System.out.println();
		
		// other lines (horizontal, parallel, perpendicular) for the tests
		Line Line_3 = new Line(3.0,0.0,3.0);
		Line Line_4 = new Line(0.0,1.0,2.0);
		Line Line_5 = new Line(0.0,4.0,2.0);
		Line Line_6 = new Line(-2.0,2.0,2.0);
		
		// Setting 'Line_1' 's ABC values for testing it shortly:
		Line_1.Set(Line_1.Get_Buffer('A'),Line_1.Get_Buffer('B'),
			Line_1.Get_Buffer('C'));
		
		// slope defined
		System.out.println("Test slope defined");
		System.out.println();
		
		System.out.println("Slope defined ? " + Line_1.Get_Slope_Return());
		Line_1.Get_Slope();
		Line_1.Slope_Type_Name();
		System.out.println(Line_1.Get_Slope_Type_Name());
		System.out.println();

		System.out.println("Slope defined ? " + Line_2.Get_Slope_Return());
		Line_2.Get_Slope();
		Line_2.Slope_Type_Name();
		System.out.println(Line_2.Get_Slope_Type_Name());
		System.out.println();
		
		System.out.println("Slope defined ? " + Line_3.Get_Slope_Return());
		Line_3.Get_Slope();
		Line_3.Slope_Type_Name();
		System.out.println(Line_3.Get_Slope_Type_Name());
		System.out.println();
		
		System.out.println("Slope defined ? " + Line_4.Get_Slope_Return());
		Line_4.Get_Slope();
		Line_4.Slope_Type_Name();
		System.out.println(Line_4.Get_Slope_Type_Name());
		System.out.println();
		
		System.out.println("Slope defined ? " + Line_5.Get_Slope_Return());
		Line_5.Get_Slope();
		Line_5.Slope_Type_Name();
		System.out.println(Line_5.Get_Slope_Type_Name());
		System.out.println();
		
		System.out.println("Slope defined ? " + Line_6.Get_Slope_Return());
		Line_6.Get_Slope();
		Line_6.Slope_Type_Name();
		System.out.println(Line_6.Get_Slope_Type_Name());
		System.out.println();
		
		// slope undefined
		System.out.println("Test slope undefined");
		System.out.println();
		
		System.out.println("Slope NaN ? " + Line_3.Get_Slope_Return());
		System.out.println(Line_3.Get_Slope_Type_Name());
		System.out.println();
		
		// slope horizontal?
		System.out.println("Test slope horizontal");
		System.out.println();
		
		Line_1.Get_Slope();
		Line_1.If_Horizontal();
		System.out.println("Slope Horizontal ? " + Line_1.Is_Horizontal());
		Line_1.Slope_Type_Name();
		System.out.println("Slope Horizontal ? " + Line_1.Get_Slope_Type_Name());
		System.out.println();
		
		Line_2.Get_Slope();
		Line_2.If_Horizontal();
		System.out.println("Slope Horizontal ? " + Line_2.Is_Horizontal());
		Line_2.Slope_Type_Name();
		System.out.println("Slope Horizontal ? " + Line_2.Get_Slope_Type_Name());
		System.out.println();
		
		Line_3.Get_Slope();
		Line_3.If_Horizontal();
		System.out.println("Slope Horizontal ? " + Line_3.Is_Horizontal());
		Line_3.Slope_Type_Name();
		System.out.println("Slope Horizontal ? " + Line_3.Get_Slope_Type_Name());
		System.out.println();
		
		Line_4.Get_Slope();
		Line_4.If_Horizontal();
		System.out.println("Slope Horizontal ? " + Line_4.Is_Horizontal());
		Line_4.Slope_Type_Name();
		System.out.println("Slope Horizontal ? " + Line_4.Get_Slope_Type_Name());
		System.out.println();
		
		Line_5.Get_Slope();
		Line_5.If_Horizontal();
		System.out.println("Slope Horizontal ? " + Line_5.Is_Horizontal());
		Line_5.Slope_Type_Name();
		System.out.println("Slope Horizontal ? " + Line_5.Get_Slope_Type_Name());
		System.out.println();
		
		Line_6.Get_Slope();
		Line_6.If_Horizontal();
		System.out.println("Slope Horizontal ? " + Line_6.Is_Horizontal());
		Line_6.Slope_Type_Name();
		System.out.println("Slope Horizontal ? " + Line_6.Get_Slope_Type_Name());
		System.out.println();
		
		// slope vertical?
		System.out.println("Test slope Vertical");
		System.out.println();
		
		Line_1.Get_Slope();
		Line_1.If_Vertical();
		System.out.println("Slope Vertical ? " + Line_1.Is_Vertical());
		Line_1.Slope_Type_Name();
		System.out.println("Slope Vertical ? " + Line_1.Get_Slope_Type_Name());
		System.out.println();
		
		Line_2.Get_Slope();
		Line_2.If_Vertical();
		System.out.println("Slope Vertical ? " + Line_2.Is_Vertical());
		Line_2.Slope_Type_Name();
		System.out.println("Slope Vertical ? " + Line_2.Get_Slope_Type_Name());
		System.out.println();
		
		Line_3.Get_Slope();
		Line_3.If_Vertical();
		System.out.println("Slope Vertical ? " + Line_3.Is_Vertical());
		Line_3.Slope_Type_Name();
		System.out.println("Slope Vertical ? " + Line_3.Get_Slope_Type_Name());
		System.out.println();
		
		Line_4.Get_Slope();
		Line_4.If_Vertical();
		System.out.println("Slope Vertical ? " + Line_4.Is_Vertical());
		Line_4.Slope_Type_Name();
		System.out.println("Slope Vertical ? " + Line_4.Get_Slope_Type_Name());
		System.out.println();
		
		Line_5.Get_Slope();
		Line_5.If_Vertical();
		System.out.println("Slope Vertical ? " + Line_5.Is_Vertical());
		Line_5.Slope_Type_Name();
		System.out.println("Slope Vertical ? " + Line_5.Get_Slope_Type_Name());
		System.out.println();
		
		Line_6.Get_Slope();
		Line_6.If_Vertical();
		System.out.println("Slope Vertical ? " + Line_6.Is_Vertical());
		Line_6.Slope_Type_Name();
		System.out.println("Slope Vertical ? " + Line_6.Get_Slope_Type_Name());
		System.out.println();
		
		// test slope type
		System.out.println("Test slope type");
		System.out.println();
		
		Line_1.Get_Slope();
		Line_1.Slope_Type_Name();
		System.out.println("Slope type ? " + Line_1.Get_Slope_Type_Name());
		System.out.println();
		
		Line_2.Get_Slope();
		Line_2.Slope_Type_Name();
		System.out.println("Slope type ? " + Line_2.Get_Slope_Type_Name());
		System.out.println();
		
		Line_3.Get_Slope();
		Line_3.Slope_Type_Name();
		System.out.println("Slope type ? " + Line_3.Get_Slope_Type_Name());
		System.out.println();
		
		Line_4.Get_Slope();
		Line_4.Slope_Type_Name();
		System.out.println("Slope type ? " + Line_4.Get_Slope_Type_Name());
		System.out.println();
		
		Line_5.Get_Slope();
		Line_5.Slope_Type_Name();
		System.out.println("Slope type ? " + Line_5.Get_Slope_Type_Name());
		System.out.println();
		
		Line_6.Get_Slope();
		Line_6.Slope_Type_Name();
		System.out.println("Slope type ? " + Line_6.Get_Slope_Type_Name());
		System.out.println();
		
		// test parallel
		System.out.println("Test parallel");
		System.out.println();
		
		System.out.println("Are parallel ? " + Line_1.Is_Parallel_To(Line_2));
		System.out.println("Are parallel ? " + Line_1.Is_Parallel_To(Line_3));
		System.out.println("Are parallel ? " + Line_2.Is_Parallel_To(Line_3));
		System.out.println("Are parallel ? " + Line_4.Is_Parallel_To(Line_5));
		System.out.println();
		
		// test perpendicular
		System.out.println("Test perpendicular");
		System.out.println();
		
		System.out.println("Are perpendicular ? " + Line_1.Is_Perpendicular_To(Line_2));
		System.out.println("Are perpendicular ? " + Line_1.Is_Perpendicular_To(Line_3));
		System.out.println("Are perpendicular ? " + Line_2.Is_Perpendicular_To(Line_3));
		System.out.println("Are perpendicular ? " + Line_3.Is_Perpendicular_To(Line_4));
		System.out.println();
		
		// test equality
		System.out.println("Test equality");
		System.out.println();
		
		System.out.println("Are equal ? " + Line_1.Is_Equals_To(Line_2));
		System.out.println("Are equal ? " + Line_1.Is_Equals_To(Line_3));
		System.out.println("Are equal ? " + Line_2.Is_Equals_To(Line_3));
		System.out.println("Are equal ? " + Line_1.Is_Equals_To(Line_6));
		System.out.println();
	}
}
