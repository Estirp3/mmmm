package main;

public class factoring {
    int num=9;
    public int sumaRecursiva(int numero){
        int res;
        if(numero == 1){
            return 1;
        }else{
            res = numero+sumaRecursiva(numero-1);
        }
        System.out.println(res);
        return res;
    }

    public int factoringRecursiva(int numero){

        int res;
        if (numero == 1 ){
            return 1;
        }else {
            res = numero*factoringRecursiva(numero-1);
        }
        System.out.println(res);
        return res;
    }
}
