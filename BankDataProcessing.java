package Myjava;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class BankDataProcessing {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
    static ArrayList<BankAccount> Accounts = new ArrayList<>();

    public static void main(String[] args) {
        try {
            Path path = Paths.get("src/Myjava/AccountData.csv");
            readAccounts(path, true);
            Path  path2 = Paths.get("src/Myjava/BankTransData.csv");
            readTransactions(path2, true, Accounts);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static void readAccounts(Path Xpath, boolean bHead) throws IOException {
        BufferedReader bufferedReader = Files.newBufferedReader(Xpath);
        try{

        	bufferedReader.readLine();

            String line = null;

            while((line = bufferedReader.readLine()) != null) {

            	String[] arr = line.split(",");

                Accounts.add(new BankAccount(arr[0],Integer.parseInt(arr[1])));
            }
        }
        catch (IOException ioe) {
            bufferedReader.close();
            ioe.printStackTrace();
        }
        finally {
            bufferedReader.close();
        }
    }
	private static void readTransactions(Path Xpath, boolean bHead, ArrayList<BankAccount> Xaccounts) throws IOException {

        try{

        	for(int i = 0; i < Xaccounts.size(); i++) {

            	InputStream input;

                input = Files.newInputStream(Xpath);

                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                reader.readLine();

                String s;

                System.out.println("Account for " + Xaccounts.get(i).getAcctname() + ", " + Xaccounts.get(i).getAcctnum());

                double total = 0;
                
                while((s = reader.readLine()) != null) {

                	String[] arr = s.split(",");

                    if(Xaccounts.get(i).getAcctnum() == Integer.parseInt(arr[0])) {
                        if(arr[2].equals("c")) {
                            System.out.println("Transaction Date: " + arr[1].formatted(formatter) + ", Credit = " + arr[3]);
                            total += Integer.parseInt(arr[3]);
                        }else if(arr[2].equals("d")){
                            System.out.println("Transaction Date: " + arr[1].formatted(formatter) + ", Debit = " + arr[3]);
                            total -= Integer.parseInt(arr[3]);
                        }
                    }
                }

                Xaccounts.get(i).setBalance(total);
                System.out.println(Xaccounts.get(i).toString());
                System.out.println("------------------------------------------------------------");
                reader.close();
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}

