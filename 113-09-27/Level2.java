
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
       
        char level = '\0';


        Scanner input = new Scanner(System.in);
        System.out.print("請輸入分數: ");
        
        
        while(input.hasNext()){
              
        int score = input.nextInt();
            switch(score / 10) { 
                case 10: 
                case 9: 
                    level = 'A';
                    break; //表示跳出,也可用於迴圈
                case 8: 
                    level = 'B';
                    break; 
                case 7: 
                    level = 'C';
                    break; 
                case 6: 
                    level = 'D';
                    break; 
                default: //以上皆非,則取此
                    level = 'E';
            }
            System.out.printf("得分等級 %c%n", level);
            System.out.print("請輸入分數: ");

        }
        
    }
    
}
