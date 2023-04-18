package algorit_dolgozatmzsl;

import java.util.Arrays;

public class Program {

    public static int[] rendezes(int[] kertitorpekMagassaga) {
        Arrays.sort(kertitorpekMagassaga);
        return kertitorpekMagassaga;
    }

    
    
    public static void main(String[] args) {
        int[] kertitorpekMagassaga = {17, 12, 32, 124, 11, 12, 65, 80, 91, 101};
        rendezes(kertitorpekMagassaga);
        kiiras(kertitorpekMagassaga);
        ellenorzesek(kertitorpekMagassaga);

    }
    
    
    
    
    

    public static void kiiras(int[] kertitorpekMagassaga) {
        for (int i = 0; i < kertitorpekMagassaga.length; i++) {
            System.out.println(kertitorpekMagassaga[i]
            );
        }
    }

    private static void ellenorzesek(int[] kertitorpekMagassaga) {
        for (int i = 0; i < 10; i++) {
            assert kertitorpekMagassaga[i] < kertitorpekMagassaga[i+1] : "jó";
        }
    
}
    }


