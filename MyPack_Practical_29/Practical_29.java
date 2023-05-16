/* Question := Make a package called “MyPack” in which declare one class called “PackDemo” which displays the
               string from three different classes of that same package.*/

package MyPack_Practical_29;

public class Practical_29 {
    public static void main(String[] args) {
        Class1 a1 = new Class1();
        Class2 a2 = new Class2();
        Class3 a3 = new Class3();
        a1.display();
        a2.display();
        a3.display();
    }
}

/* Output := 
        This is Class1.
        This is Class2.
        This is Class1.
*/
