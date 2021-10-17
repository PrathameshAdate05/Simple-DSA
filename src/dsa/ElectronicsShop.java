package dsa;

public class ElectronicsShop {

    static int maxCombo(int[] keyboard,int[] drives,int budget){
        int maxCombo = 0;
        for(int i = 0;i<keyboard.length;i++){
            for (int j = 0;j<drives.length;j++){
                if(keyboard[i] + drives[j] < budget && keyboard[i] + drives[j] > maxCombo)
                    maxCombo = keyboard[i] + drives[j];

            }
        }
        if(maxCombo != 0)
            return maxCombo;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] keyboards = {4};
        int[] drives = {5};
        int budget = 5;

        System.out.println(maxCombo(keyboards,drives,budget));
    }
}
