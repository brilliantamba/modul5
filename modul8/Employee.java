public class Employee implements Payable {

    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name,
                    int salaryPerMonth, Invoice[] invoices) {

        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getTotalInvoice() {

        int total = 0;

        for(int i=0; i<invoices.length; i++) {
            total += invoices[i].getPayableAmount();
        }

        return total;
    }

    @Override
    public int getPayableAmount() {
        return salaryPerMonth - getTotalInvoice();
    }

    public void displayEmployee() {

        System.out.println("=== DATA KARYAWAN ===");
        System.out.println("No Registrasi : " + registrationNumber);
        System.out.println("Nama          : " + name);
        System.out.println("Gaji Bulanan  : " + salaryPerMonth);
        System.out.println("Total Hutang  : " + getTotalInvoice());
        System.out.println("Gaji Bersih   : " + getPayableAmount());

        System.out.println("\n=== DETAIL BELANJA ===");

        for(int i=0; i<invoices.length; i++) {
            invoices[i].displayInvoice();
        }
    }
}