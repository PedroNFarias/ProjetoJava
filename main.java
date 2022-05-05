public class main{
    public static void main(String[] args){
        calculadoraDeDemanda13 c = new calculadoraDeDemanda13();
        c.setCargaF(10000f);
        c.qtd9000BTUs = 150;
        System.out.println(c.demandaF());
    }

}