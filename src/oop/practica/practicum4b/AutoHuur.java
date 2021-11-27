package oop.practica.practicum4b;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur(){
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setAantalDagen(int aD){
        this.aantalDagen = aD;
    }

    public void setHuurder(Klant k){
        this.huurder = k;
    }

    public Klant getHuurder(){
        return this.huurder;
    }

    public void setGehuurdeAuto(Auto gA){
        this.gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto(){
        return this.gehuurdeAuto;
    }

    public double totaalPrijs(){
        double price = 0;
        if (gehuurdeAuto != null && aantalDagen > 0){
            price = aantalDagen * gehuurdeAuto.getPrijsPerDag();
            if(huurder != null && huurder.getKorting() != 0){
                price = price * (100 - huurder.getKorting())/100;
            }
        }
        return price;
    }

    public String toString(){
        //default if everything is set:
        String auto = "  er is geen auto bekend";
        String h = "  er is geen huurder bekend";
        String prijs = "  aantal dagen: 0 en dat kost 0.0";

        if (huurder != null ){
            h = huurder.toString();
        }
        if (gehuurdeAuto != null){
            auto = gehuurdeAuto.toString();
        }
        if (huurder != null && gehuurdeAuto != null){
            prijs =  String.format("  aantal dagen: %d en dat kost %.1f", aantalDagen, totaalPrijs());
        }

        String s = auto +"\n" +  h + "\n" + prijs;

        return s;
    }
}
