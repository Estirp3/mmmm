package main;

public class main {
    public static  void main(String[] arg ){
        //int[] array ={1,2,3,4,5};
        //arregloRecursivo(array,0);

        factoring fac = new factoring();
        fac.sumaRecursiva(9);
        fac.factoringRecursiva(5);
    }
/*
    public static void arregloRecursivo(int[] array, int indice){
        if(indice != array.length){
            System.out.println(array[indice]);
            arregloRecursivo(array,indice+1);
        }
    }
  */

}
