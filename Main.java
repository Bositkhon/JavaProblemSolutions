import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        quadraticEquation();

    }

    static void quadraticEquation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the coefficients A, B and C of a quadratic equation");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double determinant = determinant(a,b,c);

        System.out.println("Determinant is: " + determinant);

        if(determinant > 0){
            double x1 = ( -b + Math.sqrt(determinant) ) / (2 * a), x2 = ( -b - Math.sqrt(determinant) ) / (2 * a);
            System.out.println("X1 (first root) is: " + x1);
            System.out.println("X2 (second root) is: " + x2);
        }else if(determinant < 0){
            System.out.println("The determinant is less than 0 so there are no real roots!");
        }else if(determinant == 0){
            int x = -b / ( 2 * a );
            System.out.println("The determinant is zero, so there is one root which is: " + x);
        }

    }

    static double determinant(int a, int b, int c){
        return Math.pow(b, 2) - 4 * a * c;
    }

    static void reversedCenteredTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of a triangle");
        int height = sc.nextInt();

        int length = height * 2 - 1;
        System.out.println("Length: " + length);

        int center = length / 2;
        System.out.println("Center: " + center);


        int[][] array = new int[height][length];

        for(int i = 0; i < height; i++){
            for(int j = 0; j < length; j++){
                array[i][j] = 0;
            }
        }

        for(int i = 0; i < height; i++){
            for(int j = i ; j < length - i; j++){
                array[i][j] = 1;
            }
        }

        for(int i = 0; i < height; i++){
            for(int j = 0; j < length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void centeredTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of a triangle");
        int height = sc.nextInt();

        int length = height * 2 - 1;
        System.out.println("Length: " + length);

        int center = length / 2;
        System.out.println("Center: " + center);


        int[][] array = new int[height][length];

        for(int i = 0; i < height; i++){
            for(int j = 0; j < length; j++){
                array[i][j] = 0;
            }
        }

        for(int i = 0; i < height; i++){
            for(int j = center - i; j < center + i + 1; j++){
                array[i][j] = 1;
            }
        }

        for(int i = 0; i < height; i++){
            for(int j = 0; j < length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void leftRightAngleTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of an array");
        int size = sc.nextInt();

        int[][] array = new int[size][size];

        System.out.println("Method with if statement");

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                array[i][j] = 0;
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(j <= i){
                    array[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Method with simple for loops");


        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                array[i][j] = 0;
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j <= i; j++){
                array[i][j] = 1;
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rightRightAngleTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of an array");
        int size = sc.nextInt();
        int[][] array = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                array[i][j] = 0;
            }
        }

        System.out.println("Method with if statements");

        for(int i = 0; i < size; i++){
            for(int j = size - 1; j >= 0; j--){
                if(j >= size - 1 - i){
                    array[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Method with simple for loops");

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                array[i][j] = 0;
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = size - 1; j >= size - 1 - i; j--){
                array[i][j] = 1;
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

}
