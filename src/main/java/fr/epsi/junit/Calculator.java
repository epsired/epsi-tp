package fr.epsi.junit;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int multi(int a, int b){
        return a * b;
    }

    public int substract(int a, int b){ return a - b; }

    public int div(int a, int b){
        return a/b;
    }

    public int add(int[] nmbers){
        int result = 0;
        for(int i=0; i<nmbers.length; i++){
            result = result + nmbers[i];
        }
        return result;
    }
}
