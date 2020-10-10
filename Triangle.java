//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Caleb Eskes
//Date - 10/099/2020

import java.util.Scanner;
import java.lang.Math.*; 

public class Triangle
{
	private int sideA, sideB, sideC;

	public Triangle(int a, int b, int c)
	{
    sideA = a;
    sideB = b;
    sideC = c;
	}

	public int getPerimeter( )
	{
    int perimeter = sideA + sideB + sideC;
    int getPerimeter = perimeter;
    return getPerimeter;
	}

	public double getArea( )
	{
    double perimeter = getPerimeter( );
    double s = perimeter/2;
    double area = s * (s - sideA) * (s - sideB) * (s - sideC);
    double sq;
    sq = Math.sqrt(area);
    area = sq;
    double getArea = area;

		return getArea;
	}
}