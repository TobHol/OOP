package oop.week1.les1;

public class Klant {                                    //Java-klasse
    private String name;                                //attribuut naam
    private String address;
    private String place;

    public static void main(String[] args){

    }
    public Klant(String nm, String adr, String pl){
        name = nm;                                      // nm is tijdelijk
        address = adr;                                  // daarom slaan we ze op in de attributen
        place = pl;
    }

    public String getName(){                            // publieke getter
        return(name);
    }

    public String getAddress(){                         // Iedereen kan er nu toch bij om te zien
        return address;
    }

    public String getPlace(){
        return place;
    }

    public String toString(){                           // Toont klasse informatie
        String story = name + " lives at " + address + " in "  + place;
        return story;
    }

    public void setAddress(String adr){
        address = adr;
    }

    public void setPlace(String plc) {
        place = plc;
    }

    // this in main
//    Klant k1 = new Klant("moaw", "davidweg", "boxtel");
//    //System.out.println(k1.name);                                        // dit kan niet want het is een private variabele
//    System.out.println(k1.toString());
//    k1.setAddress(" da street ");
//    System.out.println(k1.toString());
//
}
