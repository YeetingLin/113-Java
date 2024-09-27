

public class Level2 {
    public static void main(String[] args) {
        var score = 88;
        var quotient = score / 10;
        var level = '\0';
        
        switch(quotient) { 
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
    }
}
