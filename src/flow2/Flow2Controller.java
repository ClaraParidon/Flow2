/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flow2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claraparidonrasmussen
 */


public class Flow2Controller
{
    /**
     * @param args the command line arguments
     */
    private String filnavn = "person.txt";
    private ArrayList <Person> personer;
    private boolean dirty = false;
    
    public static void main(String[] args)
    {
        // TODO code application logic here
        public String get()
        {
            i=0;
            String res = "";
            
            while(i < personer.size())
            {
                Person p = personer.get(i);
                res = res + p.toString() + "\n";
                i++;
                return res;
            }
        }
        
        public void indlæsFraFil()
        {
            Scanner input = null;
        
            try
            {
                input = new Scanner(new File(filnavn));
            }
            
            catch (FileNotFoundException ex)
            {
                ex.printStackTrace();
            }
        
            personer = new ArrayList<Person>();
            while (input.hasNextPerson())
            {
                Person person = opretPerson(input.nextPerson());
//            Scanner scan = new Scanner(input.nextLine());
//            scan.useDelimiter(",");
//            String tekst = scan.next();
//            Linje linje = new Linje(tekst);
                personer.add(person);
            }
            input.close();
        }

        private Person opretPerson(String input)
        {
            Scanner c = new Scanner(input);
            c.useDelimiter(",");
            String navn = c.next();
            int adm = Integer.parseInt(c.next());
            int ana = Integer.parseInt(c.next());
            int krea = Integer.parseInt(c.next());
            int fin = Integer.parseInt(c.next());
            Person p = new Person(navn, adm, ana, krea, fin);
            return p;
        }
    }
}
