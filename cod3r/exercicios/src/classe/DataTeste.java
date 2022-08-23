package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(11, 12, 1996);

        Data d2 = new Data();
        d2.ano = 2022;

        String dataFormatada1 = d1.obterDataFormatada();

        System.out.println(dataFormatada1);
        d2.imprimirDataFormatada();
    }
}