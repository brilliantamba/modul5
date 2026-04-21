public class MainInvoice {

    public static void main(String[] args) {

        Invoice i1 = new Invoice("Beras", 2, 75000);
        Invoice i2 = new Invoice("Minyak", 3, 25000);
        Invoice i3 = new Invoice("Gula", 4, 15000);

        Invoice[] daftarBelanja = {i1, i2, i3};

        Employee emp =
            new Employee(1001,
                         "Weewhok de Thouque",
                         5000000,
                         daftarBelanja);

        Payable[] payableObjects = new Payable[4];

        payableObjects[0] = i1;
        payableObjects[1] = i2;
        payableObjects[2] = i3;
        payableObjects[3] = emp;

        System.out.println("=== OUTPUT POLIMORFIS ===");

        for(int i=0; i<payableObjects.length; i++) {

            if(payableObjects[i] instanceof Invoice) {

                Invoice inv = (Invoice) payableObjects[i];
                inv.displayInvoice();

            }

            if(payableObjects[i] instanceof Employee) {

                Employee e = (Employee) payableObjects[i];
                e.displayEmployee();

            }
        }
    }
}