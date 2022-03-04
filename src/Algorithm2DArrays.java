import java.util.ArrayList;

public class Algorithm2DArrays
{
    public static boolean isFound(int[][] arr, int target)
    {
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[0].length; col++)
            {
                if (arr[row][col] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int countElementsWithSubstring(String[][] arr, String searchStr)
    {
        int num = 0;
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[0].length; col++)
            {
                if (arr[row][col].indexOf(searchStr) > -1)
                {
                    num++;
                }
            }
        }
        return num;
    }

    public static int replaceEvensWithZero(int[][] arr)
    {
        int changes = 0;
        for(int col = 0; col < arr[0].length; col++)
        {
            for(int row = 0; row < arr.length; row++)
            {
                if(arr[row][col] % 2 == 0)
                {
                    arr[row][col] = 0;
                    changes ++;
                }
            }
        }
        return changes;
    }

    public static int sumForRow(int[][] arr, int row)
    {
        int sum = 0;
        for(int col = 0; col < arr[0].length; col ++)
        {
            sum += arr[row][col];
        }
        return sum;
    }

    public static int sumForColumn(int[][] arr, int col)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i][col];
        }
        return sum;
    }

    public static int[][] printNumberGrid(int rows, int cols)
    {
        int[][] array = new int[rows][cols];
        int num = 0;
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                array[row][col] = num;
                num++;
            }
        }
        for (int[] row : array)
        {
            for (int val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        return array;
    }



    public static String[][] gridOfXandO(int n)
    {
        String[][] gridXandO = new String[n][n];
        for(int row = 0; row < n; row++)
        {
            for(int column = 0; column < n; column++)
            {
                if((row + column) % 2 == 0)
                {
                    gridXandO[row][column] = "X";
                }
                else
                {
                    gridXandO[row][column] = "O";
                }
            }
        }
        return gridXandO;
    }

    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len)
    {
        ArrayList<String> list = new ArrayList<String>();

        for(String[] row: wordChart)
        {
            for(String string: row)
            {
                if(string.length() == len)
                {
                    list.add(string);
                }
            }
        }
        return list;
    }


}
