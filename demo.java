import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();

        for (int t = 0; t < testcases; t++) {
            int x = scanner.nextInt();
            // pattern1(x);
            // pattern3(x);
            // pattern4(x);
            // pattern5(x);
            // pattern6(x);
            // pattern7(x);
            // pattern8(x);
            // pattern9(x);
            // pattern10(x);
            // pattern11(x);
            // pattern12(x);
            // pattern13(x);
            // pattern14(x);
            // pattern15(x);
            // pattern16(x);
            // pattern17(x);
            // pattern18(x);
            // pattern19(x);
            // pattern20(x);
            // pattern21(x);
            pattern22(x);

        }
        scanner.close();
    }

    static void pattern1(int n) {
        {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }

    static void pattern3(int N) {
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern4(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern5(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i + 1; j++) {
                System.out.print("*" + "");
            }
            System.out.println();

        }
        System.out.println();
    }

    static void pattern6(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print(j + "");
            }
            System.out.println();

        }
        System.out.println();
    }

    static void pattern7(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" " + "");
            }
            for (int j = 1; j <= i + i - 1; j++) {
                System.out.print("*" + "");
            }
            // for(int j = 1; j <= N-i ; j++){
            // System.out.print(" " +"");
            // }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern8(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" " + "");
            }

            for (int j = 1; j <= 2 * N - (2 * i - 1); j++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern9(int N) {
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N - i; j++) {
                System.out.print(" " + "");
            }
            for (int j = 1; j <= i + i - 1; j++) {
                System.out.print("*" + "");
            }

            System.out.println();

        }
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" " + "");
            }

            for (int j = 1; j <= 2 * N - (2 * i - 1); j++) {
                System.out.print("*" + "");
            }

            System.out.println();

        }
        System.out.println();
    }

    static void pattern10(int N) {
        for (int i = 1; i <= 2 * N - 1; i++) {
            int stars = i;
            if (i > N)
                stars = 2 * N - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + "");
            }

            System.out.println();

        }

    }

    static void pattern11(int N) {
        for (int i = 1; i <= N; i++) {
            int start = 1;
            // This is for check is Even number of row then start with 0.
            if (i % 2 == 0)
                start = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(start + "");
                // This Logic is for Flippint the Value from O 1 0 1.. .
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void pattern12(int N) {
        int space = 2 * (N - 1);
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" " + "");
            }
            for (int j = i; j >= 1; j--) { // IMPORTANT
                System.out.print(j);
            }
            System.out.println();
            space = space - 2; // space -= 2; //IMPORTANT Logic for This Design
        }
        System.out.println();
    }

    static void pattern13(int N) {
        int num = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }

    static void pattern14(int N) {
        for (int i = 1; i <= N; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");

            }
            System.out.println();
        }
    }

    static void pattern15(int N) {
        for (int i = 0; i < N; i++) {
            for (char ch = 'A'; ch <= 'A' + (N - i - 1); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern16(int N) {
        for (int i = 0; i < N; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");

            }
            System.out.println();
        }
    }

    static void pattern17(int N) {
        for (int i = 0; i < N; i++) {
            // space
            for (int j = 0; j <= N - i - 1; j++) {
                System.out.print(" " + "");
            }
            // character
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print(ch + "");
                if (j < breakpoint)
                    ch++; // Condition for swapping from identical design
                else
                    ch--;
            }
            // space
            for (int j = 0; j <= N - i - 1; j++) {
                System.out.print(" " + "");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern18(int N) {
        for (int i = 0; i < N; i++) {
            for (char ch = (char) (int) ('E' - i); ch <= (char) ('E'); ch++) {
                System.out.print(ch + "");
            }
            System.out.println();
        }
    }

    static void pattern19(int N) {
        int space = 0;
        for (int i = 0; i < N; i++) {
            // stars
            for (int j = 0; j < N - i; j++) {
                System.out.print("*" + "");
            }
            // space
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < N - i; j++) {
                System.out.print("*" + "");
            }
            space += 2;
            System.out.println();
        }
        space = 8;
        for (int i = 1; i <= N; i++) {
            // star
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
    }

    static void pattern20(int N) {
        int space = 2 * N - 2;
        for (int i = 1; i <= 2 * N - 1; i++) {
            int stars = i;
            if (i > N)
                stars = 2 * N - i; // IMPORTANT: reducing starts in last part
            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + "");
            }
            // spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
            if (i < N)
                space -= 2;
            else
                space += 2;

        }
    }

    static void pattern21(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || j == 0 || i == N - 1 || j == N - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern22(int N) {
        for (int i = 0; i < 2 * N - 1; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * N - 2) - j;
                int down = (2 * N - 2) - i;
                System.out.print(N - Math.min(Math.min(top, down), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }
}