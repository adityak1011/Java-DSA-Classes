package Pattern;

public class Pattern {

    public static void hollow_rectangle(int totRows, int totCols) {
        //outer loop
        for(int i=1; i<=totRows; i++) {
            //inner - columns
            for(int j=1; j<=totCols; j++) {
                //cell - (i, j)
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n) {
        // outer loop for each row
        for(int i = 1; i <= n; i++) {
            // inner loop for spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop for stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_withNumbers(int n) {
        for(int i=1; i<=n; i++) {
            // inner - numbers
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void flyods_triangle(int n) {
        //outer
        int counter = 1;
        for(int i=1; i<=n; i++) {
            //inner - how many times will counter be printed
            for(int j=1; j<=i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if( (i+j) % 2 == 0) { //even
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        //1st half
        for(int i=1; i<=n; i++) {
            //stars - 1
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces - 2*(n-1)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Half
        for(int i=n; i>=1; i--) {
            //stars - 1
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces - 2*(n-1)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //hollow rectangle - stars
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        //1st half
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
    //    hollow_rectangle(4, 5);
    //    inverted_rotated_half_pyramid(4);
    //    inverted_half_pyramid_withNumbers(5);
    //    flyods_triangle(5);
    //    zero_one_triangle(5);
    //    butterfly(4);
    //    solid_rhombus(5);
    //    hollow_rhombus(5);
          diamond(4);
    }
}

