package com.islandperimeter;

public class IslandPerimeterSolution {
	/*
	    * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
	     * Grid cells are connected horizontally/vertically (not diagonally).
	     * The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
	     * The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
	     * One cell is a square with side length 1.
	    * The grid is rectangular,
	    * width and height don't exceed 100. Determine the perimeter of the island.
	    *
	     * loop over the matrix and count the number of islands;
	        if the current dot is an island, count if it has any right neighbour or down neighbour;
	        the result is islands * 4 - neighbours * 2
	      * */
	public static int islandPerimeter(int[][] grid) {

        int islands = 0, nieghbours = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; i++) {
                if (grid[i][j] == 1) {
                    if (i < grid.length - 1 && grid[i + 1][j] == 1)
                        nieghbours++;
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) nieghbours++; // count right neighbours
                }
            }
        }
        return 0;
    }

}
