import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Restaurante restaurante = new Restaurante();
        Scanner x = new Scanner(System.in);
        int op;

        restaurante.nome = "MataMinhaFome";
        restaurante.dono = "Vinícius";
        restaurante.cidade = "São Francisco";

        System.out.println("1 - Adicionar prato");
        System.out.println("2 - Calcular o total");
        System.out.println("3 - Media de peso");
        System.out.println("4 - Mostra info");
        System.out.println("opção");
        
        op = x.nextInt();
        while(op != 0)  
        {
            switch(op)
            {
                case 1:
                    Prato p = new Prato();
                    p.nome = x.nextLine();
                    p.peso = x.nextDouble();
                    p.precoKG = x.nextFloat();

                    restaurante.add_prato(p);

                    break;
                case 2:
                    restaurante.calcula_total();       
                    break;   
                case 3:
                    System.out.println(restaurante.media_peso());
                    break;
                case 4: 
                restaurante.mostra_info();
                    break;
            }
            System.out.println("1 - Adicionar prato");
            System.out.println("2 - Calcular o total");
            System.out.println("3 - Media de peso");
            System.out.println("4 - Mostra info");

        }     
    }
}
