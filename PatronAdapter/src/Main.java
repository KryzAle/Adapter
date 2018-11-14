/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kryz Ale
 */
public class Main {
    public static void main(String[] args)
    {
         Adaptador conversor = new Adaptador();
        conversor.ingresarPesetas( 2000 );
        conversor.ingresarPesetas( 5000 );
        conversor.ingresarPesetas( 1000 );
        System.out.println( "Total euros: " + conversor.getSaldo() );
    }
}
