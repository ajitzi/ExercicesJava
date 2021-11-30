package fr.test.example.exercices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

public class ExercicesAlgo {
    public static void main(String[] args) {
    }


    static void exo1A(int a, int b) {
        System.out.println("a=" + a + " * b=" + b + " = c=" + a*b);
    }

    static void exo1B(int a, int b) {
    }

    static void exo1C(String a, String b) {
        System.out.println("a=" + a + " + b=" + b + " = c=" + a+b);
    }

    static void exo2A() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le prix HT :");
        int htPrice = scanner.nextInt();
        int ttcPrice = htPrice + (htPrice * 20 / 100);

        System.out.println("Prix TTC:" + ttcPrice + "€");

        scanner.close();
    }

    static void exo2B() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir votre prénom :");
        String firstname = scanner.nextLine();

        System.out.println("Veuillez saisir votre nom :");
        String lastname = scanner.nextLine();

        System.out.println("Bonjour " + firstname + " votre nom est " + lastname);

        scanner.close();
    }

    static void exo3A() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez un nombre positif ou négatif:");
        int integer = scanner.nextInt();
        String result;
        result = integer >= 0 ?  "Positif" : "Négatif";

        System.out.println(result);

        scanner.close();
    }

    static void exo3B() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir un premier nombre positif ou négatif:");
        double integer1 = scanner.nextDouble();

        System.out.println("Veuillez saisir un second nombre positif ou négatif:");
        double integer2 = scanner.nextDouble();

        double multiplication = integer1 * integer2;
        String result = multiplication >= 0 ?  "Positif" : "Négatif";

        System.out.println(result);

        scanner.close();
    }

    static void exo3C() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir un premier prénom :");
        String firstname1 = scanner.nextLine();

        System.out.println("Veuillez saisir un deuxième prénom :");
        String firstname2 = scanner.nextLine();

        System.out.println("Veuillez saisir un deuxième prénom :");
        String firstname3 = scanner.nextLine();

        String[] firstnames = {firstname1, firstname2, firstname3};
        String firstnameToString = Arrays.toString(firstnames);

        Arrays.sort(firstnames);
        String sortFirstnames = Arrays.toString(firstnames);

        String result = firstnameToString.equals(sortFirstnames) ? "Les noms sont triés." : "Les noms ne sont pas triés.";

        System.out.println(result);
        System.out.println(sortFirstnames);

        scanner.close();
    }

    static void exo3D() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir un premier nombre positif ou négatif:");
        double integer1 = scanner.nextDouble();

        System.out.println("Veuillez saisir un second nombre positif ou négatif:");
        double integer2 = scanner.nextDouble();

        double multiplication = integer1 * integer2;

        String result = multiplication > 0 ?  "Positif" : multiplication == 0 ? "Nul" : "Négatif";

        System.out.println(result);

        scanner.close();
    }

    static void exo3E() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir l'age de l'enfant:");
        int age = scanner.nextInt();

        String result;

        if (6 <= age && age <= 7) {
            result = "Poussin";
        } else if (8 <= age && age <= 9) {
            result = "Pupille";
        } else if (10 <= age && age <= 11) {
            result = "Minime";
        } else if (12 <= age) {
            result = "Cadet";
        } else {
            result = "Trop jeune";
        }

        System.out.println(result);

        scanner.close();
    }

    static  void exo4A() {
        Scanner scanner = new Scanner(System.in);
        double input;
        do {
            System.out.println("Veuillez saisir un nombre de 0 à 10:");
            input = scanner.nextDouble();
        } while (!(0 <= input && input <= 10));

        System.out.println("Bravo !");
        scanner.close();
    }

    static void exo4B() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un chiffre");
        short input = scanner.nextShort();

        for (short i = 0; i < input; input--) {
            System.out.println(input - 1);
        }

        scanner.close();
    }

    static void exo4C() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int low = 0;
        int high = 9;
        int guessIt = r.nextInt(high-low) + low;
        short input;

        do {
            System.out.println("Veuillez saisir un chiffre");
            input = scanner.nextShort();

            String result = input == guessIt ? "Bravo !" : input > guessIt ? "Plus bas" : "Plus haut";
            System.out.println(result);
        } while (input != guessIt);

        scanner.close();
    }

    static void exo4D() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        double input = scanner.nextDouble();
        int intInput = (int) input;

        do {
            input += intInput - 1;
            intInput--;
        } while (intInput != 0);

        System.out.println(input);

        scanner.close();
    }

    static void exo5A() {
        int[] intArray = {10, 15, 20, 15, 14, 8}; //82
        int sum = 0;

        for (int j : intArray) {
            sum += j;
        }

        System.out.println(sum);
    }

    static void exo5B() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre d'élèves");
        int nbStudents = scanner.nextInt();
        int[] notesArray = new int[nbStudents];

        for (int i = 0; i < notesArray.length; i++) {
            System.out.println("Veuillez saisir la note " + (i + 1));
            notesArray[i] = scanner.nextInt();
        }

        String notesToString = Arrays.toString(notesArray);
        System.out.println("Notes : " + notesToString);

        scanner.close();
    }

    static void exo5C() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre d'élèves");
        int nbStudents = scanner.nextInt();
        double[] notesArray = new double[nbStudents];
        double sum = 0;

        for (int i = 0; i < notesArray.length; i++) {
            System.out.println("Veuillez saisir la note " + (i + 1));
            notesArray[i] = scanner.nextDouble();
            sum += notesArray[i];
        }

        String notesToString = Arrays.toString(notesArray);
        System.out.println("Notes : " + notesToString);
        System.out.println("Moyenne : " + sum / nbStudents);

        scanner.close();
    }

    static void exo5D() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre d'élèves");
        int nbStudents = scanner.nextInt();
        double[] notesArray = new double[nbStudents];
        int nbLowNotes = 0;
        int nbMidNotes = 0;
        int nbHighNotes = 0;

        double sum = 0;

        for (int i = 0; i < notesArray.length; i++) {
            System.out.println("Veuillez saisir la note " + (i + 1));
            notesArray[i] = scanner.nextDouble();

            if (notesArray[i] < 8) {
                nbLowNotes++;
            }
            if (notesArray[i] > 10) {
                nbMidNotes++;
            }
            if (notesArray[i] > 15) {
                nbHighNotes++;
            }

            sum += notesArray[i];
        }

        double[] notesLow = new double[nbLowNotes];
        double[] notesMid = new double[nbMidNotes];
        double[] notesHigh = new double[nbHighNotes];

        int restLowNotes = nbLowNotes;
        int restMidNotes = nbMidNotes;
        int restHighNotes = nbHighNotes;

        for (double note : notesArray) {
            if (note < 8) {
                notesLow[nbLowNotes - restLowNotes] = note;
                restLowNotes--;
            }
            if (note > 10) {
                notesMid[nbMidNotes - restMidNotes] = note;
                restMidNotes--;
            }
            if (note > 15) {
                notesHigh[nbHighNotes - restHighNotes] = note;
                restHighNotes--;
            }
        }

        System.out.println("Notes : " + Arrays.toString(notesArray));
        System.out.println("Notes inférieures à 8: " + Arrays.toString(notesLow));
        System.out.println("Notes suppérieures à 10: " + Arrays.toString(notesMid));
        System.out.println("Notes suppérieures à 15: " + Arrays.toString(notesHigh));
        System.out.println("Moyenne : " + sum / nbStudents);

        scanner.close();
    }

    static void exo5E() {

    }

    static void exo5F() {
        int[] array1 = {2, 5, 8, 4};
        int[] array2 = {6, 7};
        int sum = 0;

        for (int i : array1) {
            for (int j : array2) {
                sum += i * j;
            }
        }

        System.out.println(sum);
    }

    static void exo5G() {
        Scanner scanner = new Scanner(System.in);
        String value;
        double[] myArray = {};
        int index = 0;
        do {
            System.out.println("Veuillez saisir un nombre ou \"STOP\" pour arrêter la saisie");
            value = scanner.next();

            try {
                double doubleVal = Double.parseDouble(value);
                myArray = copyOf(myArray, myArray.length + 1);
                myArray[index] = doubleVal + 1;
                index++;
            } catch (NumberFormatException nfe) {
                if(!value.equals("STOP")) System.out.println("Entrée non valide, veuillez réessayer...");
            }


        } while (! value.equals("STOP"));

        System.out.println(Arrays.toString(myArray));

        scanner.close();
    }

    static void exo5HIJ() {
        Scanner scanner = new Scanner(System.in);
        double value;
        double[] myArray = {};
        int index = 0;
        do {
            System.out.println("Veuillez saisir un nombre ou \"0\" pour arrêter la saisie");
            value = scanner.nextDouble();

            myArray = copyOf(myArray, myArray.length + 1);
            myArray[index] = value;
            index++;

        } while (value != 0);

        int indexMax = 0;
        double valueMax = Integer.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] > valueMax) {
                valueMax = myArray[i];
                indexMax = i;
            }
        }

        System.out.println(Arrays.toString(myArray));
        System.out.println("Nombre le plus grand : " + valueMax);
        System.out.println("Index : " + indexMax);

        scanner.close();
    }

    static void exo6A() {
        int[][] array = {
                {0, 18},
                {1, 45},
                {45, 48},
                {-3, 2}
        };
    }
}