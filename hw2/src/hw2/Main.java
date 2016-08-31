package hw2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Patiwet
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DynamicArray var1 = new DynamicArray(2);
        System.out.println(var1.isEmpty());
        //Test by

        var1.printStructure();
        var1.pushBack(5);
        var1.pushBack(6);
        var1.printStructure();
        var1.pushBack(7);
        var1.printStructure();
        var1.pushBack(8);
        var1.printStructure();
        var1.pushBack(9);
        var1.printStructure();

        System.out.println("\n____TestCase2___");
        DynamicArray var2 = new DynamicArray(3);
        var2.printStructure();
        var2.popBack();
        var2.pushBack(11);
        var2.pushBack(12);
        var2.popBack();
        var2.printStructure();

        System.out.println("\n____TestCase3___");
        DynamicArray var3 = new DynamicArray(2);
        for(int i=0;i<10;i++){
            var3.pushBack(i*i+1);
        }
        var3.printStructure();
        System.out.println(var3.get(10));
        var3.set(10, 555);
        var3.remove(10);
        var3.printStructure();
    }

}
