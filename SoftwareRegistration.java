/*
 * Encapsulation données
 *
 * 
 * public class SoftwareRegistration {
 *
 * [ACCESSEURS]
 * getters : accès à un attribut (lecture)
 * setters : modification d'un attribut
 *
 *
 * public SoftwareRegistration(int expiration) {
 * this.mExpirationYear = expiration;
 * System.out.println("Enregistrement du produit, valide jusqu'en " +
 * this.mExpirationYear);
 * }
 * 
 * private int mExpirationYear;
 * 
 * public int getExpirationYear() {
 * return this.mExpirationYear;
 * }
 * 
 * public void setExpirationYear(int expiration) {
 * this.mExpirationYear = expiration;
 * }
 * }
 * 
 *
 * public class SoftwareRegistration {
 * public SoftwareRegistration(int expiration) {
 * if (mNumberOfRegistrations > 0) {
 * this.mExpirationYear = expiration; //this on l'utilise pour un attribut
 * mNumberOfRegistrations--;
 * 
 * System.out.println("Logiciel valide (expiration : " + this.mExpirationYear +
 * ")");
 * System.out.println("Enregistrement restants : " +
 * this.mNumberOfRegistrations);
 * } else {
 * System.out.println("Maximum de validations effectuées !");
 * }
 * }
 * public int getExpirationYear() {
 * return this.mExpirationYear;
 * }
 * 
 * public static int getNumberOfRegistrations(){
 * return mNumberOfRegistrations;
 * }
 * private static int mNumberOfRegistrations = 5; // le static permet d'avoir
 * une variable de class
 * private int mExpirationYear;
 * }
 */
