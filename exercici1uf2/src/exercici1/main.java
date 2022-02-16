
package exercici1;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args)
    {
        Scanner teclat = new Scanner(System.in);
        
        int opcio=0;
        
        do
        {
            System.out.println("CALCULADORA");
            System.out.println("1.- SUMA");
            System.out.println("2.- RESTA");
            System.out.println("3.- MULTIPLICACIÓ");
            System.out.println("4.- DIVISIO");
            System.out.println("5.- SORTIR");
            System.out.println("Selecciona una opcio (1-5)");
            opcio = teclat.nextInt();
            String tmp = teclat.nextLine();
            switch(opcio)
            {
                case 1:
                    System.out.println("***SUMA***");
                    System.out.println("Escriu un nombre:");
                    int n1 = teclat.nextInt();
                    String tmp1 = teclat.nextLine();
                    System.out.println("Escriu un altre nombre:");
                    int n2 = teclat.nextInt();
                    String tmp2 = teclat.nextLine();
                    try
                    {
                        int resultat_suma = n1 + n2;
                        System.out.println("El resultat de la suma es: " + resultat_suma);  
                    }
                        catch(NullPointerException e)
                        {
                        System.out.println("No s'ha pogut completar, els nombres no son sencers.");
                        }
                        finally
                        {
                        System.out.println("Gracies!!");
                        }                    
                    break;
                case 2:
                    System.out.println("***RESTA***");
                    System.out.println("Escriu un nombre:");
                    int n3 = teclat.nextInt();
                    String tmp3 = teclat.nextLine();
                    System.out.println("Escriu un altre nombre:");
                    int n4 = teclat.nextInt();
                    String tmp4 = teclat.nextLine();
                    try
                    {
                        int resultat_resta = n3 - n4;
                        System.out.println("El resultat de la suma es: " + resultat_resta);  
                    }
                        catch(NullPointerException e)
                        {
                            System.out.println("No s'ha pogut completar, els nombres no son sencers.");
                        }
                        finally
                        {
                        System.out.println("Gracies!!");
                        }  
                    break;
                case 3:
                    System.out.println("***MULTIPLICACIÓ***");
                    System.out.println("Escriu un nombre:");
                    int n5 = teclat.nextInt();
                    String tmp5 = teclat.nextLine();
                    System.out.println("Escriu un altre nombre:");
                    int n6 = teclat.nextInt();
                    String tmp6 = teclat.nextLine();
                    try
                    {
                        int resultat_multiplicacio = n5 * n6;
                        System.out.println("El resultat de la suma es: " + resultat_multiplicacio);  
                    }
                        catch(NullPointerException e)
                        {
                            System.out.println("No s'ha pogut completar, els nombres no son sencers.");
                        }
                        finally
                        {
                        System.out.println("Gracies!!");
                        }  
                    break;
                case 4:
                    System.out.println("***MULTIPLICACIÓ***");
                    System.out.println("Escriu un nombre:");
                    int n7 = teclat.nextInt();
                    String tmp7 = teclat.nextLine();
                    System.out.println("Escriu un altre nombre:");
                    int n8 = teclat.nextInt();
                    String tmp8 = teclat.nextLine();
                    try
                    {
                        int resultat_divisio = n7 / n8;
                        System.out.println("El resultat de la suma es: " + resultat_divisio);  
                    }
                        catch(NullPointerException e)
                        {
                            System.out.println("No s'ha pogut completar, els nombres no son sencers.");
                        }
                        catch(ArithmeticException ae)
                                {
                                    System.out.println("Error Matematic!!");
                                }
                        finally
                        {
                        System.out.println("Gracies!!");
                        }  
                    break;
                case 5: 
                    System.out.println("SORTINT...");
                    break;
            }
        }
        while(opcio != 5);
    }
}
