import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int pret = 35;
        String invitati;
        int oaspeti;
        String nota;
        boolean mare = false;
        Scanner inputDevice = new Scanner(System.in);
        invitati = JOptionPane.showInputDialog(null,"Introduceti numarul de invitati");
        oaspeti = Integer.parseInt(invitati);
        int total = calculator(oaspeti,pret);
        nota = Integer.toString(total);
        if (oaspeti > 50)
        {
            mare = true;
        }
        JOptionPane.showMessageDialog(null, "Carly’s makes the food that makes it a party" + '\r'+'\n' + "Pret per persoana = " + pret + '\r'+'\n'+ "Eveniment mare = " + mare + '\r'+'\n'+"Nota finala = " + nota);

    }
    public static int calculator(int oaspeti, int pret)
    {
        int total = oaspeti * pret;

        return total;
    }
}