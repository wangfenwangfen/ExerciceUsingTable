import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

class SelecteurAvecTrieEnOrdre {

    int choseBiggest(int[] ints) {

       // TrierTableIntsByOrdreCroissanteWithArrays(ints);

        TierTableIntsByOrdreCroissante(ints);
        return ints [ints.length -1];
    }

    void trierTableIntsByOrdreCroissanteWithArrays(int[] ints) {
        Arrays.sort(ints);
    }

    private void TierTableIntsByOrdreCroissante(int[]ints){
        int longueur = ints.length;
        //variable temporaire qui stock la variable pus grande
        int tampon;
        boolean isSorted;

        do {
            // hypothèse : le tableau est trié
            isSorted = true;
            for (int i = 0; i < longueur - 1; i++) {
                // Teste si 2 éléments successifs sont dans le bon ordre ou non
                if (ints[i] > ints[i + 1]) {
                    // s'ils ne le sont pas, on échange leurs positions
                    //stock valeur du ints[i] qui est grand dans tampon
                    tampon = ints[i];
                    //remplacer la valeur de ints[i] par valeur de element droite ints[i+1] qui est petit
                    ints[i] = ints[i + 1];
                    //valeur element petit est traité, now remplacer valeur de ints[i+1] par celui du grand stocké dans tempon
                    ints[i + 1] = tampon;
                    //Des qu'il y rest element à tier, le tableau n'est pas trié
                    isSorted = false;
                }
            }
        } while (!isSorted);
    }

    void trierTableIntsByOrdreDecroissante(int[] ints){
        int longueur = ints.length;
        //variable temporaire qui stock la variable pus grande
        int tampon;
        boolean isSorted;

        do {
            // hypothèse : le tableau est trié
            isSorted = true;
            for (int i = 0; i < longueur - 1; i++) {
                // Teste si 2 éléments successifs sont dans le bon ordre ou non
                if (ints[i] < ints[i + 1]) {
                    // s'ils ne le sont pas, on échange leurs positions
                    tampon = ints[i];
                    ints[i] = ints[i + 1];
                    //stock element grand dans le tampon
                    ints[i + 1] = tampon;
                    //Des qu'il y rest element à tier, le tableau n'est pas trié
                    isSorted = false;
                }
            }
        } while (!isSorted);
    }

    int[] trieDecroissantWithArraysSort(int[]ints){

        //d'abord trier en ordre croissant pour pouvoir reverser
        //TrierTableIntsByOrdreCroissanteWithArrays(ints);
        // To boxed array
        Integer[] integers = Arrays.stream( ints ).boxed().toArray( Integer[]::new );
       // Integer[] integers1 = IntStream.of( ints ).boxed().toArray( Integer[]::new );

        /* To boxed list
        List<Integer> integersList  = Arrays.stream( data ).boxed().collect( Collectors.toList() );
        List<Integer> integersList1 = IntStream.of( data ).boxed().collect( Collectors.toList() );
        */
        Arrays.sort(integers, Collections.reverseOrder());

        //Boxed Arrays Integer to tableau Int
       return Arrays.stream(integers).mapToInt(Integer::intValue).toArray();
    }
}
