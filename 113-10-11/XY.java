

public class XY {
    public static void main(String[] args) {
        int[][] cords = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for(int x = 0; x < cords.length; x++) {   //巡行二維陣列,X為列數,Y為行數
            for(int y = 0; y < cords[x].length; y++) {
                System.out.printf("%2d", cords[x][y]);
            }
            System.out.println();
        }
    }
} 
