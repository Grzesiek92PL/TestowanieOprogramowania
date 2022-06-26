package com.pawel;

public class Pesel {
    public boolean checkPesel(String pesel) {
        if (pesel.length() == 11) {
            int suma =
                    Integer.parseInt(pesel.charAt(0) + "") * 1
                            + Integer.parseInt(pesel.charAt(1) + "") * 3
                            + Integer.parseInt(pesel.charAt(2) + "") * 7
                            + Integer.parseInt(pesel.charAt(3) + "") * 9
                            + Integer.parseInt(pesel.charAt(4) + "") * 1
                            + Integer.parseInt(pesel.charAt(5) + "") * 3
                            + Integer.parseInt(pesel.charAt(6) + "") * 7
                            + Integer.parseInt(pesel.charAt(7) + "") * 9
                            + Integer.parseInt(pesel.charAt(8) + "") * 1
                            + Integer.parseInt(pesel.charAt(9) + "") * 3;

            int kontrolna = (10 - suma % 10);
            int ostatniaCyfra = Integer.parseInt(pesel.charAt(10) + "");
            if (kontrolna == ostatniaCyfra) return true;
        }
        return false;
    }
}