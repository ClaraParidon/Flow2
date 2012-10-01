package flow2;

/**
 *
 * @author Kirstine
 */
public class Person
{
    public String navn;
    public int adm;
    public int ana;
    public int krea;
    public int fin;

   @Override
    public String toString() {
        String res = "";
        res += "Navn: " + getNavn()
                + ": " + getAdm() + ", " + getAna() + ", " + getKrea() + ", " + getFin();
        return res;
    }
    
    public String getNavn()
    {
        return navn;
    }

    public int getAdm()
    {
        return adm;
    }

    public int getAna()
    {
        return ana;
    }

    public int getKrea()
    {
        return krea;
    }

    public int getFin()
    {
        return fin;
    }

    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    public void setAdm(int adm)
    {
        this.adm = adm;
    }

    public void setAna(int ana)
    {
        this.ana = ana;
    }

    public void setKrea(int krea)
    {
        this.krea = krea;
    }

    public void setFin(int fin)
    {
        this.fin = fin;
    }
    
     public Person(String navn, int adm, int ana, int krea, int fin)
     {
         this.navn = navn;
         this.adm = adm;
         this.ana = ana;
         this.krea = krea;
         this.fin = fin;
                 
     }
}
