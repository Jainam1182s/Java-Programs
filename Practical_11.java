/*Question := Write a program that creates a Random object and displays the first 100 random integers between 
              1 and 49 using NextInt(49) methods.*/

import java.util.Random;

public class Practical_11 {
    public static void main(String[] args) {
        Random ra = new Random();
        for(int i=0; i<100; i++) {
            System.out.println(ra.nextInt(50));
        }
    }
}

/* output :=
1
1
4
44
16
39
29
33
33
32
31
36
26
14
21
16
8
18
16
15
5
30
0
3
15
46
6
24
17
19
26
2
5
23
6
26
26
17
22
16
3
11
2
6
33
28
30
2
17
33
44
17
8
9
32
25
42
48
10
42
43
26
23
9
33
1
27
25
49
16
46
14
32
39
36
44
9
29
21
31
9
7
29
26
32
14
12
49
8
44
0
18
42
3
24
15
13
37
43
12
    */
