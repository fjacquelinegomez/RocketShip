public class Project1{
    public static final int SIZE = 3;
    public static void main(String[] args){
        triangle();
        line();
        topHalf();
        bottomHalf();
        line();
        bottomHalf();
        topHalf();
        line();
        triangle();
    }
    
    public static void triangle(){
        for(int i = 1; i <= 2 * SIZE - 1; i++){
            for(int x = 1; x <= 2 * SIZE - i; x++){
                System.out.print(" ");
            }
            for(int y = 1; y <= i; y++){
                System.out.print("/");
            }
            System.out.print("**");
            for(int y = 1; y <= i; y++){
                System.out.print("\\");
            }
            System.out.println(" ");
        }
    }
    
    public static void line(){
        System.out.print("+");
        for(int i = 1; i <= 2 * SIZE; i++){
            System.out.print("=*");
        }
        System.out.println("+");
    }
    
    public static void topHalf(){
        for(int i = 1; i <= SIZE; i++){
        System.out.print("|");
            for(int y = 1; y <= SIZE - i; y++){
                System.out.print("."); 
            }
            for(int y = 1; y <= i; y++){
                System.out.print("/\\");
            }
            for(int y = 1; y <= -2*i + 2*SIZE; y++){
                System.out.print(".");
            }
            for(int y = 1; y <= i; y++){
                System.out.print("/\\");
            }
            for(int y = 1; y <= SIZE - i; y++){
             System.out.print(".");
            }
        System.out.println("|");
    }
    }

    public static void bottomHalf(){
     for(int i = SIZE; i >= 1; i--){
        System.out.print("|");
            for(int y = 1; y <= SIZE - i; y++){
                System.out.print(".");
            }
            for(int y = 1; y <= i; y++){
                System.out.print("\\/");
            }
            for(int y = 1; y <= -2*i + 2*SIZE; y++){
                System.out.print(".");
            }
            for(int y = 1; y <= i; y++){
                System.out.print("\\/");
            }
            for(int y = 1; y <= SIZE - i; y++){
             System.out.print(".");
            }
        System.out.println("|");
    }
    }
}
