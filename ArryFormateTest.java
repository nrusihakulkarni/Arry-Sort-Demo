package TestData;


// Print 3rd highest number from string (separated by space )
// in 6 8 9 2 43 3 5 42 15
// Expiated op 6


import java.util.*;


public class ArryFormateTest {
    void ThirdHighestNumber(String getNumber) {
        try {
        String[] number = getNumber.split(" ");
        List<Integer> inputNUmber = new ArrayList<Integer>();

        for (String num : number) {
            int getnumber = Integer.parseInt(num);
            if (getnumber % 2 == 0) {
                inputNUmber.add(getnumber);
            }
        }

        Collections.sort(inputNUmber);

            System.out.println("3rd Highest Number =  " + inputNUmber.get(inputNUmber.size() - 3));
        } catch (Exception e) {
            System.err.println("No such elements ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 9 numbers with space saparated ");
        String getNumber = scanner.nextLine();

        ArryFormateTest arryFormateTest = new ArryFormateTest();
        arryFormateTest.ThirdHighestNumber(getNumber);


    }
}
