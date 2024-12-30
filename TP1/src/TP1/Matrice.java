package TP1; 

import java.awt.Point;

public class Matrice {
	public static void main(String[] args) {
		 Point[][] matrice= {
		            { new Point(7, 9), new Point(1, 5) },  
		            { new Point(6, 8), new Point(2, 4), new Point(6, 3) }  
		        };
		// Creation des objet
		Point p1=new Point(1,5);
		Point p2=new Point(3,6);
		Point p3=new Point(9,2);
		Point p4=new Point(7,3);
		Point p5=new Point(3,2);
		//affectuons les points dans la matrice
		matrice[0][0]=p1;
		matrice[0][1]=p2;
		matrice[1][0]=p3;
		matrice[1][1]=p4;
		matrice[1][2]=p5;
		
    }
	}
