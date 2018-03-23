package Unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private int l; 


	public Maze()
	{
		maze = new int[0][0];
	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		String[] l = line.split(" ");
		int[] nums = new int[l.length];
		
		int p = 0; 
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(l[i]);
		}
		for (int i = 0; i < size; i++) {
			for ( int j = 0; j < size; j++) {
				maze[i][j] = nums[p]; //puts in numbers from .txt file
				p++; 
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println( );
		}
		
	}

	private int parseInt(String line) {
		
		int l = Integer.parseInt(line);
		return l; 
		
	}

	public boolean hasExitPath(int r, int c)
	{
		if (((r >= 0 && r < maze.length) && (c >= 0 && c < maze[r].length) ))
		{
			if (maze[r][c] ==1) {
			maze[r][c] = 'v';
				if (c == maze[r].length - 1) {
					return true;
				}
				else {
					if (hasExitPath(r, c-1)) {
						return true;
					}
					if (hasExitPath(r,c+1)) {
						return true; 
					}
					if (hasExitPath(r-1, c)) {
						return true; 
					}
					if(hasExitPath(r+1, c)) { 
						return true; 
					}
					else {
						return false; 
					}
				}
			}
			else { 
				return false; 
			}
		}
		else {
			return false;
		}

	}

	public String toString()
	{
		String output="";
		if (hasExitPath(0,0)) {
			output += "exit found";
		}
		else {
			output += "exit not found";
		}
		return output + "\n";
	}
}