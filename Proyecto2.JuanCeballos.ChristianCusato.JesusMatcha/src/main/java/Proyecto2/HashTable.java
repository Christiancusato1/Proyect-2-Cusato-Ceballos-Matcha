
package Proyecto2;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class HashTable {
    String[] arreglo;
    int size;
    
    public HashTable(int size){
        this.size= size;
        this.arreglo=new String[size];
        Arrays.fill(arreglo, "-1");
    }
    
    public void FuncionHash(String[] cadenaArreglo, String[] arreglo){
        for (int i=0; i<cadenaArreglo.length; i++){
            String elemento= cadenaArreglo[i];
            int indiceArreglo= Integer.parseInt(elemento)%size-1;
            JOptionPane.showMessageDialog(null, "El indice es "+indiceArreglo+" para el elemento"+elemento);
            
            while (arreglo[indiceArreglo] != "-1"){
                indiceArreglo++;
                JOptionPane.showMessageDialog(null, "Ocurrio un error en el indice "+(indiceArreglo-1)+" por lo cual se cambiara este indice por "+(indiceArreglo));
                indiceArreglo%= size;
            }
            arreglo[indiceArreglo]= elemento;
        }
    }
    
    public void mostrar() {
        int incremento=0,i,j;
        for(i=0;i<1;i++){
	incremento+=8;
        for(j=0;j<71;j++){
            System.out.print("-");
			}
		System.out.println();
		for(j=incremento -8;j<incremento;j++) {
		System.out.format("|%3s"+"",j);	
		}
		System.out.println("|");
		for(int n=0;n<71;n++) {
		System.out.print("-");	
		}
		System.out.println();
		for(j=incremento -8;j<incremento;j++) {
			if(arreglo[j].equals("-1")) {
				System.out.print("|");
				}else {
					System.out.print(String.format("|%3s"+"", arreglo[j]));
				}
			}
		System.out.println("|");
		for(j=0;j<71;j++) {
			System.out.print("-");
		}
			}
        }
    
}
