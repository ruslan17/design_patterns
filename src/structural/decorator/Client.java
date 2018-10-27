package structural.decorator;

public class Client {

    public static void main(String[] args) {
        Printer printer = new PrinterImpl("VALUE");
        Printer printerWithQuoter = new QuotesPrinterDecorator(printer);
        Printer printerWithQuotersAndBrackets =
                new BracketPrinterDecorator(printerWithQuoter);

        printer.print();
        System.out.println("\n");
        printerWithQuoter.print();
        System.out.println("\n");
        printerWithQuotersAndBrackets.print();
    }

}

interface Printer {
    void print();
}

class PrinterImpl implements Printer {

    private String value;

    public PrinterImpl(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}

class QuotesPrinterDecorator implements Printer {

    private Printer printer;

    public QuotesPrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        System.out.print("\"");
        printer.print();
        System.out.print("\"");
    }
}

class BracketPrinterDecorator implements Printer {

    private Printer printer;

    public BracketPrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        System.out.print("[");
        printer.print();
        System.out.print("]");
    }
}
