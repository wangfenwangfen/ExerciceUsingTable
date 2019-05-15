public class UseTable {

    public static void main(String[] args) {
        // creer table type int en taille 10, la taille de table est fixée à l'initialisation, non modifiable
        //int tabInt[] = new int[10];
        int[] tabInt = new int[10];

        //Declarer deux tab type int non initialisees
        int[] premierTableau, deuxiemeTableau;

        //remplissage tableau
        tabInt[0] = 100;
        int[] tabWithValue = {1, 2, 3, 999};

        //Lecture de table et remplir tab avec les 10 elements en valuer 100
        for (int i = 0; i < tabInt.length; i++) {
            tabInt[i] = 100;
        }

        // Cloner le tableau
        int[] myCloneTab = tabInt.clone();

        //Tableau à plusieurs dimension, la  taille du premier[] contenaire doit être defini à l'initialisation;
        //create un tableau qui contient 5 sous tableau
        int[][] tabSup = new int[5][];

        //remplir tableau tabSup avec 5 sous tab de type int de taille 6
        for (int i = 0; i < tabSup.length; i++) {
            tabSup[i] = new int[6];
        }

        System.out.println(tabSup.length); //5
        System.out.println(tabSup[0].length); //6

        //parcourir les tables plusieurs dimension
        int i, j;
        for (i = 0; i < tabSup.length; i++) {
            for (j = 0; j < tabSup[i].length; j++) {
                //Action sur tabSup[i][j]
                int element = tabSup[i][j];
            }
        }
    }
}
