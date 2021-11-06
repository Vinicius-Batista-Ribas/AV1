public class Prato {
    public String nome;
    public float precoKG;
    public double peso;
    public double total;

   
    public void mostra_info(){


        System.out.println("Prato: "+ this.nome);
        System.out.println(this.precoKG + "por KG");
        System.out.println(this.peso+"KG");
        System.out.println("Total: "+ this.total);

    }
}
