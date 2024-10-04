

public class Level {
    public static void main(String[] args) {
        var score = 88;
        var level = '\0'; 
        
        if(score >= 90) {
            level = 'A';
        } 
        else if(score >= 80  ) {
            level = 'B';
        }
        else if(score >= 70 ) {
            level = 'C';
        }
        else if(score >= 60 ) {
            level = 'D';
        }        
        else {
            level = 'E';
        }
        System.out.printf("敺����蝑�蝝�: %c%n", level);
    }
}
