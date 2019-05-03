public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount>0) {
            System.out.print("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        while(amount>0) {
            System.out.print(" ");
            amount--;
        }
        //System.out.println("");
        // 40.1
    }

    public static void printTriangle(int size) {
        int amount = size-1;
        int count=1;
        while(amount>=0) {
            printWhitespaces(amount);
            printStars(count);
            amount--;
            count++;
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        int spaces = height - 1;
        int stars = 1;

        while(spaces>=0) {
            printWhitespaces(spaces);
            printStars(stars);
            spaces--;
            stars+=2;
        }

        spaces = height-2;
        stars = 3;

        printWhitespaces(spaces);
        printStars(stars);
        printWhitespaces(spaces);
        printStars(stars);
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
