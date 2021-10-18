package aplicattion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  //declarando o tipo de data
		
		List <Product> list = new ArrayList<> (); // criando uma lista para armazenar os produtos
		Scanner sc = new Scanner (System.in); 
		System.out.println("Informe a quantidade de  produtos"); //inicializando o programa
        int n = sc.nextInt();  // recebendo a qntd de produtos
    	
             for (int i=1; i<=n; i++) {  // percorrendo em todos os produtos. 
    	   
    	     System.out.println("Informe se o produto é comum, usado ou importado? (c/u/i) ");
    	        char ch = sc.next().charAt(0); 
    	        System.out.println("Informe o nome  ");   
    	        sc.nextLine(); 
    	        String name = sc.nextLine(); 
    	        System.out.println("Informe o Preço  ");   
    	        Double price = sc.nextDouble(); 
    	        // recebendo dados. 
    	        
    	        if (ch == 'c') {
    				list.add(new Product(name, price)); //adicionando na lista com os paramentros
    			}
    	        else if (ch == 'u') {
    	    	   System.out.print("Informe a data de manufatura (DD/MM/YYYY): ");  	  
    	    	   Date date = sdf.parse(sc.next());
    	    	   list.add(new UsedProduct(name, price, date));     	    	   	  	    	    	  
    	        }
    	        else {
    	        	System.out.print("Customs fee: ");
    				double customsFee = sc.nextDouble();
    				list.add(new ImportedProduct(name, price, customsFee));
    	        	
    	        }
    	   
    	        System.out.println();
    			System.out.println("PRICE TAGS:"); //imprimindo método das classes. 
    			for (Product prod : list) {
    				System.out.println(prod.priceTag());
    			}
    	   
       }
       	
		sc.close();
		
	}

}
