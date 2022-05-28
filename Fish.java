/* 
A program to display fish by usin easy graphic 
COM1003 Java Programming Autumn Semester 2019-20
Programming Assignment 2
Written by : Ahmet Can Yavuz 
Written on : 25/11/2019
*/

import sheffield.*;
public class Fish {
	public static void main(String[] args) {
		
		EasyGraphics g = new EasyGraphics(1200,500);  //easy graphic size 
		EasyReader fileInput = new EasyReader("fish.txt"); // to read file in 
		final int ROW =45, COLUMNS =134; // row and columns to display fish 
		char[][]fish = new char[ROW][COLUMNS]; // 2d array with row and columns size 
		
		g.setColor(0,50,30); // dark green backround color 
	        g.fillRectangle(0,0,1200,500); // backround color size 
	   
	    for (int row=0; row<ROW; row++){
	    	for(int col=0; col<COLUMNS; col++)
	    		fish[row][col] = fileInput.readChar(); // to convert file input to char 
	    }
	    
	    for(int numberOfFish=0; numberOfFish<20; numberOfFish++){ //for 20 fish 
	    	int randomCol = (int)(Math.random() * 450 + 5); //for random columns 
	    	int randomRow = (int)(Math.random() * 450 + 5); //for random row 
	    	int randomColor1 = (int)(Math.random() * 255); //for random color 
	    	int randomColor2 = (int)(Math.random() * 255); //for random color 
	    	int randomColor3 = (int)(Math.random() * 255); //for random color 
	    	
	    	for (int row=0; row<ROW; row++){  
	    		for(int col=0; col<COLUMNS; col++){
	    			if((int)fish[row][col] % 2 == 0){ // to check if file input is even 
	    				g.setColor(randomColor1,randomColor2,randomColor3);//color of fishs
	    				g.plot(randomCol+col,ROW-row+randomRow);//coordinates of fishs 
	    			}
	    		}
	    	}
	    }
	    
	    EasyReader fileInput2 = new EasyReader("fish.txt"); // to read file in for big fish 
	    char[][] bigFish = new char[ROW*4][COLUMNS*4]; // 2d arry  with row and columns size
	    
	    for (int row=0; row<ROW*4; row+=4){ // 4 times bigger row for big fish 
	    	for(int col=0; col<COLUMNS*4; col+=4){// 4 times bigger col for big fish
	    		bigFish[row][col] = fileInput2.readChar(); // to convert file input to char
	    		
	    		if((int)bigFish[row][col] % 2 == 0){// to check if file input is even 
	    			g.setColor(255,255,255); // big fish's white color 
	    			g.fillRectangle((4*COLUMNS-col)+668,(4*ROW-row)+150,4,4);
	    			//coordinates of the bigh fish 
	  
	    		}
	    	}
	    }
	    g.waitSeconds(3); // to wait three seconds before change the 20 fish's direction
	    g.clear(); // to clear EasyGraphics 
	    
	    EasyReader fileInput3 = new EasyReader("fish.txt");//to read file in for opposite dircetion fish
		char[][]fish2 = new char[ROW][COLUMNS]; // 2d array with row and columns size 
		
		g.setColor(0,50,30); // dark green backround color 
	        g.fillRectangle(0,0,1200,500); // backround color size 
	   
	    for (int row=0; row<ROW; row++){
	    	for(int col=0; col<COLUMNS; col++)
	    		fish2[row][col] = fileInput3.readChar(); // to convert file input to char 
	    }
	    
	    for(int numberOfFish=0; numberOfFish<20; numberOfFish++){ //for 20 fish  
	    	int randomCol = (int)(Math.random() * 450 + 5); // for random columns 
	    	int randomRow = (int)(Math.random() * 450 + 5); // for random row 
	    	int randomColor1 = (int)(Math.random() * 255); // for random color 
	    	int randomColor2 = (int)(Math.random() * 255); // for random color 
	    	int randomColor3 = (int)(Math.random() * 255); // for random color 
	    	
	    	for (int row=0; row<ROW; row++){  
	    		for(int col=0; col<COLUMNS; col++){
	    			if((int)fish2[row][col] % 2 == 0){// to check if file input is even 
	    				g.setColor(randomColor1,randomColor2,randomColor3);//color of fishs
	    				g.plot((randomCol-col)+COLUMNS,ROW-row+randomRow);//coordinates of fishs 
	    			}
	    		}
	    	}
	    }
	    
	    EasyReader fileInput4 = new EasyReader("fish.txt"); // to read file in for big fish 
	    char[][] bigFish2 = new char[ROW*4][COLUMNS*4]; // 2d arry  with row and columns size
	    
	    for (int row=0; row<ROW*4; row+=4){ // 4 times bigger row for big fish 
	    	for(int col=0; col<COLUMNS*4; col+=4){// 4 times bigger col for big fish
	    		bigFish2[row][col] = fileInput4.readChar(); // to convert file input to char
	    		
	    		if((int)bigFish2[row][col] % 2 == 0){// to check if file input is even 
	    			g.setColor(255,255,255); // big fish's white color 
	    			g.fillRectangle((4*COLUMNS-col)+668,(4*ROW-row)+150,4,4);
	    			//coordinates of the bigh fish
	    			
	    		}
	    	}
	    }
	    
	    /* End Of thre COM1003 Java Programming 
	       Autumn Semester 2019-20
	       Programming Assignment 2
	    */
	        
	}
}
        
    	
