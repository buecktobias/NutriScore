package gmo.nutriscore;

import java.io.File;

public class NutriScore {

    public static void main(String[] args) {

        System.out.println(nutriScore(123,50,3,6,4,78,55));
    }
    public static int nutriScore(int energie, int zucker, int gesFettsaeuren, int natrium, int fruechteGemuese, int ballaststoffe, int eiweiss) {
        ScoreTabelle energieScore = new ScoreTabelle("Energiewert.txt");
        ScoreTabelle zuckerScore = new ScoreTabelle("Zuckerwert.txt");
        ScoreTabelle gesFettsaeurenScore = new ScoreTabelle("GesFettsaeuren.txt");
        ScoreTabelle natriumScore = new ScoreTabelle("Natrium.txt");
        ScoreTabelle fruechteGemueseScore = new ScoreTabelle("FruechteGemuese.txt");
        ScoreTabelle ballaststoffeScore = new ScoreTabelle("Ballaststoffe.txt");
        ScoreTabelle eiweissScore = new ScoreTabelle("Eiweiss.txt");

        int punkte = energie + zucker + gesFettsaeuren + natrium;
        if (punkte >= 11 && (fruechteGemuese >= -4 && fruechteGemuese <= -1)) {
            return energieScore.get(energie) + zuckerScore.get(zucker) + gesFettsaeurenScore.get(gesFettsaeuren) + natriumScore.get(natrium) + fruechteGemueseScore.get(fruechteGemuese) + ballaststoffeScore.get(ballaststoffe);
        }
        return energieScore.get(energie) + zuckerScore.get(zucker) + gesFettsaeurenScore.get(gesFettsaeuren) + natriumScore.get(natrium) + fruechteGemueseScore.get(fruechteGemuese) + ballaststoffeScore.get(ballaststoffe) + eiweissScore.get(eiweiss);
    }
}
