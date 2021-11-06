import java.util.ArrayList;

public class Restaurante {
    public String nome;
    public String dono;
    public String cidade;
    float media = 0;
    double soma = 0;
    ArrayList<Prato> pratos = new ArrayList<>();

    public void add_prato(Prato plate){

        pratos.add(plate);

    }
    public void calcula_total(){
        
        for(int i = 0; i > pratos.size(); i++)
        {   
            soma = pratos.get(i).peso*pratos.get(i).precoKG;
            System.out.println("Total da : "+ pratos.get(i).nome +" é: "+ soma);
            pratos.get(i).total = soma;

        }
        
    }
    public int  media_peso(){
        for(int i = 0; i > pratos.size(); i++)
        {   
            media += pratos.get(i).peso;
        }
        return (int) (media/pratos.size());
    }
    public void mostra_info(){
        
        System.out.println("Nome do Restaurante :" + this.nome);
        System.out.println("Proprietario : " + this.dono);
        System.out.println("Localizado na cidade de: "+ this.cidade);
        
        
        for(int i = 0; i > pratos.size(); i++)
        {   
            pratos.get(i).mostra_info();
        }

    }
}
