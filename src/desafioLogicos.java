public class desafioLogicos {
    public static void main(String[] args) {

        boolean trabalhoQuinta = true;
        boolean trabalhoSexta = true;

        //Operadores binários
        boolean comprouTV50 = trabalhoQuinta && trabalhoSexta;
        boolean comprouTV32 = trabalhoQuinta ^ trabalhoSexta;
        boolean comprouSorvete = trabalhoQuinta || trabalhoSexta;

        //Operador Unário
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50' ? " + comprouTV50);
        System.out.println("Comprou TV 32' ? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);
        System.out.println("Mais Saudável? " + maisSaudavel);

        
    }


}
