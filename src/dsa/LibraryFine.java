package dsa;

public class LibraryFine {

    public static void main(String[] args) {
        int y1=2014, m1=7, d1=2;
        int y2=2015, m2=1, d2=1;

        System.out.println( fine(d1,m1,y1,d2,m2,y2));



    }

    private static int fine(int d1, int m1, int y1, int d2, int m2, int y2) {

        if(y1==y2 || y1<y2){
            if(y1<y2){
                return 0;
            }
            if(m1==m2 || m1<m2){
                if(m1<m2){
                    return 0;
                }
                if(d1==d2 || d1<d2){
                    return 0;
                }
                else{
                    return (d1-d2)*15;
                }
            }
            else{
                return (m1-m2)*500;
            }
        }
        else{
            return 10000;
        }

    }

}

