/*Question := Write a program to implement the operation of stack using array */

import java.util.Scanner;
import static java.lang.System.exit;

public class Practical_20 {
    int[] arr;
    int top;
    int capacity;

    Practical_20(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack is Full...!!");
            System.exit(1);
        }
        arr[++top] = x;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println(arr[top--]);
        }
        else {
            System.out.println("Stack is Empty...!!");
            System.exit(1);
        }

    }

    void peek() {
        if (isEmpty()) {
            System.out.println(arr[top]);
        }
        else {
            System.out.println("Stack is Empty...!!");
            System.exit(1);
        }

    }

    public void print() {
        if (top == -1) {
            System.out.println("Stack is Empty...!!");
        } else {
            System.out.println("Stack elements := ");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
    boolean isEmpty() {
        return top != -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements := ");
        int n = sc.nextInt();

        Practical_20 pr = new Practical_20(n);

        int ele;
        System.out.println("Enter Elements := ");
        for(int i=0;i<n;i++)
        {
            ele = sc.nextInt();
            pr.push(ele);
        }

        while (pr.top >= -1) {
            System.out.println("1.DISPLAY");
            System.out.println("2.POP");
            System.out.println("3.PEEK");
            System.out.println("4.EXIT");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1 :
                    pr.print();
                    break;

                case 2 :
                    pr.pop();
                    System.out.println();
                    break;

                case 3:
                    pr.peek();
                    System.out.println();
                    break;
                case 4 :
                    exit(1);

                default :
                    System.out.println("Invalid");
            }
        }
    }

    /*
    Output := 
    Enter Number of Elements := 
5
Enter Elements := 
4
3
2
7
6
1.DISPLAY
2.POP
3.PEEK
4.EXIT
1

Stack elements := 
6
7
2
3
4
1.DISPLAY
2.POP
3.PEEK
4.EXIT
2

6

1.DISPLAY
2.POP
3.PEEK
4.EXIT
3

7

1.DISPLAY
2.POP
3.PEEK
4.EXIT
1

Stack elements := 
7
2
3
4
1.DISPLAY
2.POP
3.PEEK
4.EXIT
4
    */
}

