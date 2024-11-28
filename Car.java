import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Car {
    private String nome;
    private String marca;
    private int anno;
    private int km;

    public Car(String nome, String marca, int anno, int km) {
        this.nome = nome;
        this.marca = marca;
        this.anno = anno;
        this.km = km;
    }

    public void anniVita() {
        int time = LocalDate.now().getYear();
        this.anno = time - anno;
    }

    public double anni() {
        return anno;
    }

    public void Dettagli() {
        System.out.println("Nome: " + nome + ", Marca: " + marca + 
                           ", Anno di immatricolazione: " + anno + 
                           ", Km percorsi: " + km);
    }

    public void anniDiVita() {
        System.out.println("Nome: " + nome + ", ha " + anno + " anni.");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Marca: " + marca + 
               ", Anno di immatricolazione: " + anno + 
               ", Km percorsi: " + km;
    }

    public static void main(String[] args) {
        // Creazione di un ArrayList di oggetti Car
        ArrayList<Car> cars = new ArrayList<>();

        // Aggiunta di oggetti Car all'ArrayList
        cars.add(new Car("Macchina1", "Marca1", 2005, 200000));
        cars.add(new Car("Macchina2", "Marca2", 2016, 150000));
        cars.add(new Car("Macchina3", "Marca3", 2018, 80000));
        cars.add(new Car("Macchina4", "Marca4", 2022, 25000));
        cars.add(new Car("Macchina5", "Marca5", 2010, 100000));
        cars.add(new Car("Macchina6", "Marca6", 2020, 50000));
        cars.add(new Car("Macchina7", "Marca7", 2012, 120000));

/*        // Stampa dell'ArrayList con ciclo foreach
        System.out.println("Stampa con foreach:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Stampa dell'ArrayList con ciclo for normale
        System.out.println("\nStampa con for normale:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        // Calcolo degli anni di vita per ciascuna macchina
        for (Car car : cars) {
            car.anniVita();
        }
        // Stampa degli anni di vita di ciascuna macchina
        System.out.println("\nAnni di vita:");
        for (Car car : cars) {
            car.anniDiVita();
        } */
try (Scanner input = new Scanner(System.in)) {
	Scanner scanner = new Scanner(System.in);
	int scelta = 0;
    boolean running = true;	
	while (running) {
        System.out.println("--- Menu ---");
        System.out.println("1. Aggiungi una nuova auto");
        System.out.println("2. Visualizza dettagli di un'auto a scelta");
        System.out.println("3. Visualizza anni di vita di un'auto a scelta");
        System.out.println("4. Esci");
        System.out.print("Scegli un'opzione: ");
        scelta = scanner.nextInt();
        scanner.nextLine();
		
        switch (scelta) {
        
        case 1:
        	System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Anno di immatricolazione: ");
            int anno = scanner.nextInt();

            System.out.print("Km percorsi: ");
            int km = scanner.nextInt();
            scanner.nextLine(); 

            Car newCar = new Car(nome, marca, anno, km);
            cars.add(newCar);
            System.out.println("Macchina aggiunta con successo!");
            
            System.out.println("Lista auto:");
            for (Car car : cars) {
                System.out.println(car);
            }
            break;
            
	    case 2:
			System.out.println("Scrivi il nome dell'auto: ");
			String searchName = scanner.nextLine();
	        boolean found = false;
	
	        for (Car car : cars) {
	            if (car.nome.equalsIgnoreCase(searchName)) {
	                System.out.println("\nDettagli:");
	                car.Dettagli();
	                found = true;
	                break;
	            }
	        }
	
	        if (!found) {
	            System.out.println("Auto non trovata.");
	        }
	        
	    case 3:
			System.out.println("\nScrivi il nome dell'auto: ");
			String searchNameA = scanner.nextLine();
	        boolean foundA = false;
	
	        for (Car car : cars) {
	            if (car.nome.equalsIgnoreCase(searchNameA)) {
	            	car.anniVita();
	            	car.anniDiVita();
	                foundA = true;
	                break;
	            }
	        }
	        if (!foundA) {
	            System.out.println("Auto non trovata.");
	        }
	        
	    case 4: 
            System.out.println("Programma terminato");
            running = false;
            break;

        default: 
            System.out.println("Scelta non valida. Riprova.");
            break;
            }
        
        if (running) {
            System.out.println("\nPremi INVIO per tornare al menu principale.");
            scanner.nextLine();
        }
	}

        scanner.close();
    }
}
}  

    
    
    
    
    