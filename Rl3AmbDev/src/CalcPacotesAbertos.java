public class CalcPacotesAbertos{
        
    public static void main(String[] args) {
        
        double arrozCozido=3.5;
        double arroz_QtdPacote=1.0;
        double arroz_RendimentoPct=arroz_QtdPacote*2.0;
        double arrozCruNecessario;
        double PacotesArrozUsados;

        arrozCruNecessario = arrozCozido/arroz_RendimentoPct;
        PacotesArrozUsados= Calculadora.Teto(arrozCruNecessario);
        
        System.out.println("Para cozinhar "+arrozCozido+" quilos de arroz, é necessário "+PacotesArrozUsados+" pacotes de arroz.");
    }

}
