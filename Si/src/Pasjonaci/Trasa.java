package Pasjonaci;

import java.time.LocalDate;

public class Trasa {
    public int dlugosc;
    public LocalDate data;
    public double pb95;
    public double lpg;
    public static int tankowalLPG = 0;
    public static int tankowalPb95 = 0;
    public boolean tylkoLPG = false;

    public enum DzienTygodnia{
        Poniedziałek,
        Wtorek,
        Środa,
        Czwartek,
        Piatek,
        Sobota,
        Niedziela
    }

    public DzienTygodnia dzienTygodnia(){
        var dzienInt = data.getDayOfWeek().getValue();

        switch (dzienInt) {
            case 1:
                return DzienTygodnia.Poniedziałek;
            case 2:
                return DzienTygodnia.Wtorek;
            case 3:
                return DzienTygodnia.Środa;
            case 4:
                return DzienTygodnia.Czwartek;
            case 5:
                return DzienTygodnia.Piatek;
            case 6:
                return DzienTygodnia.Sobota;
            default:
                return DzienTygodnia.Niedziela;
        }
    }

    private void spalanie(){

        ileLpg();
        // warunek dla tankowania Pb95
        if(dzienTygodnia() == DzienTygodnia.Czwartek && pb95 < 40){
            pb95 = 45.00;
            tankowalPb95 += 1;
        }

        //warunek na tankowanie LPG
        if(lpg <5) {
            lpg = 30.00;
            tankowalLPG += 1;
        }

    }

    private void ileLpg(){
        if(lpg > 15){
            var litry = ((9.00* (double) dlugosc) / 100.00);
            tylkoLPG = true;
            lpg -=litry;
        }

        else {
            var litry  =((9.00* ((double) dlugosc) / 2) / 100.00);
            lpg -= litry;
            pb95 -= ((6.00* ((double) dlugosc) / 2) / 100.00);
        }

    }





    public Trasa(String _data, String _dlugosc, double _stanPb95, double _stanLpg){
        var arr = _data.split("-");
        data = LocalDate.of(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
        dlugosc = Integer.parseInt(_dlugosc);
        pb95 = _stanPb95;
        lpg = _stanLpg;




        spalanie();

    }


}
