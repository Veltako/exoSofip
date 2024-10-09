/*
 * les truc à savoir:
 * 
 * bases numérique : décimale (10 -> 0 à 9)
 * binaire (2 -> 0 à 1)
 * octale (8 -> 0 à 7)
 * hexadécimale (16 -> 0 à F)
 * 
 * binaire -> 0b11001111 préfix = 0b
 * octale -> 0755 préfix = 0
 * hexadécimale -> 0xAF55 préfix = 0xAF
 * 
 * nombre entier : 14
 * 18666 || 18_666
 * 1000000000
 * 1_000_000_000
 * _ = séparateur
 * 
 * \n : nouvelle ligne
 * \t : tabulation
 * \r : retour chariot
 * \b : retour arrière
 * \f : nouvelle page
 * \' \" \077 \xAF
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Comment écrire:
 * 
 * - Pas de caractères spéciaux, pas d'espace
 * - Commence par une lette ou un underscore (_)
 * 
 * uneVariable (camel case) préférer pour une variable
 * UneVariable (pascal case) nom des classes
 * 
 * une_variable (snake case) pas fou
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Comment tester son programme:
 * 
 * javac .\MainApp.java pour "compiler"
 * javac *.java il compile tout les fichier qui ont un .java
 * java .\MainApp pour lancer le programme
 * 
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * les opérateur, variables et constantes:
 * 
 * = Affectation
 * + Concaténation
 * 
 * == égal à
 * === égal et de même type que
 * != différent de
 * < stricement inférieur à
 * <= inférieur ou égal à
 * > stricement supérieur à
 * >= supérieur ou égal à
 * ! inverse de (négation)
 * 
 * boolean value = (24 == 24);
 * System.out.println(value);
 * 
 * int ageUtilisateur = 0; // toujours initialiser une variable
 * 
 * System.out.println(ageUtilisateur);
 * 
 * ageUtilisateur = 25; // on écrase l'ancien valeur de la variable
 * 
 * System.out.println(ageUtilisateur);
 * 
 * final int NUMBER = 26; // une constante c'est toujours "final" et nom
 * toujours en MAJUSCULES
 * 
 * System.out.println(NUMBER);
 * 
 * int goldCoins = 0;
 * System.out.println(goldCoins);
 * 
 * goldCoins += 10; // Gain de 10 pièces d'or
 * System.out.println(goldCoins);
 * 
 * goldCoins += 100; // Gain de 100 pièce d'or
 * System.out.println(goldCoins);
 * 
 * 
 * && ET
 * || OU
 * 
 * + - * / % ( )
 * += -= *= /= %= ---> A = A + x
 * A += x
 * 
 * A = A - x
 * A -= x
 * 
 * A++ | ++A
 * A-- | --A
 * 
 * A++ post-incrémentation A = A + 1 on copie A
 * ++A pré-incrémentation A = (A + 1) il fait d'abord A + 1 avant d'affecter la
 * valeur de A
 * 
 * A-- post-décrémentation
 * --A pré-décrémentation
 * 
 * int bn1 = 1;
 * int nb2 = nb1++; // nb2 = nb1, puis nb1 += 1
 * int nb2 = ++nb1; // nb1 += 1, puis nb2 = nb1
 * 
 * 
 * boolean result = 14 < 25;
 * System.out.println(result); //retourne TRUE
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * les conditions :
 * 
 * if(value == 24){ // les {} ne sont pas obligatoire SI IL N'Y A QU'UNE SEULE
 * INSTRUCTION, mais il est préférable de mettre {} car si il nous manque des
 * neurrones, on va avoir des erreurs dans la compilation.
 * System.out.println("value = 24");
 * }
 * 
 * 
 * int value = -6;
 * 
 * if(value < 0)
 * {
 * System.out.println("value < 0");
 * 
 * if(value == -6)
 * System.out.println("value = -6");
 * }
 * else if(value > 100)
 * {
 * System.out.println("value < 0");
 * }
 * else
 * {
 * System.out.println(value);
 * }
 * 
 * // si il y a plus de cinq if il est préférable d'utiliser un switch (surtout
 * pour la lisibilité)
 * int option = 1;
 * 
 * switch(option) //les {} sont obligatoires
 * {
 * case 1: // case 1; = if(option == 1)
 * System.out.println("option = 1");
 * break;
 * 
 * default:
 * System.out.println("option != 1");
 * break;
 * }
 * 
 * String choice = "y"; // on peut aussi vérifier du texte
 * 
 * switch(choice)
 * {
 * case "y":
 * //if(choice == "y")
 * System.out.println("oui");
 * break;
 * 
 * case "n":
 * //if(choice == "n")
 * System.out.println("non")
 * break;
 * 
 * default:
 * //choice != "y" && choice != "n"
 * System.out.println("ni oui, ni non");
 * break;
 * }
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * les boucles:
 * // avec les boucles on peut par exemple vérifier si un nom d'utilisateur ne
 * // dépasse pas 25 charactères
 * // int i = 0;
 * 
 * /*
 * while (i != 10) {
 * 
 * if (i == 5)
 * {
 * // break; // il va interrompe la boucle et passe à la suite du code
 * continue; // il saute le code qui suit
 * }
 * System.out.println(i);
 * i++; // ou i += 1, si on oublie d'incrémenter ça fait une boucle infini
 * }
 *
 *
 * do { // dans le dowhile on va au minimum faire ce qu'il y a dans le do avant
 * de
 * // vérifier la condition du while
 * i++;
 * if (i == 5) {
 * continue;
 * }
 * System.out.println(i);
 * } while (i != 10);
 *
 *
 * for(int i = 0; i != 10; i++) { // on utilise plus FOR pour du parcours
 * System.out.println(i);
 * }
 * 
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * // construction d'une classe (voir aussi le fichier Cat.java)
 * 
 * // public // la classe est accesible partout
 * // private // la classe elle ne sera pas accesible
 * 
 * // généralement un fichier une classe
 * // une classe java par fichier java
 *
 * le minimum
 * public class MainApp {
 * public static void main(String []args)
 * {
 * // le code
 * }
 * }
 * 
 * 
 * public class MainApp {
 * public static void main(String[] args) {
 * Cat miaou = new Cat();
 * Cat miaou2 = new Cat();
 * }
 * }
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// attribut :
/*
 * public class MainApp {
 * 
 * public static void main(String[] args) {
 * Cat c = new Cat("Kito", 1);
 * Cat c2 = new Cat("Felix", 2);
 * }
 * }
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * surchage de méthode on peut utiliser deux méthodes avec le même nom mais avec
 * des paramètres différent et le type de retours est différents
 * 
 * public class MainApp {
 * public static void main(String[] args) {
 * Player p1 = new Player();
 * Player p2 = new Player("Jason");
 * Player p3 = new Player("Jason", 100);
 * p1.Attack();
 * System.out.println(sum(2, 5));
 * System.out.println(sum(2.3, 5.6));
 * }
 * 
 * public static int sum(int a, int b) {
 * return a + b;
 * }
 * 
 * public static double sum(double a, double b) {
 * return a + b;
 * }
 * }
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Encapsulation données
 * public class MainApp {
 * 
 * public static void main(String[] args) {
 * SoftwareRegistration sr = new SoftwareRegistration(2026);
 * 
 * System.out.println("ENREGISTREMENTS : " +
 * SoftwareRegistration.getNumberOfRegistrations());
 * 
 * SoftwareRegistration sr2 = new SoftwareRegistration(2045);
 * 
 * System.out.println("ENREGISTREMENTS : " +
 * SoftwareRegistration.getNumberOfRegistrations());
 * 
 * SoftwareRegistration sr3 = new SoftwareRegistration(2050);
 * 
 * System.out.println("ENREGISTREMENTS : " +
 * SoftwareRegistration.getNumberOfRegistrations());
 * 
 * //sr.setExpirationYear(2050);
 * System.out.println(sr.getExpirationYear());
 * }
 * }
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* Tableaux : 
 * public class MainApp {
 * 
 * public static void main(String[] args) {
 * // int tab[] = new int []{1, 2, 3}; un tableau avec des valeurs assignées
 * // int tab[] = {1, 2, 3}; on peut l'écrire comme ça aussi
 * // int tab[] = new int [3] il y a trois tableaux
 * // int[] tab, tab2; tous seront des tableaux
 * // int tab[], tab2; uniquement tab[] sera un tableau et tab2 sera une
 * variable
 * // de type int
 * 
 * int tab[] = { 1, 2, 3 };
 * 
 * for (int i = 0; i < tab.length; i++) {
 * System.out.println(tab[i]);
 * }
 * 
 * for (int el : tab) { // la boucle for each en plus optimiser qu'en php
 * System.out.println(el);
 * }
 * 
 * //int[][] tab2D = new int[2][3];
 * int[][] tab2D =
 * {
 * {1,2,3},
 * {4,5,6}
 * };
 */
// System.out.println(tab2D[1/* deuxième ligne */][1/* numéro 5 donc deuxième
// chiffre */]);
/*
 * //une boucle par dimension
 * for (int i = 0; i < tab2D.length; ++i) {
 * for (int j = 0; j < tab2D[i].length; ++j) {
 * System.out.println(tab2D[i][j]);
 * }
 * }
 * for (int[] is : tab2D) {
 * for(int number : is)
 * System.out.println(number);
 * }
 * }
 * }
 */
/*
 * public class MainApp {
 * public static void printTab(int[] t)
 * {
 * for(int element : t){
 * System.out.println(element);
 * }
 * }
 * public static void main(String[] args) {
 * int[] tab = {1,2,3,4,5};
 * printTab(tab);
 * }
 * }
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
