
package vetorlocadra;

import java.util.Scanner;

/**
 *
 * @author Fabinhu
 */
public class VetorLocadra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String clienteLocadora[] = new String[3];
        int quantidadeLocacaoDVD[] = new int [3];
        int contador=0;
        Scanner lerTeclado = new Scanner(System.in);
       
        do{
        
            System.out.println("Digite o Nome do cliente: ");
            clienteLocadora[contador] = lerTeclado.nextLine();
                      
            System.out.println("Digite a quantidade de DVD Locada por "+clienteLocadora[contador]+" : ");
            quantidadeLocacaoDVD[contador] = lerTeclado.nextInt();
                        
            contador++;
            
    }while(contador <= 2);
        
        for(int contLaco=0;contLaco < clienteLocadora.length;contLaco++){
            int locacaoGratis = quantidadeLocacaoDVD[contLaco]/10;
                 System.out.println(clienteLocadora[contLaco]+" Teve "+quantidadeLocacaoDVD[contLaco]+" "
                 + " terá "+locacaoGratis+" Locações Gratuitas");
              
          }
    
    }
}
